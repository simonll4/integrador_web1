package ingweb;

import java.util.*;

import ingweb.Integrador.Colegio.Ar.edu.aui.*;

/*public class Search {
    public Search() {
    } 
    public void searchByData(Students[] aui){
        String search;
        int aux;
        Scanner dataEntry = new Scanner(System.in);
        System.out.println("Ingrese dato");
        search = dataEntry.nextLine();

        
        if (search.matches("[+-]?\\d*(\\.\\d+)?")) {
            aux = Integer.parseInt(search);
            for (int ii = 0; ii < aui.length; ii++) {
                if (aui[ii].getId() == aux || aui[ii].getAge() == aux || aui[ii].getYearstudy() == aux) {
                    System.out.println("\n" + aui[ii].getId() + "\t"
                            + aui[ii].getFirstname() + "\t\t" + aui[ii].getLastname() + "\t\t"  +  aui[ii].getAge()
                            + "\t\t" + aui[ii].getOrigin() + "\t\t\t" + aui[ii].getYearstudy() + "\n");
                }
            }
        }
        if (search.matches("^[a-zA-Z]*$")) {
            search = search.toLowerCase();
            for (int ii = 0; ii < aui.length; ii++) {
                if (aui[ii].getFirstname().toLowerCase().substring(0, search.length()).matches(search)
                        || aui[ii].getLastname().toLowerCase().substring(0, search.length()).matches(search) 
                            || aui[ii].getOrigin().toLowerCase().substring(0, search.length()).matches(search)) {
                    System.out.println("\n" + aui[ii].getId() + "\t"
                            + aui[ii].getFirstname() + "\t\t" + aui[ii].getLastname() + "\t\t" + aui[ii].getAge()
                            + "\t\t" + aui[ii].getOrigin() + "\t\t\t" + aui[ii].getYearstudy() + "\n");
                }
            }
        }
        else{
            System.out.println("NO SE ECONTRARON RESULTADOS EN LA BUSQUEDA");
        }
    }
}



*/