package ar.edu.iua.modelo_webservices.academico.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.Objeto;
import ar.edu.iua.modelo.academico.plan.Materia;

public class MesaExamen_ws extends Objeto {

    private Long id;
    private Materia materia;
    private String fecha;
    private Profesor_ws presidente;
    private Profesor_ws vocal;
    private List<Alumno_ws> alumnos = new ArrayList<Alumno_ws>();

    public MesaExamen_ws() {

    }

    public MesaExamen_ws(Long id, Materia materia, Profesor_ws presidente, Profesor_ws vocal, List<Alumno_ws> alumnos,
            String fecha) {
        this.id = id;
        this.materia = materia;
        this.presidente = presidente;
        this.vocal = vocal;
        this.alumnos = alumnos;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor_ws getPresidente() {
        return presidente;
    }

    public void setPresidente(Profesor_ws presidente) {
        this.presidente = presidente;
    }

    public Profesor_ws getVocal() {
        return vocal;
    }

    public void setVocal(Profesor_ws vocal) {
        this.vocal = vocal;
    }

    public List<Alumno_ws> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno_ws> alumnos) {
        this.alumnos = alumnos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MesaExamen_ws other = (MesaExamen_ws) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public String toString() {
        String fecha = this.fecha != null ? this.fecha.toString() : "";
        String materia = this.materia != null ? this.materia.getNombre().toString() : "";

        return (fecha + " " + materia).trim();
    }

    public String fullToString() {

        String s = "Mesa: " + (id != null ? this.id + "" : "") + "\n" + "Materia: " + (materia != null ? materia.getNombre().toString() : "")
                + "\n" +
                "Fecha: " +(fecha != null ? this.fecha.toString() : "") + "\n" + "Presidente: "
                + (presidente != null ? presidente.getNombre().toString() : "") + " "
                + (presidente != null ? presidente.getApellido().toString() : "") + "\n" + "Vocal: "
                + (vocal != null ? vocal.getNombre().toString() : "") + " "
                + (vocal != null ? vocal.getApellido().toString() : "") + "\n" + "Alumnos: \n";

        for (Alumno_ws alumno : alumnos) {
            String a = alumno.getNombre().toString() + " " + alumno.getApellido().toString();
            s += (a.length() > 0) ? a + "\n" : "";
        }

        return s.trim();
    }

    public String fullToJson() {

        return null;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
        MesaExamen_ws mesa = (MesaExamen_ws) super.clone();
        List<Alumno_ws> auxAlumnos = new ArrayList<>();
        for (Alumno_ws alumno : this.alumnos) {
            if (alumno != null) {
                auxAlumnos.add((Alumno_ws) alumno.clone());
            }
        }
        mesa.setAlumnos(auxAlumnos);
        return mesa;
    }

}
