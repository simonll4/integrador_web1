package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class ModificarPlanesImpl_ws implements ModificarPlanes_ws {

    public boolean modificar(List<Plan_ws> planes) throws ModificarPlanEx {
        ModificarPlan_ws modificador = new ModificarPlanImpl_ws();
        Boolean bandera = false;

        for(int ii = 0; ii < planes.size(); ii++){
            if(planes != null){
                //bandera = modificador.modificar(planes.get(ii));
                try {
                    bandera = VerificarIntegridad.verificarIntegridadPlanWs(planes.get(ii));
                } catch (VerificadorEx e) {
                    throw new ModificarPlanEx(e.getMessage());
                }
                if(!bandera){
                    return bandera;
                }
            }
        }

        for(Plan_ws plan : planes){
            bandera = modificador.modificar(plan);
            if(!bandera) return bandera;
        }
        return bandera;
    }
}
