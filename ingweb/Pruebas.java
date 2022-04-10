package ingweb;

import java.util.*;

public class Pruebas {
    public static void main(String args[]) {

        /*
         * for each
         * int[] array = new int[3];
         * array[0] = 1;
         * array[1] = 5;
         * array[2] = 778;
         * 
         * for(int ii : array){
         * System.out.println(ii);
         * }
         */

        /*
         * List arrayList = new ArrayList();
         * 
         * arrayList.add(1);
         * arrayList.add(2);
         * arrayList.add(2.87);
         * arrayList.add('c');
         * arrayList.add("hola mundo");
         * 
         * System.out.print("");
         * for(int ii=0;ii<arrayList.size();ii++){
         * System.out.println(arrayList.get(ii));
         * }
         * 
         * System.out.print("");
         * System.out.print(arrayList);
         */

        String num1 = "123-456";
        String num2 = "789-432";

        String[] numeros = num1.split("-");

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

    }
}
