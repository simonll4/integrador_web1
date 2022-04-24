package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.*;

public class GenerarEjemplosDePlanes {


    // Este metodo primero crea 2 planes, segun https://monserrat.unc.edu.ar/secundario/plan-de-estudios/#1523542585948-acc3dfd8-8da3
    // y tambien crea de forma aleatoria una determinada cantidad de planes
    public static List<Plan> generar(int cantidadAGenerar, boolean imprimirResultado) {

        List<Plan> planes = new ArrayList<Plan>();

        // ==========================================================================

        // PLAN 2018

        Plan plan2018 = new PlanImpl();

        plan2018.setAnio(2018);
        plan2018.setEstadoActivo();

        planes.add(plan2018);

        // AÑOS DEL PLAN 2018

        AnioPlan primero = new AnioPlanImpl(plan2018, 1, "Primer año");
        AnioPlan segundo = new AnioPlanImpl(plan2018, 2, "Segundo año");
        AnioPlan tercero = new AnioPlanImpl(plan2018, 3, "Tercero año");
        AnioPlan cuarto = new AnioPlanImpl(plan2018, 4, "Cuarto año");
        AnioPlan quinto = new AnioPlanImpl(plan2018, 5, "Quinto año");

        plan2018.getAnios().add(primero);
        plan2018.getAnios().add(segundo);
        plan2018.getAnios().add(tercero);
        plan2018.getAnios().add(cuarto);
        plan2018.getAnios().add(quinto);

        // MATEIAS DEL PLAN 2018 - PRIMER AÑO

        int codigoMateria = 1;

        Materia m1 = new MateriaImpl(primero, codigoMateria, "Ciencias de la Vida y de la Tierra ", 3.0);
        Materia m2 = new MateriaImpl(primero, codigoMateria++, "Lengua y Literatura Castellanas I", 5.0);
        Materia m3 = new MateriaImpl(primero, codigoMateria++, "Lengua y Cultura Latinas I ", 4.0);
        Materia m4 = new MateriaImpl(primero, codigoMateria++, "Lengua y Cultura Inglesas I ", 3.0);
        Materia m5 = new MateriaImpl(primero, codigoMateria++, "Formación Musical I ", 3.0);
        Materia m6 = new MateriaImpl(primero, codigoMateria++, "Formación Plástica I ", 3.0);
        Materia m7 = new MateriaImpl(primero, codigoMateria++, "Matemática I", 4.0);
        Materia m8 = new MateriaImpl(primero, codigoMateria++, "Geografía I ", 3.0);
        Materia m9 = new MateriaImpl(primero, codigoMateria++, "Historia I", 3.0);
        Materia m10 = new MateriaImpl(primero, codigoMateria++, "Formación Ética y Ciudadana I", 3.0);
        Materia m11 = new MateriaImpl(primero, codigoMateria++, "Estrategias de Aprendizaje y Entornos Virtuales",
                4.0);
        Materia m12 = new MateriaImpl(primero, codigoMateria++, "Educación Física y Deportes I", 0.0);

        primero.getMaterias().add(m1);
        primero.getMaterias().add(m2);
        primero.getMaterias().add(m3);
        primero.getMaterias().add(m4);
        primero.getMaterias().add(m5);
        primero.getMaterias().add(m6);
        primero.getMaterias().add(m7);
        primero.getMaterias().add(m8);
        primero.getMaterias().add(m9);
        primero.getMaterias().add(m10);
        primero.getMaterias().add(m11);
        primero.getMaterias().add(m12);

        // MATEIAS DEL PLAN 2018 - SEGUNDO AÑO

        codigoMateria = 1;

        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Educación para la Salud", 4.0));
        segundo.getMaterias()
                .add(new MateriaImpl(segundo, codigoMateria++, "Lengua y Literatura Castellanas II ", 5.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Lengua y Cultura Latinas II ", 4.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Lengua y Cultura Inglesas II  ", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Formación Musical II ", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Formación Plástica II ", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Matemática II ", 4.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Geografía II ", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Historia II", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Formación Ética y Ciudadana II", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Educación Física y Deportes II", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Espacios Optativos 2019/2021", 3.0));
        segundo.getMaterias().add(new MateriaImpl(segundo, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - TERCER AÑO

        codigoMateria = 1;

        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria, "Ciencias Naturales", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Lengua y Literatura Castellanas III", 5.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Lengua y Cultura Latinas III", 4.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Lengua y Cultura Inglesas III", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Formacion Plastica III", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Matematica III", 4.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Geografia III", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Historia III", 4.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Formacion Etica y Ciudadana III", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Educacion Tecnologica", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Educacion Fisica y Deportes III", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2020/2021", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2021", 3.0));
        tercero.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - CUARTO AÑO

        codigoMateria = 1;

        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria, "Biologia I", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Fisico-Quimica", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Lengua y Literatura Castellanas IV", 4.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Lengua y Cultura Latinas IV", 4.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Lengua y Cultura Inglesas IV", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Lengua y Cultura Francesas I", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Historia del Arte", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Matematica IV", 5.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Geografia IV", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Historia IV", 4.0));
        cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoMateria++, "Educacion Fisica y Escuadras I", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2020/2021", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2021", 3.0));
        cuarto.getMaterias().add(new MateriaImpl(tercero, codigoMateria++, "Espacios Optativos 2022", 3.0));

        // MATERIAS DEL PLAN 2018 - QUINTO AÑO

        codigoMateria = 1;

        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria, "Biologia II", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Quimica", 4.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Lengua y Literatura Castellana IV", 4.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Lengua y Culturas Griegas", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Lengua y Cultura Inglesas IV", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Lengua y Cultura Francesas II", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Matematica V", 5.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Geografia V", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Historia V", 4.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Logica", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Educacion Fisica y Escuadras", 3.0));
        quinto.getMaterias().add(new MateriaImpl(quinto, codigoMateria++, "Espacios Optativos", 3.0));

        //  ... por favor complete el codigo faltante 

        // PLAN 2001

        Plan plan2001 = new PlanImpl();

        plan2001.setAnio(2001);
        plan2001.setEstadoNoActivo();

        planes.add(plan2001);

        // AÑOS DEL PLAN 2001

        AnioPlan primero2001 = new AnioPlanImpl(plan2001, 1, "Primer año");
        AnioPlan segundo2001 = new AnioPlanImpl(plan2001, 2, "Segundo año");
        AnioPlan tercero2001 = new AnioPlanImpl(plan2001, 3, "Tercero año");
        AnioPlan cuarto2001 = new AnioPlanImpl(plan2001, 4, "Cuarto año");
        AnioPlan quinto2001 = new AnioPlanImpl(plan2001, 5, "Quinto año");
        AnioPlan sexto2001 = new AnioPlanImpl(plan2001, 6, "Sexto año");
        AnioPlan septimo2001 = new AnioPlanImpl(plan2001, 7, "Septimo año");

        // MATERIAS DEL PLAN 2001 - PRIMER AÑO

        codigoMateria = 1; 

        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria, "Lengua y Literatura I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Lengua y Culturas Latinas I", 5.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Ingles I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Geografia I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Historia I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Matematica I", 4.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Plastica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Musica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Ciencias Naturales I", 3.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Tecnicas de Trabajo Intelectual I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Informatica I", 2.0));
        primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoMateria++, "Educacion Fisica I", 2.0));





        //  ... por favor complete el codigo faltante

        // ==========================================================================

        generarYAgregarPlanesAleatoriamente(cantidadAGenerar, planes);

        // ==========================================================================

        if (imprimirResultado) {
            imprimirPlanes(planes);
        }

        return planes;

    }

    private static void generarYAgregarPlanesAleatoriamente(int cantidadAGenerar, List<Plan> planes){
        // todos los planes q se generen deben agregarse al parametro planes
         
        
        // ... por favor complete el codigo faltante
    } 


    private static void imprimirPlanes(List<Plan> planes) {
        for (Plan plan : planes) {
            System.out.println("\n" + plan);
            for (AnioPlan anio : plan.getAnios()) {
                System.out.println("\t" + anio);
                for (Materia materia : anio.getMaterias()) {
                    System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo()) + " - " + materia);
                }
                if (anio.getMaterias().size() == 0) {
                    System.out.println("\t\tA este año no se le cargaron materias!!");
                }
            }
            if (plan.getAnios().size() == 0) {
                System.out.println("\tA este plan no se le cargaron años!!");
            }

        }
    }

}
