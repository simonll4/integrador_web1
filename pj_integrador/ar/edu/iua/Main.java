package pj_integrador.ar.edu.iua;
import pj_integrador.ar.edu.iua.negocio.academico.plan.*;
import pj_integrador.ar.edu.iua.modelo.academico.plan.*;

public class Main {
    public static void main (String[] arg){
        Plan[] planes = new Plan[1];
        planes = UtilPlan.buildPlanes();
        System.out.println("inicio");
        System.out.println(planes[0].getAnios().get(1).getNombre());
        System.out.println(planes[0].getAnios().get(2).getNombre());
    }
 
}
