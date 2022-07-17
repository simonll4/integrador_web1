package ar.edu.iua.negocio_webservices.academico.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BuscarMesaEx;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.UtilTranslate;

public class BuscarMesasExamenWs {

    public List<MesaExamenWs> buscar(String terminos) throws BuscarMesaEx{
        List<MesaExamenWs> buscados = new ArrayList<>();
        
        if(terminos != null){
			terminos = UtilTranslate.traducirCadena(terminos);
			String[] terminosArray = terminos.trim().toLowerCase().split(" ");
			for(int ii = 0; ii < BaseDeDatos.mesasSizeWs(); ii++){
				MesaExamenWs mesa = null;
				try {
					mesa = BaseDeDatos.getMesaWs(ii);
				} catch (CloneNotSupportedException e) {
					throw new BuscarMesaEx("No se pudo obtener la mesa examen " + ii + " de la base de datos BuscarMesas ln 21");
				}
				String fullToStringPlan = mesa.fullToString().toLowerCase();
				fullToStringPlan = UtilTranslate.traducirCadena(fullToStringPlan);
				for(String termino : terminosArray){
					if(fullToStringPlan.contains(termino)){
						buscados.add(mesa);
						break;
					}
				}
			}
		}
		else if(terminos == null || terminos.length()==0){
			throw new BuscarMesaEx("No se ingresaron terminos. BuscarMesasImpl.java ln 15");
		}

        return buscados;
    }
    
}
