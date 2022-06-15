package ar.edu.iua;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.util.Pruebas;
import ar.edu.iua.web_services.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");
        
        Pruebas pruebas = new Pruebas();
        try {
            pruebas.probar();
            Server.startServer();
        } catch (ObjetoEx e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nFin de main");
        
    }

}