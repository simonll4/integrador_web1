package ar.edu.iua.interfazusuario;

import java.util.List;

import ar.edu.iua.Excepciones.modeloEx.BuscarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.util.UtilPrint;

public class BuscarEImprimirPlanesImpl implements BuscarEImprimirPlanes {

        @Override
        public void buscar(String terminos) throws BuscarPlanEx{

                BuscarPlanesImpl buscador = new BuscarPlanesImpl();
                List<Plan> planesEncontrados = buscador.buscar(terminos);
                UtilPrint.PrintBusqueda(planesEncontrados);

        }
}