package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.*;

public class GenerarEjemplosDePlanes {

        // Este metodo primero crea 2 planes, segun
        // https://monserrat.unc.edu.ar/secundario/plan-de-estudios/#1523542585948-acc3dfd8-8da3
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

                // MATERIAS DEL PLAN 2018 - PRIMER AÑO

                int codigoVerificacion = 1;
                int codigoMateria = 1;

                Materia m1 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Lengua y Literatura Castellanas I", 5.0);
                Materia m2 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Latinas I ", 4.0);
                Materia m3 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Inglesas I ", 3.0);
                Materia m4 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria, "Geografía I ", 3.0);
                Materia m5 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria, "Historia I", 3.0);
                Materia m6 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria, "Matemática I", 4.0);
                Materia m7 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria, "Formación Plástica I ",
                                3.0);
                Materia m8 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria, "Formación Musical I ", 3.0);
                Materia m9 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Ciencias de la Vida y de la Tierra ", 3.0);
                Materia m10 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Formación Ética y Ciudadana I", 3.0);
                Materia m11 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Estrategias de Aprendizaje y Entornos Virtuales",
                                4.0);
                Materia m12 = new MateriaImpl(primero, codigoVerificacion++, codigoMateria,
                                "Educación Física y Deportes I", 0.0);

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

                for (int ii = 0; ii < primero.getMaterias().size(); ii++) {
                        primero.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + primero.getPlan().getAnio().toString()
                                        + primero.getNumero().toString()
                                        + primero.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATEIAS DEL PLAN 2018 - SEGUNDO AÑO

                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellanas II ",
                                                5.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas II ", 4.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Inglesas II  ", 3.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Formación Ética y Ciudadana II", 3.0));
                segundo.getMaterias().add(
                                new MateriaImpl(segundo, codigoVerificacion++, codigoMateria, "Geografía II ", 3.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria, "Historia II", 3.0));
                segundo.getMaterias().add(
                                new MateriaImpl(segundo, codigoVerificacion++, codigoMateria, "Matemática II ", 4.0));
                segundo.getMaterias().add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                "Formación Plástica II ", 3.0));
                segundo.getMaterias().add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                "Formación Musical II ", 3.0));
                segundo.getMaterias().add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                "Educación para la Salud", 4.0));
                segundo.getMaterias().add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2022", 3.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Educación Física y Deportes II", 3.0));
                segundo.getMaterias()
                                .add(new MateriaImpl(segundo, codigoVerificacion++, codigoMateria,
                                                "Espacios Optativos 2019/2021", 3.0));

                for (int ii = 0; ii < segundo.getMaterias().size(); ii++) {
                        segundo.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + segundo.getPlan().getAnio().toString()
                                        + segundo.getNumero().toString()
                                        + segundo.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2018 - TERCER AÑO

                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellanas III",
                                                5.0));
                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas III", 4.0));
                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Inglesas III", 3.0));
                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Formacion Etica y Ciudadana III", 3.0));
                tercero.getMaterias().add(
                                new MateriaImpl(tercero, codigoVerificacion++, codigoMateria, "Geografia III", 3.0));
                tercero.getMaterias().add(
                                new MateriaImpl(tercero, codigoVerificacion++, codigoMateria, "Historia III", 4.0));
                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Espacios Optativos 2020/2021", 3.0));
                tercero.getMaterias().add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                "Formacion Plastica III", 3.0));
                tercero.getMaterias().add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2021", 3.0));
                tercero.getMaterias().add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                "Ciencias Naturales", 3.0));
                tercero.getMaterias().add(
                                new MateriaImpl(tercero, codigoVerificacion++, codigoMateria, "Matematica III", 4.0));
                tercero.getMaterias()
                                .add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica y Deportes III", 3.0));
                tercero.getMaterias().add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                "Educacion Tecnologica", 3.0));
                tercero.getMaterias().add(new MateriaImpl(tercero, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2022", 3.0));

                for (int ii = 0; ii < tercero.getMaterias().size(); ii++) {
                        tercero.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + tercero.getPlan().getAnio().toString()
                                        + tercero.getNumero().toString()
                                        + tercero.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2018 - CUARTO AÑO

                cuarto.getMaterias().add(
                                new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellanas IV", 4.0));
                cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Latinas IV", 4.0));
                cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Inglesas IV", 3.0));
                cuarto.getMaterias()
                                .add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Geografia IV", 3.0));
                cuarto.getMaterias()
                                .add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Historia IV", 4.0));
                cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Francesas I", 3.0));
                cuarto.getMaterias().add(
                                new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Historia del Arte", 3.0));
                cuarto.getMaterias()
                                .add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                                "Espacios Optativos 2020/2021", 3.0));
                cuarto.getMaterias().add(
                                new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Matematica IV", 5.0));
                cuarto.getMaterias()
                                .add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Biologia I", 3.0));
                cuarto.getMaterias().add(
                                new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria, "Fisico-Quimica", 3.0));
                cuarto.getMaterias()
                                .add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica y Escuadras I", 3.0));
                cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2021", 3.0));
                cuarto.getMaterias().add(new MateriaImpl(cuarto, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2022", 3.0));

                for (int ii = 0; ii < cuarto.getMaterias().size(); ii++) {
                        cuarto.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + cuarto.getPlan().getAnio().toString()
                                        + cuarto.getNumero().toString()
                                        + cuarto.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }
                // MATERIAS DEL PLAN 2018 - QUINTO AÑO

                quinto.getMaterias().add(
                                new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellana IV", 4.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos", 3.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                "Lengua y Culturas Griegas", 3.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Inglesas IV", 3.0));
                quinto.getMaterias()
                                .add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Francesas II", 3.0));
                quinto.getMaterias()
                                .add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Geografia V", 3.0));
                quinto.getMaterias()
                                .add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Historia V", 4.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Quimica", 4.0));
                quinto.getMaterias()
                                .add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Biologia II", 3.0));
                quinto.getMaterias()
                                .add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Matematica V", 5.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria, "Logica", 3.0));
                quinto.getMaterias().add(new MateriaImpl(quinto, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica y Escuadras", 3.0));

                for (int ii = 0; ii < quinto.getMaterias().size(); ii++) {
                        quinto.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + quinto.getPlan().getAnio().toString()
                                        + quinto.getNumero().toString()
                                        + quinto.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // PLAN 2014

                Plan plan2014 = new PlanImpl();

                plan2014.setAnio(2014);
                plan2014.setEstadoNoActivo();

                planes.add(plan2014);

                // AÑOS DEL PLAN 2014

                AnioPlan primero2014 = new AnioPlanImpl(plan2014, 1, "Primer año");
                AnioPlan segundo2014 = new AnioPlanImpl(plan2014, 2, "Segundo año");
                AnioPlan tercero2014 = new AnioPlanImpl(plan2014, 3, "Tercero año");
                AnioPlan cuarto2014 = new AnioPlanImpl(plan2014, 4, "Cuarto año");
                AnioPlan quinto2014 = new AnioPlanImpl(plan2014, 5, "Quinto año");

                plan2014.getAnios().add(primero2014);
                plan2014.getAnios().add(segundo2014);
                plan2014.getAnios().add(tercero2014);
                plan2014.getAnios().add(cuarto2014);
                plan2014.getAnios().add(quinto2014);

                // MATERIAS DEL PLAN 2014 - PRIMER AÑO

                codigoVerificacion = 1;

                primero2014.getMaterias()
                                .add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura I", 5.0));
                primero2014.getMaterias()
                                .add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Culturas Latinas I", 5.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Ingles I", 3.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Geografia I", 3.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Historia I", 2.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Matematica I", 4.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Plastica I", 2.0));
                primero2014.getMaterias().add(
                                new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria, "Musica I", 2.0));
                primero2014.getMaterias()
                                .add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                                "Ciencias Naturales I", 3.0));
                primero2014.getMaterias().add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                "Tecnicas de Trabajo Intelectual I", 2.0));
                primero2014.getMaterias().add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                "Informatica I", 2.0));
                primero2014.getMaterias().add(new MateriaImpl(primero2014, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica I", 2.0));

                for (int ii = 0; ii < primero2014.getMaterias().size(); ii++) {
                        primero2014.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + primero2014.getPlan().getAnio().toString()
                                        + primero2014.getNumero().toString()
                                        + primero2014.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATEIAS DEL PLAN 2014 - SEGUNDO AÑO

                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellanas II ",
                                                5.0));
                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas II ", 4.0));
                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Inglesas II  ", 3.0));
                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Formación Ética y Ciudadana II", 3.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Geografía II ", 3.0));
                segundo2014.getMaterias().add(
                                new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria, "Historia II", 3.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Matemática II ", 4.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Formación Plástica II ", 3.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Formación Musical II ", 3.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Educación para la Salud", 4.0));
                segundo2014.getMaterias().add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2022", 3.0));
                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Educación Física y Deportes II", 3.0));
                segundo2014.getMaterias()
                                .add(new MateriaImpl(segundo2014, codigoVerificacion++, codigoMateria,
                                                "Espacios Optativos 2019/2021", 3.0));

                for (int ii = 0; ii < segundo2014.getMaterias().size(); ii++) {
                        segundo2014.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + segundo2014.getPlan().getAnio().toString()
                                        + segundo2014.getNumero().toString()
                                        + segundo2014.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2014 - TERCER AÑO

                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura III", 5.0));
                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas III",
                                                4.0));
                tercero2014.getMaterias().add(
                                new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria, "Ingles III", 3.0));
                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Formacion Etica y Civica II", 2.0));
                tercero2014.getMaterias().add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                "Geografía III", 3.0));
                tercero2014.getMaterias().add(
                                new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria, "Historia III", 4.0));
                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Historia Del Arte I", 2.0));
                tercero2014.getMaterias().add(
                                new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria, "Plastica III", 2.0));
                tercero2014.getMaterias().add(
                                new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria, "Musica III", 2.0));
                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Ciencias Naturales III", 3.0));
                tercero2014.getMaterias().add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                "Matemática III", 5.0));
                tercero2014.getMaterias()
                                .add(new MateriaImpl(tercero2014, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica III", 2.0));

                for (int ii = 0; ii < tercero2014.getMaterias().size(); ii++) {
                        tercero2014.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + tercero2014.getPlan().getAnio().toString()
                                        + tercero2014.getNumero().toString()
                                        + tercero2014.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2014 - CUARTO AÑO

                cuarto2014.getMaterias().add(
                                new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura Castellanas IV", 4.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Latinas IV", 4.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Inglesas IV", 3.0));
                cuarto2014.getMaterias().add(
                                new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria, "Geografia IV", 3.0));
                cuarto2014.getMaterias().add(
                                new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria, "Historia IV", 4.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Lengua y Cultura Francesas I", 3.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Historia del Arte", 3.0));
                cuarto2014.getMaterias()
                                .add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                                "Espacios Optativos 2020/2021", 3.0));
                cuarto2014.getMaterias().add(
                                new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria, "Matematica IV", 5.0));
                cuarto2014.getMaterias().add(
                                new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria, "Biologia I", 3.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Fisico-Quimica", 3.0));
                cuarto2014.getMaterias()
                                .add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica y Escuadras I", 3.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2021", 3.0));
                cuarto2014.getMaterias().add(new MateriaImpl(cuarto2014, codigoVerificacion++, codigoMateria,
                                "Espacios Optativos 2022", 3.0));

                for (int ii = 0; ii < cuarto2014.getMaterias().size(); ii++) {
                        cuarto2014.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + cuarto2014.getPlan().getAnio().toString()
                                        + cuarto2014.getNumero().toString()
                                        + cuarto2014.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2014 - QUINTO AÑO

                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura V", 4.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas V", 2.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Griegas I", 4.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Ingles V", 3.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Frances I", 3.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Geografía V", 3.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Historia V", 4.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Quimica I", 2.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Biologia II", 2.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Matemática V - Algebra ", 3.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Estadistica y Probabilidades", 3.0));
                quinto2014.getMaterias().add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica V", 2.0));
                quinto2014.getMaterias().add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                "Informatica II", 2.0));
                quinto2014.getMaterias()
                                .add(new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria,
                                                "Metodologia De La Investigacion",
                                                2.0));
                quinto2014.getMaterias().add(
                                new MateriaImpl(quinto2014, codigoVerificacion++, codigoMateria, "Filosofia I", 2.0));

                for (int ii = 0; ii < quinto2014.getMaterias().size(); ii++) {
                        quinto2014.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + quinto2014.getPlan().getAnio().toString()
                                        + quinto2014.getNumero().toString()
                                        + quinto2014.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

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

                plan2001.getAnios().add(primero2001);
                plan2001.getAnios().add(segundo2001);
                plan2001.getAnios().add(tercero2001);
                plan2001.getAnios().add(cuarto2001);
                plan2001.getAnios().add(quinto2001);
                plan2001.getAnios().add(sexto2001);
                plan2001.getAnios().add(septimo2001);

                // MATERIAS DEL PLAN 2001 - PRIMER AÑO
                codigoVerificacion = 1;

                primero2001.getMaterias()
                                .add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura I", 5.0));
                primero2001.getMaterias()
                                .add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Culturas Latinas I", 5.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Ingles I", 3.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Geografia I", 3.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Historia I", 2.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Matematica I", 4.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Plastica I", 2.0));
                primero2001.getMaterias().add(
                                new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria, "Musica I", 2.0));
                primero2001.getMaterias()
                                .add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                                "Ciencias Naturales I", 3.0));
                primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                "Tecnicas de Trabajo Intelectual I", 2.0));
                primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                "Informatica I", 2.0));
                primero2001.getMaterias().add(new MateriaImpl(primero2001, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica I", 2.0));

                for (int ii = 0; ii < primero2001.getMaterias().size(); ii++) {
                        primero2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + primero2001.getPlan().getAnio().toString()
                                        + primero2001.getNumero().toString()
                                        + primero2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - SEGUNDO AÑO

                segundo2001.getMaterias()
                                .add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura II", 5.0));
                segundo2001.getMaterias()
                                .add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas II", 5.0));
                segundo2001.getMaterias().add(
                                new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria, "Ingles II", 3.0));
                segundo2001.getMaterias()
                                .add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                                "Formacion Etica y Civica I", 2.0));
                segundo2001.getMaterias().add(
                                new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria, "Geografía II", 3.0));
                segundo2001.getMaterias().add(
                                new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria, "Historia II", 4.0));
                segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                "Matemática II", 4.0));
                segundo2001.getMaterias().add(
                                new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria, "Plastica II", 2.0));
                segundo2001.getMaterias().add(
                                new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria, "Musica II", 2.0));
                segundo2001.getMaterias()
                                .add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                                "Ciencias Naturales II", 3.0));
                segundo2001.getMaterias().add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                "Tecnicas De Trabajo Intelectual II", 2.0));
                segundo2001.getMaterias()
                                .add(new MateriaImpl(segundo2001, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica II", 2.0));

                for (int ii = 0; ii < segundo2001.getMaterias().size(); ii++) {
                        segundo2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + segundo2001.getPlan().getAnio().toString()
                                        + segundo2001.getNumero().toString()
                                        + segundo2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - TERCER AÑO

                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura III", 5.0));
                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas III",
                                                4.0));
                tercero2001.getMaterias().add(
                                new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria, "Ingles III", 3.0));
                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Formacion Etica y Civica II", 2.0));
                tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                "Geografía III", 3.0));
                tercero2001.getMaterias().add(
                                new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria, "Historia III", 4.0));
                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Historia Del Arte I", 2.0));
                tercero2001.getMaterias().add(
                                new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria, "Plastica III", 2.0));
                tercero2001.getMaterias().add(
                                new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria, "Musica III", 2.0));
                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Ciencias Naturales III", 3.0));
                tercero2001.getMaterias().add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                "Matemática III", 5.0));
                tercero2001.getMaterias()
                                .add(new MateriaImpl(tercero2001, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica III", 2.0));

                for (int ii = 0; ii < tercero2001.getMaterias().size(); ii++) {
                        tercero2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + tercero2001.getPlan().getAnio().toString()
                                        + tercero2001.getNumero().toString()
                                        + tercero2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - CUARTO AÑO

                cuarto2001.getMaterias()
                                .add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura IV", 4.0));
                cuarto2001.getMaterias()
                                .add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas IV", 5.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Ingles IV", 3.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Geografía IV", 3.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Historia IV", 4.0));
                cuarto2001.getMaterias()
                                .add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                                "Formacion Etica y Civica III", 2.0));
                cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                "Historia Del Arte II", 2.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Plastica IV", 2.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Matemática IV", 5.0));
                cuarto2001.getMaterias().add(
                                new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria, "Biologia I", 2.0));
                cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                "Fisico-quimica", 3.0));
                cuarto2001.getMaterias().add(new MateriaImpl(cuarto2001, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica IV", 2.0));

                for (int ii = 0; ii < cuarto2001.getMaterias().size(); ii++) {
                        cuarto2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + cuarto2001.getPlan().getAnio().toString()
                                        + cuarto2001.getNumero().toString()
                                        + cuarto2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - QUINTO AÑO

                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura V", 4.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Latinas V", 2.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Griegas I", 4.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Ingles V", 3.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Frances I", 3.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Geografía V", 3.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Historia V", 4.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Quimica I", 2.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Biologia II", 2.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Matemática V - Algebra ", 3.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Estadistica y Probabilidades", 3.0));
                quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica V", 2.0));
                quinto2001.getMaterias().add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                "Informatica II", 2.0));
                quinto2001.getMaterias()
                                .add(new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria,
                                                "Metodologia De La Investigacion",
                                                2.0));
                quinto2001.getMaterias().add(
                                new MateriaImpl(quinto2001, codigoVerificacion++, codigoMateria, "Filosofia I", 2.0));

                for (int ii = 0; ii < quinto2001.getMaterias().size(); ii++) {
                        quinto2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + quinto2001.getPlan().getAnio().toString()
                                        + quinto2001.getNumero().toString()
                                        + quinto2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - SEXTO AÑO

                sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                "Lengua y Literatura VI", 3.0));
                sexto2001.getMaterias()
                                .add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Griegas II", 2.0));
                sexto2001.getMaterias()
                                .add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Ingles VI", 2.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Frances II", 4.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Historia VI", 3.0));
                sexto2001.getMaterias()
                                .add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                                "Historia De La Cultura I", 2.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Geografía VI", 2.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Folosofia II", 4.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                                "Matemática VI - Trigonometria ", 2.0));
                sexto2001.getMaterias()
                                .add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Geometria", 2.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Biologia III", 3.0));
                sexto2001.getMaterias().add(
                                new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Quimica II", 3.0));
                sexto2001.getMaterias()
                                .add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria, "Fisica I", 4.0));
                sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                "Informatica III", 2.0));
                sexto2001.getMaterias().add(new MateriaImpl(sexto2001, codigoVerificacion++, codigoMateria,
                                "Educacion Fisica VI", 2.0));

                for (int ii = 0; ii < sexto2001.getMaterias().size(); ii++) {
                        sexto2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + sexto2001.getPlan().getAnio().toString()
                                        + sexto2001.getNumero().toString()
                                        + sexto2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // MATERIAS DEL PLAN 2001 - SEPTIMO AÑO

                septimo2001.getMaterias()
                                .add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Literatura VII", 3.0));
                septimo2001.getMaterias()
                                .add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                                "Lengua y Cultura Griegas III",
                                                3.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Frances III", 3.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Historia VII", 3.0));
                septimo2001.getMaterias().add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                "Filosofia III", 4.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Psicologia", 2.0));
                septimo2001.getMaterias()
                                .add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                                "Analisis Matematico y Geometria Analitica", 4.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Biologia IV", 2.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Sociologia", 3.0));
                septimo2001.getMaterias().add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                "Economia Politica", 3.0));
                septimo2001.getMaterias()
                                .add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                                "Historia De La Cultura II", 2.0));
                septimo2001.getMaterias().add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                "Elementos De Derecho Y Derecho Constitucional Argentino", 3.0));
                septimo2001.getMaterias().add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                "Informatica IV", 2.0));
                septimo2001.getMaterias()
                                .add(new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria,
                                                "Educacion Fisica VII", 2.0));
                septimo2001.getMaterias().add(
                                new MateriaImpl(septimo2001, codigoVerificacion++, codigoMateria, "Fisica II", 3.0));

                for (int ii = 0; ii < septimo2001.getMaterias().size(); ii++) {
                        septimo2001.getMaterias().get(ii).setCodigo(Integer.valueOf(""
                                        + septimo2001.getPlan().getAnio().toString()
                                        + septimo2001.getNumero().toString()
                                        + septimo2001.getMaterias().get(ii).getCodigoVerificacion().toString()));
                }

                // ==========================================================================

                generarYAgregarPlanesAleatoriamente(cantidadAGenerar, planes);

                // ==========================================================================

                if (imprimirResultado) {
                        imprimirPlanes(planes);
                }

                return planes;

        }

        private static void generarYAgregarPlanesAleatoriamente(int cantidadAGenerar, List<Plan> planes) {
                // todos los planes q se generen deben agregarse al parametro planes
                for (int ii = 0; ii < cantidadAGenerar; ii++) {
                        UtilRandom generador = new UtilRandom();
                        planes.add(generador.construirPlan(planes));
                }
                // ... por favor complete el codigo faltante
        }

        private static void imprimirPlanes(List<Plan> planes) {
                for (Plan plan : planes) {
                        System.out.println("\n" + plan);
                        for (AnioPlan anio : plan.getAnios()) {
                                System.out.println("\t" + anio);
                                for (Materia materia : anio.getMaterias()) {
                                        System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo())
                                                        + " - " + materia);
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
