package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarPlanImpl implements ModificarPlan {

    public boolean modificar(Plan plan) {
        CrearPlanImpl verificador = new CrearPlanImpl();
        boolean bandera = false;
        if(verificador.crear(plan)){
            for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
                if(BaseDeDatos.planes.get(ii).getAnio().equals(plan.getAnio())){
                    BaseDeDatos.planes.set(ii, plan);
                    return !bandera;
                }
            }
        }
        return bandera;
    }


    
}
