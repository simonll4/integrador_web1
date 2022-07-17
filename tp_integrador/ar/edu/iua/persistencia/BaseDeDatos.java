package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;
import ar.edu.iua.modelo_webservices.academico.plan.PlanWs;

public class BaseDeDatos {

    private static List<Plan> planes = new ArrayList<Plan>();

    private static List<PlanWs> planesWs = new ArrayList<>();

    private static List<MesaExamen> mesasExamen = new ArrayList<>();

    private static List<MesaExamenWs> mesasExamenWs = new ArrayList<>();

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

    public static int planesSizeWs (){
        return planesWs.size();
    }

    public static PlanWs getPlanWs (int index) throws CloneNotSupportedException{
        
        return (PlanWs)planesWs.get(index).clone();
    }

    public static boolean setPlanWs (int index, PlanWs plan) throws CloneNotSupportedException{
        boolean bandera = false;
    
        planesWs.set(index, (PlanWs)plan.clone());
        bandera = true;
        
        return bandera;
    }
    
    public static boolean addPlanWs (PlanWs plan) throws CloneNotSupportedException{
        boolean bandera = false;
        
        planesWs.add((PlanWs) plan.clone());
        bandera = true;

        return bandera;
    }

    public static void removePlanWs (int index){
        planesWs.remove(index);
    }

    public static List<PlanWs> getListWs () throws CloneNotSupportedException{
        List<PlanWs> clonePlanes = new ArrayList<>();
        for(PlanWs plan:planesWs){
            clonePlanes.add((PlanWs)plan.clone());
        }
        return clonePlanes;
    }

    public static int mesasSizeWs (){
        return mesasExamenWs.size();
    }

    public static boolean addMesaWs (MesaExamenWs mesa) throws CloneNotSupportedException{
        boolean bandera = false;
        
        mesasExamenWs.add((MesaExamenWs) mesa.clone());
        bandera = true;

        return bandera;
    }

    public static MesaExamenWs getMesaWs (int index) throws CloneNotSupportedException{
        
        return (MesaExamenWs)mesasExamenWs.get(index).clone();
    }

    public static List<MesaExamenWs> getListMesasWs () throws CloneNotSupportedException{
        List<MesaExamenWs> cloneMesas = new ArrayList<>();
        for(MesaExamenWs mesa:mesasExamenWs){
            cloneMesas.add((MesaExamenWs)mesa.clone());
        }
        return cloneMesas;
    }
}
