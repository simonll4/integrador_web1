package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BaseDeDatos {

    private static List<Plan> planes = new ArrayList<Plan>();

    public static int planesSize (){
        return planes.size();
    }

    public static Plan getPlan (int index) throws CloneNotSupportedException{
        
            return (Plan)planes.get(index).clone();
    }

    public static boolean setPlan (int index, Plan plan) throws CloneNotSupportedException{
        boolean bandera = false;
    
        planes.set(index, (Plan)plan.clone());
        bandera = true;
        
        return bandera;
    }
    
    public static boolean addPlan (Plan plan) throws CloneNotSupportedException{
        boolean bandera = false;
        
        planes.add((Plan) plan.clone());
        bandera = true;
       
        return bandera;
    }

    public static void removePlan (int index){
        planes.remove(index);
    }

    public static List<Plan> getList () throws CloneNotSupportedException{
        List<Plan> clonePlanes = new ArrayList<>();
        for(Plan plan:planes){
            clonePlanes.add((Plan)plan.clone());
        }
        return clonePlanes;
    }

}
