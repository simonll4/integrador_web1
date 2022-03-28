import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassA a2 = new ClassA();
        ClassB b2 = new ClassB();

        /*
         * System.out.println(a.toString());//nunca hacer por si a es nula da error
         * System.out.println(b.toString());//nunca hacer por si b es nula da error
         * System.out.println(a);//toma el metodo toString de la clase
         * System.out.println(b);
         */
        // cambio valores de atributos de las clases
        // a.x = 50;
        // b.x = 60;

        /*
         * System.out.println("");
         * System.out.println(a);
         * System.out.println(b);
         * System.out.println(a2);
         * System.out.println(b2);
         */

        //oolean c = a.equals(a2);
        //System.out.println(c);

        List l1 = new ArrayList();//combiene esta meto un obtejo arraylist dentro de una lista
        ArrayList l2 = new ArrayList();

        List<Integer> l3 = new ArrayList<Integer>();//genericos
        
    }
}
