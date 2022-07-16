package ar.edu.iua.web_services.controladores;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImpl_ws;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.negocio_webservices.academico.plan.BorrarPlanesImpl_ws;
import ar.edu.iua.negocio_webservices.academico.plan.BorrarPlanes_ws;
import ar.edu.iua.negocio_webservices.academico.plan.BuscarPlanImpl_ws;
import ar.edu.iua.web_services.util.utilWebServices;

public class BorrarPlanesHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String contextPath = exchange.getHttpContext().getPath();
        URI uri = exchange.getRequestURI();
        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = utilWebServices.leerParametrosConsulta(path);
        String body = utilWebServices.leerBody(exchange);

        try {
            ejecutarRespuesta(exchange, params, body);
        } catch (BuscarPlanEx|IOException e) {
            System.out.println(e.getMessage());
            String msg = "504 ERROR INTERNO";
            exchange.sendResponseHeaders(504,0);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }

    }

    private void ejecutarRespuesta(HttpExchange exchange,Map<String, String> params,String body) throws BuscarPlanEx,IOException{
        List<Plan_ws> borrados = new ArrayList<>();
        
        for (String value : params.values()) {
            Plan_ws plan = new PlanImpl_ws();
            BuscarPlanImpl_ws buscador = new BuscarPlanImpl_ws();
            plan = buscador.buscar(Integer.parseInt(value));
            borrados.add(plan);
        }

        BorrarPlanes_ws borrador = new BorrarPlanesImpl_ws();
        try {
            borrador.borrar(borrados);
        } catch (BorrarPlanEx e) {
            System.out.println(e.getMessage());
            String msg = "409 ERROR DE CONFLICTO: no se pudieron borrar los planes";
            exchange.sendResponseHeaders(409,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }

        String msg = "200: Se borraron los planes";
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
    }
    

}
