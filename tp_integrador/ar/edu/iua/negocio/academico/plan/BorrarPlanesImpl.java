package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl implements BorrarPlanes {
    
    @Override
    public boolean borrar(List<Plan> planes) {
        boolean bandera = false;
        
        for(int ii = 0; ii < planes.size(); ii++){
            if(!planes.get(ii).isEstadoBorrador()) return bandera;
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
