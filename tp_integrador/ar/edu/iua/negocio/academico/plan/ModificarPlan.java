package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public interface ModificarPlan {

    /*
        Este metodo requiere que se recupere un plan de la base, se modifique y luego se guarde nuevamente en la base de datos un plan
        Se debe validar y retornar false si:
            - Ver las mismas reglas de CrearPlan.crear(Plan plan)
    */
    

    boolean modificar(Plan plan) throws ModificarPlanEx;    
    
}
