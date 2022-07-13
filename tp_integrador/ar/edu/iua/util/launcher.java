package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.excepciones.modelo_ex.CrearMesaEx;
import ar.edu.iua.excepciones.modelo_ex.CrearPlanEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.generadores.GenerarEjemplosDeMesas;
import ar.edu.iua.util.generadores.GenerarEjemplosDePlanes;

public class launcher {

    public static void launch() throws ObjetoEx {

        // generar planes
        List<Plan> planes = GenerarEjemplosDePlanes.generar(3, false);

        System.out.println("\n\nSe crearon " + planes.size() + " planes.");

        CrearPlanes crearPlanes = new CrearPlanesImpl();
        boolean ok = false;
        ok = crearPlanes.crear(planes);

        System.out.println("Se guardaron " + BaseDeDatos.planesSize() + " planes en la BD");
        if (ok == false) {
            System.out.println("se rompio");
            return;
        }

        // generar mesas de examen
        try {
            List<MesaExamen> mesasExamen = GenerarEjemplosDeMesas.generarMesasAleatorias(10);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
