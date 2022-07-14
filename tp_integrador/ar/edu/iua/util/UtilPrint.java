package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class UtilPrint {
    static public void PrintBusqueda(List<Plan> buscados) {

        int anio = 0;
        Scanner consola = new Scanner(System.in);

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
                    "---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(
                    "| " + "Ingrese el anio para ver las materias. Ingrese 1 para ver la BD. Ingrese 2 para ver las mesas de examen. Ingrese 0 para salir"
                            + " |");
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------");
            anio = consola.nextInt();
            if (anio != 0) {
                if (anio == 1) {
                    try {
                        PrintPlan(BaseDeDatos.getList());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
                else if(anio == 2){
                    try {
                        PrintMesaExamen(BaseDeDatos.getListMesas());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    PrintPlanDetalle(anio, buscados);
                }

                }
            }while (anio != 0);

        System.out.println("------------------------------------------------------------------");
        System.out.println("|            " + "Gracias por utilizar Monserrat Buscador" + "             |");
        System.out.println("------------------------------------------------------------------");
        consola.close();
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

    static public void PrintMesaExamen (List<MesaExamen> mesas){
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
