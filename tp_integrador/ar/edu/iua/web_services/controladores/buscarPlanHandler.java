package ar.edu.iua.web_services.controladores;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanImpl;
import ar.edu.iua.web_services.util.utilWebServices;

public class buscarPlanHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String contextPath = exchange.getHttpContext().getPath();
        URI uri = exchange.getRequestURI();
        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = utilWebServices.leerParametrosConsulta(path);
        String body = utilWebServices.leerBody(exchange);

        try{
            ejecutarRespuesta(exchange, params, body);
        }catch(Exception e){
            System.out.println(e.getMessage());
            String msg = "504 ERROR INTERNO";
            exchange.sendResponseHeaders(504,0);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
     
    }

    private void ejecutarRespuesta(HttpExchange exchange,Map<String, String> params,String body) throws IOException{
        
        
        BuscarPlanImpl buscador = new BuscarPlanImpl();
        int anio = Integer.parseInt(params.get("anio"));
        PlanImpl buscado = null; 
        
       try {
            buscado = (PlanImpl)buscador.buscar(anio);
        } catch (BuscarPlanEx e) {
            System.out.println(e.getMessage());
            String msg = "204 NO CONTENT: no hay resultados para la busqueda";
            exchange.sendResponseHeaders(204,0);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        } 

        String msg = buscado.fullToJson();

        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
        
    }
    
}
