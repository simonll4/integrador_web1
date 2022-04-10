package pj_integrador.ar.edu.iua.modelo.academico.plan;
import java.util.List;

public class Plan{

    private enum Estado{BORRADOR, ACTIVO, NO_ACTIVO};
    private Integer anio;
    private Estado estado;
    private List<AnioPlan> anios;

    //GETTERS & SETTERS
    public Integer getAnio() {
        return anio;
    }
    public List<AnioPlan> getAnios() {
        return anios;
    }
    public void setAnios(List<AnioPlan> anios) {
        this.anios = anios;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setEstadoBorrador(){
        estado = Estado.BORRADOR;
    }

    public void setEstadoActivo(){
        estado = Estado.ACTIVO;
    }

    public void setEstadoNoActivo(){
        estado = Estado.NO_ACTIVO;
    }

    public boolean isEstadoBorrador(){
        return estado == Estado.BORRADOR;
    }

    public boolean isEstadoActivo(){
        return estado == Estado.ACTIVO;
    }

    public boolean isEstadoNoActivo(){
        return estado == Estado.NO_ACTIVO;
    }





}