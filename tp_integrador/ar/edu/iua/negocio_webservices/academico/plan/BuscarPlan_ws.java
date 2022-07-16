package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

public interface BuscarPlan_ws {

    Plan_ws buscar(int anio) throws BuscarPlanEx;
    
}
