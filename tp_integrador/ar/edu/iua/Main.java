package ar.edu.iua;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.util.Launcher;


public class Main {

    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");
        
        try {
            Launcher.launch();
        } catch (ObjetoEx e) {
            e.printStackTrace();
        }


        System.out.println("\n\nFin de main");
        
    }

}