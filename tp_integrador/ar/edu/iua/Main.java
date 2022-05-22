package ar.edu.iua;

import ar.edu.iua.Excepciones.ObjetoEx;
import ar.edu.iua.util.Pruebas;

public class Main {

    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");
        
        Pruebas pruebas = new Pruebas();
        try {
            pruebas.probar();
        } catch (ObjetoEx e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nFin de main");
        
    }

}