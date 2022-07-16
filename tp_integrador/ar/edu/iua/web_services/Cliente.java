package ar.edu.iua.web_services;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;

import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Cliente {


public static void ejemploBorrarPlanes() throws URISyntaxException, CloneNotSupportedException{

        String url = "http://localhost:8080/borrarPlanes?anio=2018&anio=2001";

        List<Plan_ws> planesBorrar = new ArrayList<>();
        planesBorrar.add(BaseDeDatos.getPlan_ws(0));
        planesBorrar.add(BaseDeDatos.getPlan_ws(1));


        Gson gson = new Gson();
        String jsonString = gson.toJson(planesBorrar);

        byte[] jsonByteArray = jsonString.getBytes();

        HttpRequest peticion = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .version(HttpClient.Version.HTTP_2)
                        .header("Content-Type", "application/json")
                        .header("charset", "UTF-8")
                        .timeout(Duration.of(30, ChronoUnit.SECONDS))
                        .DELETE()
                        .build(); 
        }
}

/*String url = "https://jsonplaceholder.typicode.com/posts/101";

        HttpRequest peticion = HttpRequest.newBuilder()
                .uri(new URI(url))
                .version(HttpClient.Version.HTTP_2)
                .header("Content-Type", "application/json")
                .header("charset", "UTF-8")
                .timeout(Duration.of(30, ChronoUnit.SECONDS))
                .DELETE()
                .build();

        // ---

        HttpResponse<String> respuesta = HttpClient.newBuilder().proxy(ProxySelector.getDefault())
                .build()
                .send(peticion, BodyHandlers.ofString());

        // ---

        int codigoHttpRespuesta = respuesta.statusCode();

        System.out.println("Status Code: " + codigoHttpRespuesta);

        String cuerpo = respuesta.body();

        if (codigoHttpRespuesta == 200) {
            System.out.println(cuerpo);
        } else {
            System.err.println("ERROR:");
            System.err.println(cuerpo);
        }
        */