package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl_ws implements BorrarPlan_ws {

    public boolean borrar(Plan_ws plan) throws BorrarPlanEx{
        for(int ii = 0; ii < BaseDeDatos.planesSize_ws(); ii++){
            if(!plan.equals(null)){
                try {
                    if(BaseDeDatos.getPlan_ws(ii).getAnio().equals(plan.getAnio()) && BaseDeDatos.getPlan_ws(ii).isEstadoBorrador()){
                        BaseDeDatos.removePlan_ws(ii);
                        return true;
                    }
                } catch (CloneNotSupportedException e) {
                    throw new BorrarPlanEx("No se pudo obtener el plan " + ii + " en BorrarPlanImpl ln 13");
                }
            }
            else{
                throw new BorrarPlanEx("El plan es nulo. BorrarPlan.java ln 11");
            }
        }
        throw new BorrarPlanEx("No se encuentra el plan o no es borrador. BorrarPlan.java ln 12");
    }   
}
