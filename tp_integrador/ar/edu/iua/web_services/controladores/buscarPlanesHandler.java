package ar.edu.iua.web_services.controladores;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.util.UtilTranslate;
import ar.edu.iua.web_services.util.utilWebServices;

public class buscarPlanesHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String contextPath = exchange.getHttpContext().getPath();
        URI uri = exchange.getRequestURI();
        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = utilWebServices.leerParametrosConsulta(path);
        String body = utilWebServices.leerBody(exchange);

        try {
            ejecutarRespuesta(exchange, params, body);
        } catch (BuscarPlanEx e) {
            System.out.println(e.getMessage());
        }

    }

    private void ejecutarRespuesta(HttpExchange exchange, Map<String, String> params, String body)
            throws BuscarPlanEx, IOException {

        BuscarPlanesImpl buscador = new BuscarPlanesImpl();

        String msg = "{\n \"resultado\": [\n ";
        int tamanio = 0;

        for (Map.Entry<String, String> entry : params.entrySet()) {
            for (int ii = 0; ii < buscador.buscar(entry.getValue()).size(); ii++) {
                String valor = UtilTranslate.traducirCadena(entry.getValue());
                if (ii == buscador.buscar(entry.getValue()).size() - 1) {
                    msg += buscador.buscar(valor).get(ii).fullToJson();
                } else {
                    msg += buscador.buscar(valor).get(ii).fullToJson() + ", ";
                }

            }
            if (tamanio != params.size() - 1) {
                msg += ", ";
            }
            tamanio++;
        }

        msg += " ]\n }";
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();

    }

}
