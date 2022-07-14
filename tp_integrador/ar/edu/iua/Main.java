package ar.edu.iua;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.util.Launcher;


public class Main {

    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");

        try {
			Launcher.launch();
		} catch (ObjetoEx e) {
			System.out.println(e.getMessage());
		}


        /*
        Pruebas pruebas = new Pruebas();
        try {
            pruebas.probar();
            List<MesaExamen> mesas = GenerarEjemplosDeMesas.generarMesasAleatorias(10);
            for (MesaExamen mesa : mesas) {
                System.out.println(mesa.fullToString());
            }
        } catch (CloneNotSupportedException |ObjetoEx e) {
            e.printStackTrace();
        }

        /*Pruebas pruebas = new Pruebas();
        try {
            pruebas.probar();
            Cliente.ejemploBorrarPlanes();
            Server.startServer();
        } catch (ObjetoEx |CloneNotSupportedException|URISyntaxException e) {
            System.out.println(e.getMessage());
        }
*/
        System.out.println("\n\nFin de main");
        
    }

}