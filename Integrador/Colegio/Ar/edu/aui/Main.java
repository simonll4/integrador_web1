package Integrador.Colegio.Ar.edu.aui;

import java.io.Console;
import java.util.*;
import Integrador.Colegio.Ar.edu.aui.model.*;
import Integrador.Colegio.Ar.edu.aui.front.*;

public class Main {
    public static void main(String[] args){
        Students[] iua = new Students[5];
        Students[] wanted = new Students[5];
        Search searched = new Search();
        int option = 0;

        // carga de arreglo iua
        iua[0] = new Students(1, "Matias", "Carvajall", 24, "Rosario", 5);
        iua[1] = new Students(2, "Narciso", "Rodriguez", 18, "Cordoba", 1);
        iua[2] = new Students(3, "Franco", "Ipollitti", 21, "Carlos Paz", 3);
        iua[3] = new Students(4, "Nicolas", "Gutierrez", 20, "Cordoba", 2);
        iua[4] = new Students(5, "Martin", "Rodriguez", 19, "La Falda", 2);

        Scanner console = new Scanner(System.in);

        do {
            System.out.println("****Gestion de alumnos IUA****");
            System.out.println("0-salir.");
            System.out.println("1-Buscar.");
            System.out.println("2-Ordenar.");
            option = console.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    searched.searchByData(iua);
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("ingrese un opcion correcta por favor");
            }
        } while (option != 0);
    }
}



