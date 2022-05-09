package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Pruebas {

        public void probar() {

                List<Plan> planes = GenerarEjemplosDePlanes.generar(2, true);

                System.out.println("\n\nSe crearon " + planes.size() + " planes.");

                CrearPlanes crearPlanes = new CrearPlanesImpl();

                boolean ok = crearPlanes.crear(planes);

                System.out.println("Se guardaron " + BaseDeDatos.planes.size() + " planes en la BD");

                if (ok == false) {
                        System.out.println("se rompio");
                        return;
                }

                ModificarPlan modificarPlan = new ModificarPlanImpl();

                // planes.get(0).setAnio(2050); NO se puede modificar el anio, es clave primaria
                // planes.get(1).setAnio(2003);

                // planes.get(0).setEstadoNoActivo();

                int random = 2;// (int)(Math.random()*3);
                System.out.println("condicion: " + random);
                if (random == 0) {
                        planes.get(0).getAnios().get(0).getMaterias().get(0).setNombre("INGE WEB");
                        planes.get(0).getAnios().get(0).getMaterias().get(1).setNombre(null);
                        ok = modificarPlan.modificar(planes.get(0));
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                }
                if (random == 1) {
                        planes.get(0).setEstadoBorrador();
                        planes.get(0).getAnios().get(0).setNombre(null);
                        planes.get(0).getAnios().get(0).setNumero(null);
                        ok = modificarPlan.modificar(planes.get(0));
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                }
                if (random == 2) {
                        planes.get(2).getAnios().get(4).getMaterias().get(0).setCargaHoraria(0.0);
                        ok = modificarPlan.modificar(planes.get(2));
                        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (ok ? "SI" : "NO"));
                }

                System.out.println("HOLA BUENAS TARDES, SOY LA BD");
                for (Plan plan1 : BaseDeDatos.planes) {
                        System.out.println("\n" + plan1);
                        for (AnioPlan anio : plan1.getAnios()) {
                                System.out.println("\t" + anio);
                                for (Materia materia : anio.getMaterias()) {
                                        System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo())
                                                        + " - " + materia);
                                }
                                if (anio.getMaterias().size() == 0) {
                                        System.out.println("\t\tA este año no se le cargaron materias!!");
                                }
                        }
                        if (plan1.getAnios().size() == 0) {
                                System.out.println("\tA este plan no se le cargaron años!!");
                        }

                }

                /*
                 * BuscarEImprimirPlanes buscarEImprimirPlanes = new
                 * BuscarEImprimirPlanesImpl();
                 * 
                 * // debe buscar todos los planes que contengan en sus datos (incluido años y
                 * materias)
                 * // devolver todos los planes q contengan un valor 18, o mate o hist o 5
                 * buscarEImprimirPlanes.buscar(" 18 mate hist 5");
                 * 
                 */

                // por favor complete con mas codigo de pruebas, trate de probar todas las
                // clases de negocio, borrar, modificar, buscar

        }

}
