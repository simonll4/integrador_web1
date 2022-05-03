package ar.edu.iua.util.metodos_aleatorios;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;

public class ObtenerPlan {

    public Plan getPlan(List<Plan> p1) {
        Plan plan1 = new PlanImpl();
        plan1 = p1.get((int) (Math.random() * p1.size()));
        return plan1;
    }
}
