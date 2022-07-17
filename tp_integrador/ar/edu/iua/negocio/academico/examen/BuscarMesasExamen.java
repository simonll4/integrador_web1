package ar.edu.iua.negocio.academico.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BuscarMesaEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.UtilTranslate;

public class BuscarMesasExamen {

    public List<MesaExamen> buscar(String terminos) throws BuscarMesaEx{
        List<MesaExamen> buscados = new ArrayList<>();
        
        if(terminos != null){
			terminos = UtilTranslate.traducirCadena(terminos);
			String[] terminosArray = terminos.trim().toLowerCase().split(" ");
			for(int ii = 0; ii < BaseDeDatos.planesSize(); ii++){
				MesaExamen mesa = null;
				try {
					mesa = BaseDeDatos.getMesa(ii);
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
			if(buscados.size() == 0){
				throw new BuscarMesaEx("No se encontraron resultados para la busqueda");
			}
		}
		else if(terminos == null || terminos.length()==0){
			throw new BuscarMesaEx("No se ingresaron terminos. BuscarMesasImpl.java ln 15");
		}

        return buscados;
    }
    
}
