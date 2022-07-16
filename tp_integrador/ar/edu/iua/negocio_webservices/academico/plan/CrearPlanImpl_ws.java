package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class CrearPlanImpl_ws implements CrearPlan_ws {

    public boolean crear(Plan_ws plan) throws CrearPlanEx{
    
        boolean v;
        try {
            v = VerificarIntegridad.verificarIntegridadPlanWs(plan);
        } catch (ObjetoEx e1) {
            throw new CrearPlanEx(e1.getMessage());
        }

        if(v){
            try {
                return BaseDeDatos.addPlan_ws(plan);
            } catch (CloneNotSupportedException e) {
                throw new CrearPlanEx(e.getMessage());
            }
        }
        else{
            return false;
        } 
    }
}
