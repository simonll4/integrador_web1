package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.interfazusuario.BuscarEImprimirPlanes;
import ar.edu.iua.interfazusuario.BuscarEImprimirPlanesImpl;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BorrarPlan;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanes;
import ar.edu.iua.negocio.academico.plan.BorrarPlanesImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlan;
import ar.edu.iua.negocio.academico.plan.BuscarPlanImpl;

import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlanes;
import ar.edu.iua.negocio.academico.plan.ModificarPlanesImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Pruebas {

        public void probar() {

                List<Plan> planes = GenerarEjemplosDePlanes.generar(3, false);

                System.out.println("\n\nSe crearon " + planes.size() + " planes.");

                CrearPlanes crearPlanes = new CrearPlanesImpl();

                boolean ok = crearPlanes.crear(planes);

                System.out.println("Se guardaron " + BaseDeDatos.planes.size() + " planes en la BD");

                if (ok == false) {
                        System.out.println("se rompio");
                        return;
                }

                ModificarPlan modificarPlan = new ModificarPlanImpl();
                ModificarPlanes modificarPlanes = new ModificarPlanesImpl();

                BorrarPlan borradorPlan = new BorrarPlanImpl();
                BorrarPlanes borradorPlanes = new BorrarPlanesImpl();

                // pruebas de integridad
                int random = (int) (Math.random() * 7);

                System.out.println("condicion: " + random);
                if (random == 0) {
                        planes.get(0).getAnios().get(0).getMaterias().get(0).setNombre("INGE WEB");
                        ok = modificarPlan.modificar(planes.get(0));
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                }
                if (random == 1) {
                        planes.get(0).setEstadoBorrador();
                        planes.get(0).getAnios().get(0).setNombre(null);
                        planes.get(0).getAnios().get(0).setNumero(null);
                        planes.get(0).getAnios().get(0).getMaterias().get(0).setNombre(null);
                        planes.get(0).getAnios().get(0).getMaterias().get(0).setCargaHoraria(null);
                        ok = modificarPlan.modificar(planes.get(0));
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                }
                if (random == 2) {
                        planes.get(2).getAnios().get(4).getMaterias().get(0).setCargaHoraria(0.0);
                        ok = modificarPlan.modificar(planes.get(2));
                        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (ok ? "SI" : "NO"));
                }

                if (random == 3){
                        planes.get(0).setEstadoBorrador();
                        planes.get(1).getAnios().get(0).setNombre("Hola Mundo");
                        planes.get(2).getAnios().get(1).getMaterias().get(1).setCargaHoraria(200.0);
                        
                        ok = modificarPlanes.modificar(planes);
                        
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (ok ? "SI" : "NO"));
                        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (ok ? "SI" : "NO"));
                }   
                
                if (random == 4){
                        planes.get(0).setEstadoBorrador();
                        planes.get(1).getAnios().get(0).setNombre("Hola Mundo");
                        planes.get(2).getAnios().get(1).getMaterias().get(1).setCargaHoraria(0.0);
                        
                        ok = modificarPlanes.modificar(planes);
                        
                        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (ok ? "SI" : "NO"));
                        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (ok ? "SI" : "NO"));
                }  

                if (random == 5){
                        planes.get(0).setEstadoBorrador();

                        ok = modificarPlan.modificar(planes.get(0));

                        ok = borradorPlan.borrar(planes.get(0));

                        System.out.println("Se borro el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                }

                if (random == 6){
                        planes.get(0).setEstadoBorrador();

                        ok = modificarPlan.modificar(planes.get(0));
                        
                        List<Plan> planesB = new ArrayList<>();

                        planesB.add(planes.get(0));
                        planesB.add(planes.get(5));

                        ok = borradorPlanes.borrar(planesB);

                        System.out.println("Se borro el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO"));
                        System.out.println("Se borro el plan " + planes.get(5) + " ? = " + (ok ? "SI" : "NO"));
                }

        

                BuscarPlan buscador = new BuscarPlanImpl();
                Plan buscado = buscador.buscar(2018);
                List<Plan> buscadoList = new ArrayList<>();
                buscadoList.add(buscado);

                BuscarEImprimirPlanes buscarEImprimirPlanes = new BuscarEImprimirPlanesImpl();

                buscarEImprimirPlanes.buscar("í'ñGé 15 mat 18");

        }

}
