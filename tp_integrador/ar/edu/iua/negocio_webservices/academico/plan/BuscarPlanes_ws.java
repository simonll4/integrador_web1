package ar.edu.iua.negocio_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

public interface BuscarPlanes_ws {

    // este metodo debe devolver todos los planes que contengan en sus datos el termino
    // si el att del plan es != String, se debe convertir el att a String y luego comparar
    // si el termino esta compuesto por varias palabras, se debe buscar por cada palabra, si coincide alguna se debe retornar ese plan
    // la busqueda debe ser ignore case, por contenido (que contenga la plabra) y con traslate (es decir no importan los acentos, comillas simples, ñ, etc)
    // se debe buscar tanto en los atts directos del plan, como en todos sus años y materias  
    List<Plan_ws> buscar(String terminos) throws BuscarPlanEx;
    
}
