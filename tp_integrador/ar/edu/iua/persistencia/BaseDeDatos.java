package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

public class BaseDeDatos {

    private static List<Plan> planes = new ArrayList<Plan>();

    private static List<Plan_ws> planes_ws = new ArrayList<>();

    private static List<MesaExamen> mesasExamen = new ArrayList<>();

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

//////////////////////////////////////////////////////////////////////////////////
////////////////////////// Mesas de Examen ///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

    public static int mesasSize (){
        return mesasExamen.size();
    }

    public static boolean addMesa (MesaExamen mesa) throws CloneNotSupportedException{
        boolean bandera = false;
        
        mesasExamen.add((MesaExamen) mesa.clone());
        bandera = true;

        return bandera;
    }

    public static MesaExamen getMesa (int index) throws CloneNotSupportedException{
        
        return (MesaExamen)mesasExamen.get(index).clone();
    }

    public static List<MesaExamen> getListMesas () throws CloneNotSupportedException{
        List<MesaExamen> cloneMesas = new ArrayList<>();
        for(MesaExamen mesa:mesasExamen){
            cloneMesas.add((MesaExamen)mesa.clone());
        }
        return cloneMesas;
    }

//////////////////////////////////////////////////////////////////////////////////
//////////////////////// Modelo Web Services /////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

    public static int planesSize_ws (){
        return planes_ws.size();
    }

    public static Plan_ws getPlan_ws (int index) throws CloneNotSupportedException{
        
        return (Plan_ws)planes_ws.get(index).clone();
    }

    public static boolean setPlan_ws (int index, Plan_ws plan) throws CloneNotSupportedException{
        boolean bandera = false;
    
        planes_ws.set(index, (Plan_ws)plan.clone());
        bandera = true;
        
        return bandera;
    }
    
    public static boolean addPlan_ws (Plan_ws plan) throws CloneNotSupportedException{
        boolean bandera = false;
        
        planes_ws.add((Plan_ws) plan.clone());
        bandera = true;

        return bandera;
    }

    public static void removePlan_ws (int index){
        planes_ws.remove(index);
    }

    public static List<Plan_ws> getList_ws () throws CloneNotSupportedException{
        List<Plan_ws> clonePlanes = new ArrayList<>();
        for(Plan_ws plan:planes_ws){
            clonePlanes.add((Plan_ws)plan.clone());
        }
        return clonePlanes;
    }
}
