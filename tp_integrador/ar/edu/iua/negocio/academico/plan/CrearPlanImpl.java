package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan, boolean guardar) {

        Plan aux = new PlanImpl();
        List<AnioPlan> aniosPlan = new ArrayList<AnioPlan>();

        if(plan != null){
            aux.setAnio(plan.getAnio());
            if(plan.isEstadoActivo()){
                aux.setEstadoActivo();
            }
            if(plan.isEstadoNoActivo()){
                aux.setEstadoNoActivo();
            }
            if(plan.isEstadoBorrador()){
                aux.setEstadoBorrador();
            }
            if(plan.isEstadoNulo()){
                aux.setEstadoNulo();
            }
        }
        

        if(plan == null) return false;//Plan no puede ser null
        if(plan.isEstadoNulo())return false;//No se permiten planes sin estado
        if(plan.getAnio() == null && !plan.isEstadoBorrador())return false;//No se permite plan con anio nulo, excepto que sea un borrador
        if(plan.getAnio().intValue() < 1990 || plan.getAnio().intValue()>2040)return false;//No se permite plan con anio 1990 < anio < 2040
        if((plan.getAnios()==null || plan.getAnios().size()==0) && !plan.isEstadoBorrador())return false;//No se permite listado de anios null o vacio, excepto que sea un borrador
        for(int ii = 0; ii < plan.getAnios().size(); ii++){
            AnioPlan auxAnio = new AnioPlanImpl();
            List<Materia> materiasPlan = new ArrayList<Materia>();
            auxAnio.setNombre(plan.getAnios().get(ii).getNombre());
            auxAnio.setNumero(plan.getAnios().get(ii).getNumero());
            auxAnio.setPlan(aux);
            if(!plan.getAnios().get(ii).getPlan().equals(plan))return false;//No se permite un anio con plan distinto al que pertenece
            if(plan.getAnios().get(ii).getNumero() == null && !plan.isEstadoBorrador())return false;//No se permite que el numero de anio sea null, excepto que sea un borrador
            if(plan.getAnios().get(ii).getNumero() != null){
                if(plan.getAnios().get(ii).getNumero().intValue()<=0) return false;//No se permite que el numero de anio sea menor igual a 0
                if(plan.getAnios().get(ii).getNumero().intValue() < 1)return false;//anio comienza en 1
                if(plan.getAnios().get(ii).getNumero().intValue() != ii+1)return false;//anios orden secuencial
                for(int jj = 0; jj < plan.getAnios().size();jj++){
                    if(ii != jj){
                        if(plan.getAnios().get(ii).getNumero().equals(plan.getAnios().get(jj).getNumero()))return false;//No se permiten anios con el mismo numero
                    } 
                }
            }
            
            if(plan.getAnios().get(ii).getNombre() == null && !plan.isEstadoBorrador())return false;//No se permite un anio sin nombre excepto que sea borrador
            if((plan.getAnios().get(ii).getMaterias() ==null || plan.getAnios().get(ii).getMaterias().size() == 0) && !plan.isEstadoBorrador())return false;//No se permite un listado de materias null o vacio excepto que sea borrador
            for(int kk = 0;kk < plan.getAnios().get(ii).getMaterias().size();kk++){
                Materia auxMateria = null;
                try {
                    auxMateria = (Materia)plan.getAnios().get(ii).getMaterias().get(kk).clone();
                } catch (Exception e) {
                    System.out.println("No pude clonar Materia");
                }
                if(!plan.getAnios().get(ii).getMaterias().get(kk).getAnio().equals(plan.getAnios().get(ii)))return false;//No se permite que una materia tenga un anioPlan distinto al que pertenece
                if((plan.getAnios().get(ii).getMaterias().get(kk).getCodigo() == null) && !plan.isEstadoBorrador())return false;//No se permite una materia de codigo null, excepto que sea borrador
                if(plan.getAnios().get(ii).getMaterias().get(kk).getCodigo() != null){
                    if(plan.getAnios().get(ii).getMaterias().get(kk).getCodigo().intValue() <= 0)return false;//No se permite materia con el codigo menor igual a 0
                    if(plan.getAnios().get(ii).getMaterias().get(kk).getCodigo().intValue() < 1)return false;//Codigo materia comienza en 1
                }
                if(kk!=0){
                    if(plan.getAnios().get(ii).getMaterias().get(kk).getCodigoVerificacion().intValue() != plan.getAnios().get(ii).getMaterias().get(kk-1).getCodigoVerificacion().intValue()+1)return false;//Orden de las materias secuencial
                }
                for(int hh = 0; hh < plan.getAnios().get(ii).getMaterias().size(); hh++){
                    if(kk!=hh){
                        if(plan.getAnios().get(ii).getMaterias().get(hh).getCodigo().equals(plan.getAnios().get(ii).getMaterias().get(kk).getCodigo()))return false;//No se permiten materias con el mismo codigo
                    }
                }
                if((plan.getAnios().get(ii).getMaterias().get(kk).getNombre() == null) && !plan.isEstadoBorrador())return false;//No se permiten materias con nombre null, excepto que sea borrador
                if(plan.getAnios().get(ii).getMaterias().get(kk).getCargaHoraria().doubleValue() <= 0.0)return false;//No se permiten materias con carga horaria <=0
                if((plan.getAnios().get(ii).getMaterias().get(kk).getCargaHoraria() == null) && !plan.isEstadoBorrador())return false;//No se permiten materias con carga horaria null, excepto que sea borrador
                materiasPlan.add(auxMateria);
            }
            auxAnio.setMaterias(materiasPlan);
            aniosPlan.add(auxAnio);
        }
        aux.setAnios(aniosPlan);
        
        if(guardar){
            BaseDeDatos.planes.add(aux);
            return true;
        }
        return true;  
    }
}
