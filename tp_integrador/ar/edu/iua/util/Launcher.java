package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImpl_ws;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;
import ar.edu.iua.negocio.academico.examen.CrearMesasExamen;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio_webservices.academico.plan.ModificarPlanImpl_ws;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.generadores.GenerarEjemplosDeMesas;
import ar.edu.iua.util.generadores.GenerarEjemplosDePlanes;
import ar.edu.iua.web_services.Server;
import ar.edu.iua.util.UtilTransformer;

public class Launcher {

    /**
     * @throws ObjetoEx
     */
    public static void launch() throws ObjetoEx {
        // generar planes
        List<Plan> planes = GenerarEjemplosDePlanes.generar(3, false);

        System.out.println("\n\nSe crearon " + planes.size() + " planes.");

        CrearPlanes crearPlanes = new CrearPlanesImpl();
        boolean ok = false;
        ok = crearPlanes.crear(planes);

        if (ok == false) {
            System.out.println("se rompio");
            return;
        }
        System.out.println("Se guardaron " + BaseDeDatos.planesSize() + " planes en la BD");

        // generar planes para web service
        
        try{
            UtilTransformer.transformar();
        }catch(CloneNotSupportedException e){
            throw new ObjetoEx(e.getMessage());
        }

        // generar mesas de examen

        ok = false;
        try {
            List<MesaExamen> mesasExamen = GenerarEjemplosDeMesas.generarMesasAleatorias(10);

            System.out.println("\n\nSe crearon " + mesasExamen.size() + " mesas de examen.");

            CrearMesasExamen crearMesas = new CrearMesasExamen();
            ok = crearMesas.crear(mesasExamen);

            if (ok == false) {
                System.out.println("se rompio");
                return;
            }
            System.out.println("Se guardaron " + BaseDeDatos.mesasSize() + " mesas de examen en la BD");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        UtilPrint.PrintBusqueda(planes);
        Server.startServer();
       
    }

}