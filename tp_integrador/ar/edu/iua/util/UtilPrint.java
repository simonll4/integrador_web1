package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.iua.excepciones.ObjetoEx;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.examen.BuscarMesasExamen;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class UtilPrint {
    static public void PrintBusqueda(List<Plan> buscados) throws ObjetoEx {

        int anio = 0;
        Scanner consola = new Scanner(System.in);
        Scanner consola1 = new Scanner(System.in);
        Scanner consola2 = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("|\t" + "PLAN\t      ANIOS\t     MATERIAS\t\tESTADO" + "   |");
        System.out.println("------------------------------------------------------------------");

        for (int ii = 0; ii < buscados.size(); ii++) {
            Plan plan = buscados.get(ii);
            int materias = ContarMaterias(plan);
            String estado = DevolverEstado(plan);
            System.out
                    .println("\t" + plan.getAnio().intValue() + "\t\t" + plan.getAnios().size() + "\t\t" + materias
                            + "\t\t"
                            + estado);
        }

        do {
            System.out.println(
                    "--------------------------------------------");
            System.out.println(
                    "OPCIONES: \n 0) Salir. \n 1) Ver base de datos de planes. \n 2) Ver base de datos de mesas de examen. \n 3) Buscar plan por termino. \n 4) Buscar plan por año \n 5) Buscar mesa por termino.");
            System.out.println(
                    "--------------------------------------------");
            anio = consola.nextInt();
            consola.reset();
            if (anio != 0) {
                if (anio == 1) {
                    try {
                        PrintPlan(BaseDeDatos.getList());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                } else if (anio == 2) {
                    try {
                        PrintMesaExamen(BaseDeDatos.getListMesas());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                } else if (anio == 3) {
                    System.out.println("Ingrese los terminos de busqueda");
                    String terminos = consola1.nextLine();
                    BuscarPlanesImpl buscador = new BuscarPlanesImpl();
                    List<Plan> planesEncontrados = buscador.buscar(terminos);
                    PrintPlan(planesEncontrados);

                } else if (anio == 4) {
                    System.out.println("Ingrese el año a buscar");
                    anio = consola.nextInt();
                    PrintPlanDetalle(anio, buscados);

                } else if(anio == 5) {
                    System.out.println("Ingrese los terminos de busqueda");
                    String terminos = consola2.nextLine();
                    BuscarMesasExamen buscador = new BuscarMesasExamen();
                    List<MesaExamen> mesasEncontradas = buscador.buscar(terminos);
                    PrintMesaExamen(mesasEncontradas); 
                }

            }
        } while (anio != 0);

        System.out.println("------------------------------------------------------------------");
        System.out.println("|            " + "Gracias por utilizar Monserrat Buscador" + "             |");
        System.out.println("------------------------------------------------------------------");
        consola.close();
        consola1.close();
        consola2.close();
    }

    static void PrintPlanDetalle(int anio, List<Plan> buscados) {

        List<Plan> plan1 = new ArrayList<>();

        for (int ii = 0; ii < buscados.size(); ii++) {
            Plan plan = buscados.get(ii);
            if (plan.getAnio().intValue() == anio) {
                plan1.add(plan);
                PrintPlan(plan1);
                break;
            } else if (ii == buscados.size() - 1) {
                System.out.println("No se encontro el plan. Ingrese un valor de la busqueda realizada.");
            }
        }
    }

    static public void PrintPlan(List<Plan> planes) {
        for (Plan plan1 : planes) {
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
    }

    static public void PrintMesaExamen(List<MesaExamen> mesas) {
        for (MesaExamen mesa : mesas) {
            System.out.println(mesa.fullToString());
            System.out.println("\n");
        }
    }

    static private int ContarMaterias(Plan plan) {
        int cantidad = 0;
        for (AnioPlan anio : plan.getAnios()) {
            cantidad = anio.getMaterias().size() + cantidad;
        }
        return cantidad;
    }

    static private String DevolverEstado(Plan plan) {

        if (plan.isEstadoActivo()) {
            return "ACTIVO";
        }
        if (plan.isEstadoBorrador()) {
            return "BORRADOR";
        }
        if (plan.isEstadoNoActivo()) {
            return "NO ACTIVO";
        } else {
            return null;
        }
    }

}
