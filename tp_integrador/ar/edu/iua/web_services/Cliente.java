package ar.edu.iua.web_services;


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

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Cliente {


public static void ejemploBorrarPlanes() throws URISyntaxException, CloneNotSupportedException{

        String url = "http://localhost:8080/borrarPlanes?anio=2018&anio=2001";

        List<Plan> planesBorrar = new ArrayList<>();
        planesBorrar.add(BaseDeDatos.getPlan(0));
        planesBorrar.add(BaseDeDatos.getPlan(1));


        Gson gson = new Gson();
        String jsonString = gson.toJson(planesBorrar);
        System.out.println(jsonString);

        /*String jsonString = "";
        for(Plan p1: planesBorrar){
                jsonString += p1.fullToJson();
        }*/

        byte[] jsonByteArray = jsonString.getBytes();

        /*HttpRequest peticion = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .version(HttpClient.Version.HTTP_2)
                        .header("Content-Type", "application/json")
                        .header("charset", "UTF-8")
                        .timeout(Duration.of(30, ChronoUnit.SECONDS))
                        .POST(HttpRequest.BodyPublishers.ofByteArray(jsonByteArray))
                        .build(); */
}

}
