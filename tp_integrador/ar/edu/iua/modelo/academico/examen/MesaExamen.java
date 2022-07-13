package ar.edu.iua.modelo.academico.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.Objeto;
import ar.edu.iua.modelo.academico.plan.Materia;

public class MesaExamen extends Objeto {

    private Long id;
    private Materia materia;
    private String fecha;
    private Profesor presidente;
    private Profesor vocal;
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    public MesaExamen() {

    }

    public MesaExamen(Long id, Materia materia, Profesor presidente, Profesor vocal, List<Alumno> alumnos,
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

    public Profesor getPresidente() {
        return presidente;
    }

    public void setPresidente(Profesor presidente) {
        this.presidente = presidente;
    }

    public Profesor getVocal() {
        return vocal;
    }

    public void setVocal(Profesor vocal) {
        this.vocal = vocal;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
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
        MesaExamen other = (MesaExamen) obj;
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

        for (Alumno alumno : alumnos) {
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
        MesaExamen mesa = (MesaExamen) super.clone();
        List<Alumno> auxAlumnos = new ArrayList<>();
        for (Alumno alumno : this.alumnos) {
            if (alumno != null) {
                auxAlumnos.add((Alumno) alumno.clone());
            }
        }
        mesa.setAlumnos(auxAlumnos);
        return mesa;
    }

}
