package ar.edu.iua.util;

import ar.edu.iua.modelo_webservices.academico.plan.AnioPlanImpl_ws;
import ar.edu.iua.modelo_webservices.academico.plan.MateriaImpl_ws;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImpl_ws;
import ar.edu.iua.modelo_webservices.academico.plan.Plan_ws;

import java.util.ArrayList;
import java.util.List;


import ar.edu.iua.persistencia.*;

public class UtilTransformer {
    
    public static void transformar () throws CloneNotSupportedException{
    
        List<Plan_ws> nuevos = new ArrayList<Plan_ws>();
        
        for(int i=0; i < BaseDeDatos.planesSize(); i++){ //Recorre los planes
            Plan_ws nuevo = new PlanImpl_ws();
            List<AnioPlanImpl_ws> a_nuevos = new ArrayList<>();
            nuevo.setAnio(BaseDeDatos.getPlan(i).getAnio());
            if(BaseDeDatos.getPlan(i).isEstadoActivo()){
                nuevo.setEstadoActivo();
            }
            else if(BaseDeDatos.getPlan(i).isEstadoBorrador()){
                nuevo.setEstadoBorrador();
            }
            else if(BaseDeDatos.getPlan(i).isEstadoNoActivo()){
                nuevo.setEstadoNoActivo();
            }
            else{
                nuevo.setEstadoNulo();
            }
            for(int j=0; j<BaseDeDatos.getPlan(i).getAnios().size(); j++){ //Recorre los anios del plan i
                AnioPlanImpl_ws a_nuevo = new AnioPlanImpl_ws(0, "");
                List<MateriaImpl_ws> m_nuevas = new ArrayList<>();
                a_nuevo.setNombre(BaseDeDatos.getPlan(i).getAnios().get(j).getNombre());
                a_nuevo.setNumero(BaseDeDatos.getPlan(i).getAnios().get(j).getNumero());
                for(int k=0; k<BaseDeDatos.getPlan(i).getAnios().get(j).getMaterias().size();k++){
                    MateriaImpl_ws m_nueva = new MateriaImpl_ws(0, "", 0.0);
                    m_nueva.setCodigo(BaseDeDatos.getPlan(i).getAnios().get(j).getMaterias().get(k).getCodigo());
                    m_nueva.setNombre(BaseDeDatos.getPlan(i).getAnios().get(j).getMaterias().get(k).getNombre());
                    m_nueva.setCargaHoraria(BaseDeDatos.getPlan(i).getAnios().get(j).getMaterias().get(k).getCargaHoraria());
                    m_nuevas.add(m_nueva);
                }
                a_nuevo.setMaterias(m_nuevas);
                a_nuevos.add(a_nuevo);
            }
            nuevo.setAnios(a_nuevos);
            nuevos.add(nuevo);
        }
        
        for(Plan_ws plan:nuevos){
            BaseDeDatos.addPlan_ws(plan);
        }
        System.out.println("Se guardaron " + BaseDeDatos.planesSize_ws() + " planes web services en la BD");
    }
    
}
