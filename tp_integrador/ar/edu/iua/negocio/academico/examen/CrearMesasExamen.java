package ar.edu.iua.negocio.academico.examen;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;


public class CrearMesasExamen {

    public boolean crear(List<MesaExamen> mesas) throws CrearMesaEx{
        boolean bandera=false;
        CrearMesaExamen creador = new CrearMesaExamen();
        if(mesas != null){
            for(int ii = 0; ii < mesas.size(); ii++){
                bandera = creador.crear(mesas.get(ii));
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
