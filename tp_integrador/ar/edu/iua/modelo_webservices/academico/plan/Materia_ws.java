package ar.edu.iua.modelo_webservices.academico.plan;

import ar.edu.iua.modelo.Objeto;

public abstract class Materia_ws extends Objeto {

    abstract public Integer getCodigo();

    abstract public void setCodigo(Integer codigo);

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

    abstract public Double getCargaHoraria();

    abstract public void setCargaHoraria(Double cargaHoraria);

    
}
