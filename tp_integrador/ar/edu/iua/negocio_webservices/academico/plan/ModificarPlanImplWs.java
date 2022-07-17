package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo_webservices.academico.plan.PlanWs;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class ModificarPlanImplWs implements ModificarPlanWs {

    public boolean modificar(PlanWs plan) throws ModificarPlanEx{
        boolean bandera = false;

        boolean v;
        try {
            v = VerificarIntegridad.verificarIntegridadPlanWs(plan);
        } catch (VerificadorEx e1) {
            throw new ModificarPlanEx(e1.getMessage());
        }

        if(v){
            for(int ii = 0; ii < BaseDeDatos.planesSizeWs();ii++){
                try {
                    if(BaseDeDatos.getPlanWs(ii).getAnio().equals(plan.getAnio())){
                        BaseDeDatos.setPlanWs(ii, plan);
                        return !bandera;
                    }
                } catch (CloneNotSupportedException e) {
                    throw new ModificarPlanEx("No se pudo acceder al indice " + ii +" de la base de datos ModificarPlanImpl ln 24");
                }
            }
        }
        return bandera;
    }


    
}
