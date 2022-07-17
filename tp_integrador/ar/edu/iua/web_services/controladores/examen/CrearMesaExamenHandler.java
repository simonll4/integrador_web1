package ar.edu.iua.web_services.controladores.examen;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;
import ar.edu.iua.negocio_webservices.academico.examen.CrearMesaExamenWs;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.web_services.util.utilWebServices;

public class CrearMesaExamenHandler implements HttpHandler {

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
        
        MesaExamenWs creado = new MesaExamenWs();
        creado = new Gson().fromJson(body, MesaExamenWs.class);

        CrearMesaExamenWs creador = new CrearMesaExamenWs();

        try {
            System.out.println(BaseDeDatos.mesasSizeWs());
            creador.crear(creado);
            System.out.println(BaseDeDatos.mesasSizeWs());            
        } catch (CrearMesaEx e) {
            System.out.println(e.getMessage());
            String msg = "409 ERROR DE CONFLICTO: no se pudo crear la mesa";
            exchange.sendResponseHeaders(204,0);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
        
        String msg = "200: Se creo la mesa";
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
        
    }
    
}
