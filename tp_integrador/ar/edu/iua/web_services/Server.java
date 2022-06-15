package ar.edu.iua.web_services;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import ar.edu.iua.excepciones.web_services_ex.serverEx;
import ar.edu.iua.web_services.controladores.*;



public class Server {


    public static void startServer() throws serverEx{

        try{
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            server.createContext("/buscarPlan", new buscarPlanHandler()); //http://localhost:8080/buscarPlan
            server.createContext("/buscarPlanes", new buscarPlanesHandler() ); //http://localhost:8080/buscarPlanes
            server.createContext("/borrarPlan", new borrarPlanHandler());//http://localhost:8080/borrarPlan

            server.setExecutor(null); // creates a default executor
            server.start();            
            
            System.out.print("Servidor escuchando en ");
            System.out.print(server.getAddress().getHostName().equals("0:0:0:0:0:0:0:0") ? "localhost" : server.getAddress().getHostString());            
            System.out.print(":");
            System.out.print(server.getAddress().getPort());
            System.out.println();


        }
        catch(IOException e){
            throw new serverEx("404: Not found");
        }

    }

}
