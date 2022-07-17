package ar.edu.iua.negocio_webservices.academico.examen;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class CrearMesaExamenWs {
    
    public boolean crear (MesaExamenWs mesa)throws CrearMesaEx{
        boolean v;
        try {
            v = VerificarIntegridad.verificarIntegridadMesaWs(mesa);
            if(v){
                return BaseDeDatos.addMesaWs(mesa);
            }
            else{
                return false;
            }
        } catch (CloneNotSupportedException | VerificadorEx e) {
            throw new CrearMesaEx(e.getMessage()); 
        }
    }
}
