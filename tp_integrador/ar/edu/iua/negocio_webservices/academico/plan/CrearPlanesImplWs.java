package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImplWs;

public class CrearPlanesImplWs implements CrearPlanesWs{

    
    public boolean crear(List<PlanImplWs> planes) throws CrearPlanEx{
        boolean bandera=false;
        if(planes != null){
            for(int ii = 0; ii < planes.size(); ii++){
                CrearPlanImplWs creador = new CrearPlanImplWs();
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
