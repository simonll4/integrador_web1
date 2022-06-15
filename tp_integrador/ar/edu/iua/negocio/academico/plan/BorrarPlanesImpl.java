package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BorrarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl implements BorrarPlanes {
    
    @Override
    public boolean borrar(List<Plan> planes) throws BorrarPlanEx {
        boolean bandera = false;
        
        for(int ii = 0; ii < planes.size(); ii++){
            if(planes.get(ii) == null) throw new BorrarPlanEx("El plan " + planes.get(ii).getAnio() + " es nulo. BorrarPlanesImpl.java ln 15");
            if(!planes.get(ii).isEstadoBorrador()) throw new BorrarPlanEx("El plan " + planes.get(ii).getAnio() + " no es borrador. BorrarPlanesImpl.java ln 16");
        }
        
        for(int ii = 0; ii < planes.size(); ii++){
            BorrarPlanImpl borrador = new BorrarPlanImpl();
            bandera = borrador.borrar(planes.get(ii));
            if(!bandera){
                return bandera;
            }
        }
        return bandera;
    } 
}
