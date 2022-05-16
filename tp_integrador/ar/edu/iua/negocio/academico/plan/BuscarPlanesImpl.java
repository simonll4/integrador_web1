package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.UtilTranslate;

public class BuscarPlanesImpl implements BuscarPlanes{

	public List<Plan> buscar(String terminos) {
		List<Plan> buscados = new ArrayList<>();
		if(terminos != null){
			terminos = UtilTranslate.TraducirCadena(terminos);
			String[] terminosArray = terminos.trim().toLowerCase().split(" ");
			for(Plan plan : BaseDeDatos.planes){
				String fullToStringPlan = plan.fullToString().toLowerCase();
				for(String termino : terminosArray){
					if(fullToStringPlan.contains(termino)){
						buscados.add(plan);
						break;
					}
				}
			}
		}
		return buscados;
	}
}
