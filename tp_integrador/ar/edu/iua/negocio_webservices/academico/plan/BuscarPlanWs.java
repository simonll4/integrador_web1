package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanWs;

public interface BuscarPlanWs {

    PlanWs buscar(int anio) throws BuscarPlanEx;
    
}
