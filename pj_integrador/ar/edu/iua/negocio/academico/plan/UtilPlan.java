package pj_integrador.ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import pj_integrador.ar.edu.iua.modelo.academico.plan.*;

public class UtilPlan {

    // AnioPlan generico
    //private static Integer[] numero1 = { 1, 2, 3, 4, 5, 6, 7 };
    //private static String[] nombreAnio = { "Primer anio", "Segundo Anio", "Tercer Anio", "Cuarto Anio", "Quinto Anio",
    //        "Sexto Anio", "Septimo Anio" };

    // primer anio 2018
    private static String[] codigo1_18 = { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011",
            "012" };
    private static String[] nombre1_18 = { "Ciencias de la Vida y de la Tierra", "Lengua y Literatura Castellanas I",
            "Lengua y Cultura Latinas I", "Lengua y Cultura Inglesas I", "Formacion Musical I", "Formacion Plastica I",
            "Matematica I", "Geografia I", "Historia I", "Formacion Etica y Ciudadana I",
            "Estrategias de Aprendizaje y Entornos Virtuales",
            "Educacion Fisica y Deportes I" };
    private static Double[] cargaHoraria1_18 = { 3.0, 5.0, 4.0, 3.0, 3.0, 3.0, 4.0, 3.0, 3.0, 3.0, 4.0, null };

    // segundo anio 2018
    private static String[] codigo2_18 = { "013", "014", "015", "016", "017", "018", "019", "020", "021", "022", "023",
            "024", "025", "026" };
    private static String[] nombre2_18 = { "Eduacion para la salud", "Lengua y Literatura Castellanas II",
            "Lengua y Cultura Latinas II", "Lengua y Cultura Inglesas II", "Formacion Musical II",
            "Formacion Plastica II", "Matematica II", "Geografia II", "Historia II", "Formacion Etica y Ciudadana II",
            "Educacion Fisica y Deportes II", "Espacios Optativos", "Proyectos Sociocomunicatorios" };
    private static Double[] cargaHoraria2_18 = { 4.0, 5.0, 4.0, 3.0, 3.0, 3.0, 4.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0,
            null };

    // tercer anio 2018
    private static String[] codigo3_18 = { "027", "028", "029", "030", "031", "032", "033", "034", "035", "036", "037",
            "038", "039", "040", "041" };
    private static String[] nombre3_18 = { "Ciencias Naturales", "Lengua y Literatura Castellanas III",
            "Lengua y Cultura Latinas III", "Lengua y Culturas Inglesas III", "Formacion Plastica III",
            "Matematica III", "Geografia III", "Historia III", "Formacion Etica y Ciudadana III",
            "Educacion Tecnologica", "Educacion Fisica y Deportes III", "Espacios Optativos 2020/2021",
            "Espacios Optativos 2021", "Espacios Optativos 2022", "Proyectos Sociocomunitarios" };
    private static Double[] cargaHoraria3_18 = { 3.0, 5.0, 4.0, 3.0, 3.0, 4.0, 3.0, 4.0, 3.0, 3.0, 3.0, null, 3.0, 3.0,
            null };

    // cuarto anio 2018
    private static String[] codigo4_18 = { "042", "043", "044", "045", "046", "047", "048", "049", "050", "051", "052",
            "053", "054", "055" };
    private static String[] nombre4_18 = { "Biologia", "Fisico-Quimica", "Lengua y Literatura Castellanas IV",
            "Lengua y Cultura Latinas IV", "Lengua y Cultura Inglesa IV", "Lengua y Cultura Francesas I",
            "Historia del Arte", "Matemica IV", "Geografia IV", "Historia IV", "Educacion Fisica y Escuadras",
            "Espacios Optativos 2020/2021", "Espacios Optativos 2021", "Espacios Optativos 2022" };
    private static Double[] cargaHoraria4_18 = { 3.0, 3.0, 4.0, 4.0, 3.0, 3.0, 3.0, 5.0, 3.0, 4.0, 3.0, null, 3.0,
            3.0 };

    // quinto anio 2018
    private static String[] codigo5_18 = { "056", "057", "058", "059", "060", "061", "062", "063", "064", "065",
            "066", "067", "068" };
    private static String[] nombre5_18 = { "Biologia II", "Quimica", "Lengua y Literatura Castellanas IV",
            "Lengua y Cultura Griegas", "Lengua y Cultura Inglesas IV", "Lengua y Cultura Francesas II", "Matematica V",
            "Geografia V", "Historia V", "Logica", "Educacion Fisica y Escuadras", "Espacios Optativos 2022",
            "Proyectos Sociocomunitarios" };
    private static Double[] cargaHoraria5_18 = { 3.0, 4., 4.0, 3.0, 3.0, 3.0, 5.0, 3.0, 4.0, 3.0, 3.0, 3.0, null };

    // primer anio 2001

    // segundo anio 2001

    // tercer anio 2001

    // cuarto anio 2001

    // quinto anio 2001

    // sexto anio 2001
    private static String[] codigo6_01 = {};
    private static String[] nombre6_01 = {};
    private static Double[] cargaHoraria6_01 = {};

    // septimo anio 2001
    private static String[] codigo7_01 = {};
    private static String[] nombre7_01 = {};
    private static Double[] cargaHoraria7_01 = {};

    public static Plan[] buildPlanes() {
        Materia m1 = new Materia();
        AnioPlan a1 = new AnioPlan();
        Plan p1 = new Plan();
        List<Materia> listaMateria1 = new ArrayList<Materia>();
        List<AnioPlan> listaAnioPlan1 = new ArrayList<AnioPlan>();
        Plan[] arregloPlan = new Plan[2];

        Integer[] numero1 = { 1, 2, 3, 4, 5, 6, 7 };
        String[] nombreAnio = { "Primer anio", "Segundo Anio", "Tercer Anio", "Cuarto Anio", "Quinto Anio",
                    "Sexto Anio", "Septimo Anio" };

        // *****************plan de estudios 2018*******************
        // plan 2018
        p1.setAnio(2018);
        p1.setEstadoActivo();

        // AniosPlan
        for (int ii = 0; ii < numero1.length; ii++) {
            a1.setNumero(numero1[ii]);
            a1.setNombre(nombreAnio[ii]);
            listaAnioPlan1.add(a1);
        }

        // a cada AnioPlan le seteamos el plan 2018
        for (int ii = 0; ii < listaAnioPlan1.size(); ii++) {
            listaAnioPlan1.get(ii).setPlan(p1);
        }

        // primer anio
        // creamos listado de materias de primer anio
        for (int ii = 0; ii < nombre1_18.length; ii++) {
            m1.setCodigo(codigo1_18[ii]);
            m1.setNombre(nombre1_18[ii]);
            m1.setCargaHoraria(cargaHoraria1_18[ii]);
            listaMateria1.add(m1);
        }

        // a cada materia de 1er anio le seteamos el anioPlan 1er anio
        for (int ii = 0; ii < listaMateria1.size(); ii++) {
            listaMateria1.get(ii).setAnio(listaAnioPlan1.get(0));
        }

        // al anioPlan 1er anio, le seteamos el listado de materias
        listaAnioPlan1.get(0).setMaterias(listaMateria1);
        listaMateria1.clear();

        // segundo anio
        // creamos listado de materias de segundo anio
        for (int ii = 0; ii < nombre2_18.length; ii++) {
            m1.setCodigo(codigo2_18[ii]);
            m1.setNombre(nombre2_18[ii]);
            m1.setCargaHoraria(cargaHoraria2_18[ii]);
            listaMateria1.add(m1);
        }

        // a cada materia de 2do anio le seteamos el anioPlan 2do anio
        for (int ii = 0; ii < listaMateria1.size(); ii++) {
            listaMateria1.get(ii).setAnio(listaAnioPlan1.get(1));
        }

        // al anioPlan 2do anioo, le seteamos el listado de materias
        listaAnioPlan1.get(1).setMaterias(listaMateria1);
        listaMateria1.clear();

        // tercer anio
        // creamos listado de materias de tercer anio
        for (int ii = 0; ii < nombre3_18.length; ii++) {
            m1.setCodigo(codigo3_18[ii]);
            m1.setNombre(nombre3_18[ii]);
            m1.setCargaHoraria(cargaHoraria3_18[ii]);
            listaMateria1.add(m1);
        }

        // a cada materia de 3er anio le seteamos el anioPlan 3er anio
        for (int ii = 0; ii < listaMateria1.size(); ii++) {
            listaMateria1.get(ii).setAnio(listaAnioPlan1.get(2));
        }

        // al anioPlan 3er anio, le seteamos el listado de materias
        listaAnioPlan1.get(2).setMaterias(listaMateria1);
        listaMateria1.clear();

        // cuarto anio
        // creamos listado de materias de 4to
        for (int ii = 0; ii < nombre4_18.length; ii++) {
            m1.setCodigo(codigo4_18[ii]);
            m1.setNombre(nombre4_18[ii]);
            m1.setCargaHoraria(cargaHoraria4_18[ii]);
            listaMateria1.add(m1);
        }

        // a cada materia de 4to anio le seteamos el anioPlan 4to anio
        for (int ii = 0; ii < listaMateria1.size(); ii++) {
            listaMateria1.get(ii).setAnio(listaAnioPlan1.get(3));
        }

        // al anioPlan 4to anio, le seteamos el listado de materias
        listaAnioPlan1.get(3).setMaterias(listaMateria1);
        listaMateria1.clear();

        // quinto anio
        // creamos listado de materias de 5to
        for (int ii = 0; ii < nombre5_18.length; ii++) {
            m1.setCodigo(codigo5_18[ii]);
            m1.setNombre(nombre5_18[ii]);
            m1.setCargaHoraria(cargaHoraria5_18[ii]);
            listaMateria1.add(m1);
        }

        // a cada materia de 5to anio le seteamos el anioPlan 5to anio
        for (int ii = 0; ii < listaMateria1.size(); ii++) {
            listaMateria1.get(ii).setAnio(listaAnioPlan1.get(4));
        }

        // al anioPlan 5to anio, le seteamos el listado de materias
        listaAnioPlan1.get(4).setMaterias(listaMateria1);
        listaMateria1.clear();

        // al objeto anio p1 le agramos la listas de anioPlan
        p1.setAnios(listaAnioPlan1);
        arregloPlan[0] = p1;

        /*
         * // *****************plan de estudios 2001*******************
         * 
         * // sexto anio
         * // creamos listado de materias de 6to
         * for (int ii = 0; ii < nombre6_18.length; ii++) {
         * m1.setCodigo(codigo6_18[ii]);
         * m1.setNombre(nombre6_18[ii]);
         * m1.setCargaHoraria(cargaHoraria6_18[ii]);
         * listaMateria1.add(m1);
         * }
         * 
         * // a cada materia de 6to anio le seteamos el anioPlan 6to anio
         * for (int ii = 0; ii < listaMateria1.size(); ii++) {
         * listaMateria1.get(ii).setAnio(listaAnioPlan1.get(5));
         * }
         * 
         * // al anioPlan 6to anio, le seteamos el listado de materias
         * listaAnioPlan1.get(5).setMaterias(listaMateria1);
         * listaMateria1.clear();
         * 
         * // septimo anio
         * // creamos listado de materias de 7to
         * for (int ii = 0; ii < nombre7_18.length; ii++) {
         * m1.setCodigo(codigo7_18[ii]);
         * m1.setNombre(nombre7_18[ii]);
         * m1.setCargaHoraria(cargaHoraria5_18[ii]);
         * listaMateria1.add(m1);
         * }
         * 
         * // a cada materia de 7to anio le seteamos el anioPlan 7to anio
         * for (int ii = 0; ii < listaMateria1.size(); ii++) {
         * listaMateria1.get(ii).setAnio(listaAnioPlan1.get(6));
         * }
         * 
         * // al anioPlan 7to anio, le seteamos el listado de materias
         * listaAnioPlan1.get(6).setMaterias(listaMateria1);
         * listaMateria1.clear();
         */
        return arregloPlan;
    }
}