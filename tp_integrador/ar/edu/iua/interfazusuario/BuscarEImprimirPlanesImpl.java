package ar.edu.iua.interfazusuario;

import java.util.List;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.excepciones.modelo_ex.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.util.UtilPrint;

public class BuscarEImprimirPlanesImpl implements BuscarEImprimirPlanes {

        @Override
        public void buscar(String terminos) throws BuscarPlanEx{
                BuscarPlanesImpl buscador = new BuscarPlanesImpl();
                List<Plan> planesEncontrados = buscador.buscar(terminos);
                try {
                        UtilPrint.PrintBusqueda(planesEncontrados);
                } catch (ObjetoEx e) {
                        throw new BuscarPlanEx(e.getMessage());
                }
 
        }
}