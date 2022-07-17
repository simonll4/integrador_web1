package ar.edu.iua.web_services.controladores.plan;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.negocio_webservices.academico.plan.BuscarPlanesImpl_ws;
import ar.edu.iua.util.UtilTranslate;
import ar.edu.iua.web_services.util.utilWebServices;

public class BuscarPlanesHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String contextPath = exchange.getHttpContext().getPath();
        URI uri = exchange.getRequestURI();
        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = utilWebServices.leerParametrosConsulta(path);
        String body = utilWebServices.leerBody(exchange);
        
        try {
            ejecutarRespuesta(exchange, params, body);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            String msg = "504 ERROR INTERNO";
            exchange.sendResponseHeaders(504,0);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }

    }

    private void ejecutarRespuesta(HttpExchange exchange, Map<String, String> params, String body)
            throws IOException {

        BuscarPlanesImpl_ws buscador = new BuscarPlanesImpl_ws();
        Gson gson = new Gson();
        String msg = "{\n \"RESULTADOS\": ";

        for (int i=0; i < params.values().size(); i++) {
            Object[] array = params.values().toArray();
            String value = (String)array[i];
            try{
                if(params.values().size() > 1 && i < params.values().size()-1){
                    String valor = UtilTranslate.traducirCadena(value);
                    msg += gson.toJson(buscador.buscar(valor));
                    msg += ", \"Resultado "  + (i+1) + "\"" + ": ";
                }
                else{
                    String valor = UtilTranslate.traducirCadena(value);
                    msg += gson.toJson(buscador.buscar(valor));
                }
                
            }catch(BuscarPlanEx e){
                System.out.println(e.getMessage());
                msg = "204 NO CONTENT: no hay resultados para la busqueda";
                exchange.sendResponseHeaders(204,0);
                OutputStream os = exchange.getResponseBody();
                os.write(msg.getBytes());
                os.close();  
            }
        }

        msg += "\n}";

        msg = UtilTranslate.traducirCadena(msg);
        
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();

    }

}
