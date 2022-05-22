package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.Excepciones.ObjetoEx;
import ar.edu.iua.Excepciones.modeloEx.CrearPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.VerificarIntegridad;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) throws CrearPlanEx{
    
        boolean v;
        try {
            v = VerificarIntegridad.verificadorIntegridad(plan);
        } catch (ObjetoEx e1) {
            throw new CrearPlanEx(e1.getMessage());
        }

        if(v){
            return BaseDeDatos.addPlan(plan);
        }
        else{
            return false;
        } 
    }
}
