package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.util.VerificarIntegridad;

public class ModificarPlanesImpl implements ModificarPlanes {

    @Override
    public boolean modificar(List<Plan> planes) {
        ModificarPlan modificador = new ModificarPlanImpl();
        Boolean bandera = false;

        for(int ii = 0; ii < planes.size(); ii++){
            if(planes != null){
                //bandera = modificador.modificar(planes.get(ii));
                bandera = VerificarIntegridad.verificadorIntegridad(planes.get(ii));
                if(!bandera){
                    return bandera;
                }
            }
        }

        for(Plan plan : planes){
            bandera = modificador.modificar(plan);
            if(!bandera) return bandera;
        }
        return bandera;
    }
}
