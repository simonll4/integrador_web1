package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

public interface BorrarPlan_ws {

    /*
        Este metodo requiere que se quite de la base de datos un plan
        Se debe validar y retornar false si:
            - plan no puede ser null            
            - No se permite borrar un plan, excepto si el estado es BORRADOR

    */
    boolean borrar(Plan_ws planes) throws BorrarPlanEx;    
    
}
