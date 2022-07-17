package ar.edu.iua.negocio_webservices.academico.examen;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;


public class CrearMesasExamenWs {

    public boolean crear(List<MesaExamenWs> mesas) throws CrearMesaEx{
        boolean bandera=false;
        CrearMesaExamenWs creador = new CrearMesaExamenWs();
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
