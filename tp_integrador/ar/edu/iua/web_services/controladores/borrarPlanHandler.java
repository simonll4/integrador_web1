package ar.edu.iua.web_services.controladores;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanImpl;
import ar.edu.iua.web_services.util.utilWebServices;

public class borrarPlanHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        
        String contextPath = exchange.getHttpContext().getPath();
        URI uri = exchange.getRequestURI();
        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = utilWebServices.leerParametrosConsulta(path);
        String body = utilWebServices.leerBody(exchange);

        try {
            ejecutarRespuesta(exchange, params, body);
        } catch (BorrarPlanEx | IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void ejecutarRespuesta(HttpExchange exchange,Map<String, String> params,String body) throws BorrarPlanEx, IOException{
        Plan borrado = new PlanImpl();
        int anio = Integer.parseInt(params.get("anio"));

        borrado.setAnio(anio);
        BorrarPlanImpl borrador = new BorrarPlanImpl();
        borrador.borrar(borrado);

        String msg = "200: Se borro el plan";
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();

    }
    
}
