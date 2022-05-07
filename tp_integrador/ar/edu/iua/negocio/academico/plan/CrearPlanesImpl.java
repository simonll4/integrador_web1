package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes{


    public boolean crear(Plan plan) {
        CrearPlanImpl verificador = new CrearPlanImpl();
        return verificador.crear(plan);
    }


    public boolean crear(List<Plan> planes) {
        boolean bandera=false;
        if(planes != null){
            for(int ii = 0; ii < planes.size(); ii++){
                bandera = crear(planes.get(ii));
                if(!bandera){
                    return bandera;
                }
            }
        }
        return bandera;
    }
    
}
