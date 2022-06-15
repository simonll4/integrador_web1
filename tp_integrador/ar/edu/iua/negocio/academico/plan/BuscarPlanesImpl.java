package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.UtilTranslate;

public class BuscarPlanesImpl implements BuscarPlanes{

	public List<Plan> buscar(String terminos) throws BuscarPlanEx{
		List<Plan> buscados = new ArrayList<>();
		if(terminos != null){
			terminos = UtilTranslate.traducirCadena(terminos);
			String[] terminosArray = terminos.trim().toLowerCase().split(" ");
			for(int ii = 0; ii < BaseDeDatos.planesSize(); ii++){
				Plan plan = null;
				try {
					plan = BaseDeDatos.getPlan(ii);
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
