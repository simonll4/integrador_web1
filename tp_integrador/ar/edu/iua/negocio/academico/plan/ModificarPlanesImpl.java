package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class ModificarPlanesImpl implements ModificarPlanes {

    @Override
    public boolean modificar(List<Plan> planes) throws ModificarPlanEx {
        ModificarPlan modificador = new ModificarPlanImpl();
        Boolean bandera = false;

        for(int ii = 0; ii < planes.size(); ii++){
            if(planes != null){
                try {
                    bandera = VerificarIntegridad.verificadorIntegridadPlan(planes.get(ii));
                } catch (VerificadorEx e) {
                    throw new ModificarPlanEx(e.getMessage());
                }
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
