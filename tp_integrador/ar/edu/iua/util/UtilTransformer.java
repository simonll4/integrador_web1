package ar.edu.iua.util;

import ar.edu.iua.modelo_webservices.academico.examen.AlumnoWs;
import ar.edu.iua.modelo_webservices.academico.examen.MesaExamenWs;
import ar.edu.iua.modelo_webservices.academico.examen.ProfesorWs;
import ar.edu.iua.modelo_webservices.academico.plan.AnioPlanImplWs;
import ar.edu.iua.modelo_webservices.academico.plan.MateriaImplWs;
import ar.edu.iua.modelo_webservices.academico.plan.PlanImplWs;
import ar.edu.iua.modelo_webservices.academico.plan.PlanWs;

import java.util.ArrayList;
import java.util.List;


import ar.edu.iua.persistencia.*;

public class UtilTransformer {
    
    public static void transformarPlan () throws CloneNotSupportedException{
    
        List<PlanWs> nuevos = new ArrayList<PlanWs>();
        
        for(int i=0; i < BaseDeDatos.planesSize(); i++){ //Recorre los planes
            PlanWs nuevo = new PlanImplWs();
            List<AnioPlanImplWs> a_nuevos = new ArrayList<>();
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
                AnioPlanImplWs a_nuevo = new AnioPlanImplWs(0, "");
                List<MateriaImplWs> m_nuevas = new ArrayList<>();
                a_nuevo.setNombre(BaseDeDatos.getPlan(i).getAnios().get(j).getNombre());
                a_nuevo.setNumero(BaseDeDatos.getPlan(i).getAnios().get(j).getNumero());
                for(int k=0; k<BaseDeDatos.getPlan(i).getAnios().get(j).getMaterias().size();k++){
                    MateriaImplWs m_nueva = new MateriaImplWs(0, "", 0.0);
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
        
        for(PlanWs plan:nuevos){
            BaseDeDatos.addPlanWs(plan);
        }
        System.out.println("Se guardaron " + BaseDeDatos.planesSizeWs() + " planes web services en la BD");
    }

    public static void transformarMesa() throws CloneNotSupportedException{
        List<MesaExamenWs> nuevas = new ArrayList<>();
        
        for (int i = 0; i < BaseDeDatos.mesasSize(); i++ ) {
            MesaExamenWs nueva = new MesaExamenWs();
            nueva.setId(BaseDeDatos.getListMesas().get(i).getId());
            nueva.setFecha(BaseDeDatos.getListMesas().get(i).getFecha());
            ProfesorWs presidente = new ProfesorWs();
            presidente.setId(BaseDeDatos.getListMesas().get(i).getPresidente().getId());
            presidente.setNombre(BaseDeDatos.getListMesas().get(i).getPresidente().getNombre());
            presidente.setApellido(BaseDeDatos.getListMesas().get(i).getPresidente().getApellido());
            presidente.setEdad(BaseDeDatos.getListMesas().get(i).getPresidente().getEdad());
            presidente.setNacionalidad(BaseDeDatos.getListMesas().get(i).getPresidente().getNacionalidad());
            nueva.setPresidente(presidente);
            ProfesorWs vocal = new ProfesorWs();
            vocal.setId(BaseDeDatos.getListMesas().get(i).getVocal().getId());
            vocal.setNombre(BaseDeDatos.getListMesas().get(i).getVocal().getNombre());
            vocal.setApellido(BaseDeDatos.getListMesas().get(i).getVocal().getApellido());
            vocal.setEdad(BaseDeDatos.getListMesas().get(i).getVocal().getEdad());
            vocal.setNacionalidad(BaseDeDatos.getListMesas().get(i).getVocal().getNacionalidad());
            nueva.setVocal(vocal);
            List<AlumnoWs> alumnos = new ArrayList<>();
            for(int j = 0; j < BaseDeDatos.getListMesas().get(i).getAlumnos().size(); j++){
                AlumnoWs alumno = new AlumnoWs();
                alumno.setEdad(BaseDeDatos.getListMesas().get(i).getAlumnos().get(j).getEdad());
                alumno.setId(BaseDeDatos.getListMesas().get(i).getAlumnos().get(j).getId());
                alumno.setNombre(BaseDeDatos.getListMesas().get(i).getAlumnos().get(j).getNombre());
                alumno.setApellido(BaseDeDatos.getListMesas().get(i).getAlumnos().get(j).getApellido());
                alumno.setNacionalidad(BaseDeDatos.getListMesas().get(i).getAlumnos().get(j).getNacionalidad());
                alumnos.add(alumno);
            }
            nueva.setAlumnos(alumnos);

            MateriaImplWs materia = new MateriaImplWs();
            materia.setCodigo(BaseDeDatos.getListMesas().get(i).getMateria().getCodigo());
            materia.setNombre(BaseDeDatos.getListMesas().get(i).getMateria().getNombre());
            materia.setCargaHoraria(BaseDeDatos.getListMesas().get(i).getMateria().getCargaHoraria());
            nueva.setMateria(materia);

            nuevas.add(nueva);
        }

        for(MesaExamenWs mesa : nuevas){
            BaseDeDatos.addMesaWs(mesa);
        }

        System.out.println("Se guardaron " + BaseDeDatos.mesasSizeWs() + " mesas web services en la BD");
    }   
}
