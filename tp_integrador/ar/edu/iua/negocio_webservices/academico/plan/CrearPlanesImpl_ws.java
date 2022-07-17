package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImpl_ws;

public class CrearPlanesImpl_ws implements CrearPlanes_ws{

    
    public boolean crear(List<PlanImpl_ws> planes) throws CrearPlanEx{
        boolean bandera=false;
        if(planes != null){
            for(int ii = 0; ii < planes.size(); ii++){
                CrearPlanImpl_ws creador = new CrearPlanImpl_ws();
                bandera = creador.crear(planes.get(ii));
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
