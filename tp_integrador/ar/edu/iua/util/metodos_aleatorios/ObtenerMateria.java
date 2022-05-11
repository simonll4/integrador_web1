package ar.edu.iua.util.metodos_aleatorios;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;

public class ObtenerMateria {
    public Materia getMateria(AnioPlan anioplan) {
        Materia materia = new MateriaImpl();

        materia = anioplan.getMaterias().get((int) (Math.random() * anioplan.getMaterias().size()));
        
        return materia;
    }

}
