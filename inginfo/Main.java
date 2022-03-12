package inginfo;

//clases propias
import inginfo.*;
//clases api
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // definiciones e inicializaciones
        Students[] iua = new Students[5];
        int option = 0;

        // carga de arreglo iua
        iua[0] = new Students(1, "Matias Carvajall", 24, "Rosario", 5);
        iua[1] = new Students(2, "Agustin Rodriguez", 18, "Cordoba", 1);
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
        System.out.println("3-Buscar alumnos.");
        option = dataEntry.nextInt();
        return option;
    }

    public static void showStudents(Students[] iua) {
        System.out.println("LISTADO DE ALUMNOS");
        System.out.println("ID" + "\t" + "NOMBRE" + "\t\t\t\t" + "EDAD" + "\t\t" + "ORIGEN" + "\t\t" + "ANIO DE ESTUDIO");
        for (int ii = 0; ii < iua.length; ii++) {
            System.out.println(iua[ii].getId() + "\t" 
            +  iua[ii].getName() + "\t\t" + iua[ii].getAge() +
            "\t\t" + iua[ii].getOrigin() + "\t\t" + iua[ii].getYearstudy());
        }
    }

    public static Students[] sortStudents(Students[] iua){
        Arrays.sort(iua);
        return iua;
    }
}
