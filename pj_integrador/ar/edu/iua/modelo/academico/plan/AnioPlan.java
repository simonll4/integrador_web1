package pj_integrador.ar.edu.iua.modelo.academico.plan;
import java.util.List;

public class AnioPlan {
    
    //Variables
    private Integer numero;
    private String nombre;
    private Plan plan;
    private List<Materia> materias;
    
    //Getters & Setters
    public Integer getNumero() {
        return numero;
    }
    public List<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    public Plan getPlan() {
        return plan;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
