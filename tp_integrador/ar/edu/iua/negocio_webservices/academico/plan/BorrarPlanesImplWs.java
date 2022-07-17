package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanWs;

public class BorrarPlanesImplWs implements BorrarPlanesWs {
    
    @Override
    public boolean borrar(List<PlanWs> planes) throws BorrarPlanEx {
        boolean bandera = false;
        
        for(int ii = 0; ii < planes.size(); ii++){
            if(planes.get(ii).equals(null)) throw new BorrarPlanEx("El plan " + planes.get(ii).getAnio() + " es nulo. BorrarPlanesImpl.java ln 15");
            if(!planes.get(ii).isEstadoBorrador()) throw new BorrarPlanEx("El plan " + planes.get(ii).getAnio() + " no es borrador. BorrarPlanesImpl.java ln 16");
        }
        
        for(int ii = 0; ii < planes.size(); ii++){
            BorrarPlanImplWs borrador = new BorrarPlanImplWs();
            bandera = borrador.borrar(planes.get(ii));
            if(!bandera){
                return bandera;
            }
        }
        return bandera;
    } 
}
