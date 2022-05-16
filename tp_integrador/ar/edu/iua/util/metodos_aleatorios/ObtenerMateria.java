package ar.edu.iua.util.metodos_aleatorios;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;

public class ObtenerMateria {
    public Materia getMateria(AnioPlan anioplan) {
        Materia materia = anioplan.getMaterias().get((int) (Math.random() * anioplan.getMaterias().size()));
        
        return materia;
    }

}
