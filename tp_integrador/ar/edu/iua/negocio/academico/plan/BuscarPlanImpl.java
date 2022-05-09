package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarPlanImpl implements BuscarPlan {

    @Override
    public Plan buscar(int anio) {
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            if(BaseDeDatos.planes.get(ii).getAnio().intValue() == anio){
                return BaseDeDatos.planes.get(ii);
            }
        }
        return null;
    }
    
}
