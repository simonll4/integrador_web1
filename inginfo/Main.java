package inginfo;

//clases propias
import inginfo.*;

//clases api
import java.util.*;
import java.text.*;
import java.io.*;

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

        String cadena;
        Scanner consola = new Scanner(System.in);

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

    public static void showStudents(Students[] array) {
        System.out.println("LISTADO DE ALUMNOS");
        System.out.println("ID" + "\t" + "NOMBRE" + "\t\t\t\t" +
                "EDAD" + "\t\t" + "ORIGEN" + "\t\t" + "ANIO DE ESTUDIO");
        for (int ii = 0; ii < array.length; ii++) {
            System.out.println(array[ii].getId() + "\t"
                    + array[ii].getName() + "\t\t" + array[ii].getAge() +
                    "\t\t" + array[ii].getOrigin() + "\t\t" + array[ii].getYearstudy());
        }
    }

    public static Students[] sortStudents(Students[] iua) {
        Arrays.sort(iua);
        return iua;
    }

    public static void search(Students[] iua) {
        String search;
        int aux;
        Scanner dataEntry = new Scanner(System.in);
        System.out.println("Ingrese dato");
        search = dataEntry.nextLine();
        String prueba1,prueba2;

        if (search.matches("[+-]?\\d*(\\.\\d+)?")) {
            aux = Integer.parseInt(search);
            for (int ii = 0; ii < iua.length; ii++) {
                if (iua[ii].getId() == aux || iua[ii].getAge() == aux || iua[ii].getYearstudy() == aux) {
                    System.out.println("\n\n" + iua[ii].getId() + "\t"
                            + iua[ii].getName() + "\t\t" + iua[ii].getAge()
                            + "\t\t" + iua[ii].getOrigin() + "\t\t\t" + iua[ii].getYearstudy() + "\n");
                }
            }
        }
        if (search.matches("^[a-zA-Z]*$")) {
            search = search.toLowerCase();
            for (int ii = 0; ii < iua.length; ii++) {
                prueba1 = iua[ii].getName().toLowerCase().substring(0, search.length());
                prueba2 = iua[ii].getOrigin().toLowerCase().substring(0, search.length());
                if (prueba1.matches(search)
                        || prueba2.matches(search)) {
                    System.out.println("\n\n" + iua[ii].getId() + "\t"
                            + iua[ii].getName() + "\t\t" + iua[ii].getAge()
                            + "\t\t" + iua[ii].getOrigin() + "\t\t\t" + iua[ii].getYearstudy() + "\n");
                }
            }
        }

    }
}
