package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

public interface ModificarPlanes_ws {

    /*
        Este metodo requiere que se recuperen los planes de la base, se modifiquen y luego se guarden nuevamente en la base de datos
        Se debe validar y retornar false si:
            - planes no puede ser null
            - Ver las mismas reglas de ModificarPlan.modificar(Plan plan)
    */
    boolean modificar(List<Plan_ws> planes) throws ModificarPlanEx;    
    
}
