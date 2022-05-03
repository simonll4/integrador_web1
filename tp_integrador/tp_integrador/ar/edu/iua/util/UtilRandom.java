package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.util.metodos_aleatorios.ObtenerAnioPlan;
import ar.edu.iua.util.metodos_aleatorios.ObtenerMateria;
import ar.edu.iua.util.metodos_aleatorios.ObtenerPlan;

public class UtilRandom {

    public Plan construirPlan(List<Plan> listaPlanes) {
        Plan planAleatorio = new PlanImpl();

        ObtenerAnioPlan anioObtenido = new ObtenerAnioPlan();
        ObtenerMateria materiaObtenida = new ObtenerMateria();
        ObtenerPlan planObtenido = new ObtenerPlan();

        List<AnioPlan> aniosPlan = new ArrayList<AnioPlan>();
        List<Materia> materiasPlan = new ArrayList<Materia>();

        System.out.println("LARGO DE LA LISTA PLANES EN UTILRANDOM"+ listaPlanes.size() + "");

        
        planAleatorio.setAnio((int) (Math.random() + 2018));

        for (int jj = 0; jj < listaPlanes.size(); jj++) {
            if (planAleatorio.getAnio().equals(listaPlanes.get(jj).getAnio())) {
                planAleatorio.setAnio((int) (Math.random() * 20) + 2002);
                jj--;
            }
        }

        for (int ii = 0; ii < 5; ii++) {
            int zz = 0;
            AnioPlan anioAleatorio = new AnioPlanImpl();
            
           
            for (int jj = 0; jj < 12; jj++) {
                Materia materia = new MateriaImpl();
                anioAleatorio = planObtenido.getPlan(listaPlanes).getAnios().get(zz);
                zz++;
                if (jj == 0) {
                    materia = materiaObtenida.getMateria(anioAleatorio);
                    materiasPlan.add(materia);
                }
                else{
                    materia = materiaObtenida.getMateria(anioAleatorio);
                    for (int kk = 0; kk < materiasPlan.size(); kk++) {
                        Boolean bandera = false;
                        if (materiasPlan.get(kk).getCodigo().equals(materia.getCodigo())) {
                            bandera = false;
                            jj--;
                            break;
                        } else if (kk == materiasPlan.size() - 1) {
                            bandera = true;
                        }
                        if (bandera) {
                            materiasPlan.add(materia);
                            break;
                        }
                    }
                }
            }
            anioAleatorio.setPlan(planAleatorio);
            anioAleatorio.setMaterias(materiasPlan);
            aniosPlan.add(anioAleatorio);
        }

        planAleatorio.setAnios(aniosPlan);
        return planAleatorio;
    }
}