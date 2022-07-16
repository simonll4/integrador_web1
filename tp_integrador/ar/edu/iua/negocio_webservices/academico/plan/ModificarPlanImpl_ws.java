package ar.edu.iua.negocio_webservices.academico.plan;

import ar.edu.iua.excepciones.modelo_ex.ModificarPlanEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class ModificarPlanImpl_ws implements ModificarPlan_ws {

    public boolean modificar(Plan_ws plan) throws ModificarPlanEx{
        boolean bandera = false;

        boolean v;
        try {
            v = VerificarIntegridad.verificarIntegridadPlanWs(plan);
        } catch (VerificadorEx e1) {
            throw new ModificarPlanEx(e1.getMessage());
        }

        if(v){
            for(int ii = 0; ii < BaseDeDatos.planesSize_ws();ii++){
                try {
                    if(BaseDeDatos.getPlan_ws(ii).getAnio().equals(plan.getAnio())){
                        BaseDeDatos.setPlan_ws(ii, plan);
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
