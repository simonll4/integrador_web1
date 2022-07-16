package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.UtilTranslate;

public class BuscarPlanesImpl_ws implements BuscarPlanes_ws{

	public List<Plan_ws> buscar(String terminos) throws BuscarPlanEx{
		List<Plan_ws> buscados = new ArrayList<>();
		if(terminos != null){
			terminos = UtilTranslate.traducirCadena(terminos);
			String[] terminosArray = terminos.trim().toLowerCase().split(" ");
			for(int ii = 0; ii < BaseDeDatos.planesSize_ws(); ii++){
				Plan_ws plan = null;
				try {
					plan = BaseDeDatos.getPlan_ws(ii);
				} catch (CloneNotSupportedException e) {
					throw new BuscarPlanEx("No se pudo obtener el plan " + ii + " de la base de datos BuscarPlanesImpl ln 21");
				}
				String fullToStringPlan = plan.fullToString().toLowerCase();
				fullToStringPlan = UtilTranslate.traducirCadena(fullToStringPlan);
				for(String termino : terminosArray){
					if(fullToStringPlan.contains(termino)){
						buscados.add(plan);
						break;
					}
				}
			}
		}
		else if(terminos == null || terminos.length()==0){
			throw new BuscarPlanEx("No se ingresaron terminos. BuscarPlanesImpl.java ln 15");
		}
		
		return buscados;
	}
}
