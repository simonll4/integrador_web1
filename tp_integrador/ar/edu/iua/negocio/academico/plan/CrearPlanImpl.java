package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) throws CrearPlanEx{
    
        boolean v;
        try {
            v = VerificarIntegridad.verificadorIntegridadPlan(plan);
        } catch (ObjetoEx e1) {
            throw new CrearPlanEx(e1.getMessage());
        }

        if(v){
            try {
                return BaseDeDatos.addPlan(plan);
            } catch (CloneNotSupportedException e) {
                throw new CrearPlanEx(e.getMessage());
            }
        }
        else{
            return false;
        } 
    }
}
