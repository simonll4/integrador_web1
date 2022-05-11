package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.VerificarIntegridad;

public class ModificarPlanImpl implements ModificarPlan {

    public boolean modificar(Plan plan) {
        boolean bandera = false;
        if(VerificarIntegridad.verficadorIntegridad(plan)){
            for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
                if(BaseDeDatos.planes.get(ii).getAnio().equals(plan.getAnio())){
                    try {
                        BaseDeDatos.planes.set(ii, (Plan)plan.clone());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    return !bandera;
                }
            }
        }
        return bandera;
    }


    
}
