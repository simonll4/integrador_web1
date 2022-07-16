package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarPlanImpl_ws implements BuscarPlan_ws {

    @Override
    public Plan_ws buscar(int anio) throws BuscarPlanEx{
        for(int ii = 0; ii < BaseDeDatos.planesSize(); ii++){
            try {
                if(BaseDeDatos.getPlan_ws(ii).getAnio().intValue() == anio){
                    return BaseDeDatos.getPlan_ws(ii);
                }
            } catch (CloneNotSupportedException e) {
                throw new BuscarPlanEx("No se pudo obtener el plan " + ii + " de la base de datos BuscarPlanImpl ln 13");
            }
        }
        throw new BuscarPlanEx("No se encontro el plan. BuscarPlanImpl.java ln 12");
    }
    
}
