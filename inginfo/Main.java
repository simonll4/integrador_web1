package inginfo;

//clases propias
import inginfo.*;

import java.io.InputStream;
//clases api
import java.util.*;
import java.text.*;
import java.text.Normalizer.Form;

public class Main {
    public static void main(String[] args) {
        // definiciones e inicializaciones
        Students[] iua = new Students[5];
        Students[] wanted = new Students[5];
        int option = 0;

        // carga de arreglo iua
        iua[0] = new Students(1, "Matias Carvajall", 24, "Rosario", 5);
        iua[1] = new Students(2, "Narciso Rodriguez", 18, "Cordoba", 1);
        iua[2] = new Students(3, "Franco Ipollitti", 21, "Carlos Paz", 3);
        iua[3] = new Students(4, "Nicolas Gutierrez", 20, "Cordoba", 2);
        iua[4] = new Students(5, "Martin Rodriguez", 19, "La Falda", 2);

        do {
            option = menu();
            switch (option) {
                case 0:
                    break;
                case 1:
                    showStudents(iua);
                    break;
                case 2:
                    sortStudents(iua);
                    showStudents(iua);
                    break;
                case 3:
                    search(iua);
                    break;
                default:
                    System.out.println("ingrese un opcion correcta por favor");
            }
        } while (option != 0);

    }

    public static int menu() {
        int option;
        Scanner dataEntry = new Scanner(System.in);

        System.out.println("****Gestion de alumnos IUA****");
        System.out.println("0-salir.");
        System.out.println("1-Listado de alumnos.");
        System.out.println("2-Ordenar por anio de cursado.");
        System.out.println("3-Buscar alumnos por nombre.");
        option = dataEntry.nextInt();
        return option;
    }

    public static void showStudents(Students[] iua) {
        System.out.println("LISTADO DE ALUMNOS");
        System.out.println("ID" + "\t" + "NOMBRE" + "\t\t\t\t" +
                "EDAD" + "\t\t" + "ORIGEN" + "\t\t" + "ANIO DE ESTUDIO");
        for (int ii = 0; ii < iua.length; ii++) {
            System.out.println(iua[ii].getId() + "\t"
                    + iua[ii].getName() + "\t\t" + iua[ii].getAge() +
                    "\t\t" + iua[ii].getOrigin() + "\t\t" + iua[ii].getYearstudy());
        }
    }

    public static Students[] sortStudents(Students[] iua) {
        Arrays.sort(iua);
        return iua;
    }

    public static void search(Students[] iua) {
        Scanner dataEntry = new Scanner(System.in);
        Students[] wanted = new Students[5];
        String word;
        String lyrics1, lyrics2;

        System.out.println("BUSCADOR DE ALUMNOS -IUA-");
        word = dataEntry.nextLine();
        

        lyrics1 = word.substring(0, 1);
        lyrics1 = lyrics1.toLowerCase();

        System.out.println("ID" + "\t" + "NOMBRE" + "\t\t\t\t" +
                "EDAD" + "\t\t" + "ORIGEN" + "\t\t" + "ANIO DE ESTUDIO");
        for (int ii = 0; ii < iua.length; ii++) {
            lyrics2 = iua[ii].getName().toLowerCase().substring(0, 1);

            if (iua[ii].getName().equalsIgnoreCase(word) || lyrics1.charAt(0) == lyrics2.charAt(0)) {
                System.out.println("\n\n" + iua[ii].getId() + "\t"
                            + iua[ii].getName() + "\t\t" + iua[ii].getAge()
                            + "\t\t" + iua[ii].getOrigin() + "\t\t\t" + iua[ii].getYearstudy() + "\n");
                wanted[ii] = iua[ii]; 
            }
            
        }
    }

}