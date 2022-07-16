package ar.edu.iua.negocio_webservices.academico.examen;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;


public class CrearMesasExamen_ws {

    public boolean crear(List<MesaExamen> mesas) throws CrearMesaEx{
        boolean bandera=false;
        CrearMesaExamen_ws creador = new CrearMesaExamen_ws();
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
