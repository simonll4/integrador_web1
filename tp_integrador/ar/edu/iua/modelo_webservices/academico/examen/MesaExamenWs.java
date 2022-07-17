package ar.edu.iua.modelo_webservices.academico.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.Objeto;
import ar.edu.iua.modelo_webservices.academico.plan.MateriaImplWs;

public class MesaExamenWs extends Objeto {

    private Long id;
    private MateriaImplWs materia;
    private String fecha;
    private ProfesorWs presidente;
    private ProfesorWs vocal;
    private List<AlumnoWs> alumnos = new ArrayList<AlumnoWs>();

    public MesaExamenWs() {

    }

    public MesaExamenWs(Long id, MateriaImplWs materia, ProfesorWs presidente, ProfesorWs vocal, List<AlumnoWs> alumnos,
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

    public MateriaImplWs getMateria() {
        return materia;
    }

    public void setMateria(MateriaImplWs materia) {
        this.materia = materia;
    }

    public ProfesorWs getPresidente() {
        return presidente;
    }

    public void setPresidente(ProfesorWs presidente) {
        this.presidente = presidente;
    }

    public ProfesorWs getVocal() {
        return vocal;
    }

    public void setVocal(ProfesorWs vocal) {
        this.vocal = vocal;
    }

    public List<AlumnoWs> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<AlumnoWs> alumnos) {
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
        MesaExamenWs other = (MesaExamenWs) obj;
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

        for (AlumnoWs alumno : alumnos) {
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
        MesaExamenWs mesa = (MesaExamenWs) super.clone();
        List<AlumnoWs> auxAlumnos = new ArrayList<>();
        for (AlumnoWs alumno : this.alumnos) {
            if (alumno != null) {
                auxAlumnos.add((AlumnoWs) alumno.clone());
            }
        }
        mesa.setAlumnos(auxAlumnos);
        return mesa;
    }

}
