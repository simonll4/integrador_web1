package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.VerificarIntegridad;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) {
    
        if(VerificarIntegridad.verficadorIntegridad(plan)){
            try {
                BaseDeDatos.planes.add((Plan)plan.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return true;
        }
        else{
            return false;
        } 
    }
}
