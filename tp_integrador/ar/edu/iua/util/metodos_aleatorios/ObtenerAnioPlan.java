package ar.edu.iua.util.metodos_aleatorios;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ObtenerAnioPlan {

    public AnioPlan getAnioPlan(Plan plan) {
        AnioPlan anioplan = new AnioPlanImpl();
        anioplan = plan.getAnios().get((int) (Math.random() * plan.getAnios().size()));
        return anioplan;
    }

}
