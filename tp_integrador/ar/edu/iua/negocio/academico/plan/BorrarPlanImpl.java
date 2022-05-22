package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.Excepciones.modeloEx.BorrarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan {

    public boolean borrar(Plan plan) throws BorrarPlanEx{
        for(int ii = 0; ii < BaseDeDatos.planesSize(); ii++){
            if(!plan.equals(null)){
                try {
                    if(BaseDeDatos.getPlan(ii).getAnio().equals(plan.getAnio()) && BaseDeDatos.getPlan(ii).isEstadoBorrador()){
                        BaseDeDatos.removePlan(ii);
                        return true;
                    }
                    else{
                        if(!BaseDeDatos.getPlan(ii).getAnio().equals(plan.getAnio()))
                            throw new BorrarPlanEx("No se encuentra el plan. BorrarPlan.java ln 12");
                        if(!BaseDeDatos.getPlan(ii).isEstadoBorrador())
                            throw new BorrarPlanEx("El plan no es Borrador. BorrarPlan.java ln 12");
                    }
                } catch (CloneNotSupportedException e) {
                    throw new BorrarPlanEx("No se pudo obtener el plan " + ii + " en BorrarPlanImpl ln 13");
                }
            }
            else{
                throw new BorrarPlanEx("El plan es nulo. BorrarPlan.java ln 11");
            }
        }
        return false;
    }   
}
