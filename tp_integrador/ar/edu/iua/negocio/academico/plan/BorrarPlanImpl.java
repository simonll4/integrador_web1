package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan {

    @Override
    public boolean borrar(Plan plan) {
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            if(!plan.equals(null)){
                if(BaseDeDatos.planes.get(ii).getAnio().equals(plan.getAnio()) && BaseDeDatos.planes.get(ii).isEstadoBorrador()){
                    BaseDeDatos.planes.remove(ii);
                    return true;
                }
            }
        }
        return false;
    }   
}
