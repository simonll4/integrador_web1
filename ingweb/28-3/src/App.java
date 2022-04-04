import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

      A a = new A();
      B b = new B();
  
      System.out.println(a);
        
      A a2 = new A();
      B b2 = new B();
      //Nunca
      //System.out.println(a.toString()); a puede ser null

      System.out.println(b);

    //   a.x = 50;
    //   b.x = 60;

    //   System.out.println(a);
    //   System.out.println(b);
        
    //   System.out.println(a2);
    //   System.out.println(b2);

    //Comparacion
    
    //   boolean bb = a == a2;
    //   System.out.println(bb);

    boolean bool = (a.equals(a2));
    System.out.println(bool);

    boolean bool2 = (b.equals(b2));
    System.out.println(bool2);

    //Listas

    //No se puede instanciar
    // List lista1 = new List();

    //Lista de objetos
    List lista2 = new ArrayList();
    ArrayList lista1 = new ArrayList();

    //Lista generica
    //List<Integer> list = new ArrayList<Integer>();

    }
  }
  
  class A{
    
    private int x = 10;
      
      public String toString(){
        return x + " ";
    }

    public boolean equals(A otro){
        if(otro == null) return false;

        return this.x == otro.x;
    }
  }
  
  class B{
      private int x = 20;
      
      public String toString(){
        return x + " ";
    }

    public boolean equals(B otro){
        if(otro == null) return false;

        return this.x == otro.x;
    }
  }
  