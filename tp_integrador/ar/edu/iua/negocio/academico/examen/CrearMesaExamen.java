package ar.edu.iua.negocio.academico.examen;

import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.excepciones.modelo_ex.VerificadorEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.verificadores.VerificarIntegridad;

public class CrearMesaExamen {
    
    public boolean crear (MesaExamen mesa)throws CrearMesaEx{
        boolean v;
        try {
            v = VerificarIntegridad.verificarIntegridadMesa(mesa);
            if(v){
                return BaseDeDatos.addMesa(mesa);
            }
            else{
                return false;
            }
        } catch (CloneNotSupportedException | VerificadorEx e) {
            throw new CrearMesaEx(e.getMessage()); 
        }
    }
}
