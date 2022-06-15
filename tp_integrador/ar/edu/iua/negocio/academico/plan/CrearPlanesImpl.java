package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes{

    
    public boolean crear(List<Plan> planes) throws CrearPlanEx{
        boolean bandera=false;
        if(planes != null){
            for(int ii = 0; ii < planes.size(); ii++){
                CrearPlanImpl creador = new CrearPlanImpl();
                try {
                    bandera = creador.crear(planes.get(ii));
                } catch (CrearPlanEx e) {
                    throw new CrearPlanEx(e.getMessage());
                }
                if(!bandera){
                    return bandera;
                }
            }
        }
        else{
            return bandera;
        }
        return bandera;
    }
}
