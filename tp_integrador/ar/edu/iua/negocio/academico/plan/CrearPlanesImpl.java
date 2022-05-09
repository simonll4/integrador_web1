package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes{

    public boolean crear(List<Plan> planes) {
        boolean bandera=false;
        if(planes != null){
            for(int ii = 0; ii < planes.size(); ii++){
                CrearPlanImpl verificador = new CrearPlanImpl();
                bandera = verificador.crear(planes.get(ii),true);
                if(!bandera){
                    return bandera;
                }
            }
        }
        return bandera;
    }
}
