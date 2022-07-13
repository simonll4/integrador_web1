package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.util.metodos_aleatorios.ObtenerMateria;
import ar.edu.iua.util.verificadores.VerificarEdadAlumno;
import ar.edu.iua.modelo.academico.examen.Alumno;
import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.modelo.academico.examen.Profesor;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.persistencia.BaseDeDatos;

public class UtilMesaRandom {

    private static int idPresidente = 0;
    private static int idVocal = 0;
    private static int idAlumno = 0;
    private static String[] apellidos = { "González", "Rodríguez", "Gomez", "Fernandez", "Lopez", "Díaz", "Martínez",
            "Perez",
            "García", "Sanchez", "Romero", "Sosa", "Torres", "Álvarez", "Ruiz", "Ramirez", "Flores", "Benitez",
            "Acosta", "Herrera", "Suárez", "Aguirre", "Giménez", "Gutiérrez", "Ipollitti", "Martinez" };
    private static String[] nombres = { "Hugo", "Mateo", "Martín", "Lucas", "Leo", "Daniel", "Alejandro", "Manuel",
            "Dilan",
            "Dipa", "Doménico", "Drago", "Edivaldo", "Elvis", "Elyan", "Gautam", "Lionel", "Simón", "Fabián", "Lucián",
            "Nicolás", "Gabriel", "Rubén", "Caleb", "Esteban", "Javier", "Ezequiel", "Renato", "Carlos", "David",
            "Eufemio", "Omar", "Omar",
            "Pablo", "Carlos", "Saúl", "Benjamín", "Darío", "Íker", "Ciro", "Daniel", "Javier" };
    private static String[] fechas = { "28-06-", "30-06-", "02-07-", "26-06-", "03-07-", "29-06-", "29-06-", "04-08-",
            "03-08-", "01-08-", "31-07-", "25-07-", "02-08-", "26-07-", "04-08-", "27-07-", "04-08-", "30-07-",
            "29-07-", "27-07-", "04-08-" };

    public static MesaExamen generarMesa() throws CloneNotSupportedException {
        MesaExamen mesaExamen = new MesaExamen();

        // obtener materia
        Materia materia = null;
        ObtenerMateria materiaObtenida = new ObtenerMateria();
        int randomPlan = (int) (Math.random() * BaseDeDatos.planesSize());
        int randomAnio = (int) (Math.random() * 4);
        materia = materiaObtenida.getMateria(BaseDeDatos.getPlan(randomPlan).getAnios().get(randomAnio));

        mesaExamen.setMateria(materia);

        // obtener fecha
        String fecha = fechas[(int) (Math.random() * fechas.length)];
        fecha += materia.getAnio().getPlan().getAnio().intValue() + "";

        mesaExamen.setFecha(fecha);

        // generar presidente
        Profesor presidente = new Profesor();
        idPresidente++;
        presidente.setId(idPresidente);
        int randomNombre = (int) (Math.random() * nombres.length);
        presidente.setNombre(nombres[randomNombre]);
        int randomApellido = (int) (Math.random() * apellidos.length);
        presidente.setApellido(apellidos[randomApellido]);
        presidente.setEdad((int) (Math.random() * 65) + 23);
        presidente.setNacionalidad("Argentino");

        mesaExamen.setPresidente(presidente);

        // generar vocal
        Profesor vocal = new Profesor();
        idVocal++;
        vocal.setId(idVocal);
        randomNombre = (int) (Math.random() * nombres.length);
        vocal.setNombre(nombres[randomNombre]);
        randomApellido = (int) (Math.random() * apellidos.length);
        vocal.setApellido(apellidos[randomApellido]);
        vocal.setEdad((int) (Math.random() * 65) + 23);
        vocal.setNacionalidad("Argentino");

        mesaExamen.setVocal(vocal);

        // generar alumnos
        List<Alumno> alumnos = new ArrayList<>();

        for (int ii = 0; ii < (int) ((Math.random() * 25) + 1); ii++) {
            Alumno alumno = new Alumno();
            idAlumno++;
            alumno.setId(idAlumno);
            randomNombre = (int) (Math.random() * nombres.length);
            alumno.setNombre(nombres[randomNombre]);
            randomApellido = (int) (Math.random() * apellidos.length);
            alumno.setApellido(apellidos[randomApellido]);
            alumno.setEdad(VerificarEdadAlumno.verificarEdad(materia));
            alumno.setNacionalidad("Argentino");
            alumnos.add(alumno);
        }

        mesaExamen.setAlumnos(alumnos);

        // id mesa
        String id = materia.getCodigo() + "" + mesaExamen.getFecha();
        id = UtilTranslate.traducirCadena(id);

        mesaExamen.setId(Long.parseLong(id));

        return mesaExamen;
    }
}
