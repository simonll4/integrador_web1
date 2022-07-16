package ar.edu.iua.modelo_webservices.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.Objeto;

public abstract class AnioPlan_ws extends Objeto {

    abstract public Integer getNumero();

    abstract public void setNumero(Integer numero);

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

    abstract public List<Materia_ws> getMaterias();

    abstract public void setMaterias(List<Materia_ws> materias);

}
