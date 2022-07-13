package ar.edu.iua.util.verificadores;

import ar.edu.iua.modelo.academico.plan.Materia;

public class VerificarEdadAlumno {
    
    public static Integer verificarEdad(Materia materia){

        Integer edad = 0;

        if(materia.getAnio().getNumero().intValue() == 1){
            edad = 12;
        }
        if(materia.getAnio().getNumero().intValue() == 2){
            edad = 13;
        }
        if(materia.getAnio().getNumero().intValue() == 3){
            edad = 14;
        }
        if(materia.getAnio().getNumero().intValue() == 4){
            edad = 15;
        }
        if(materia.getAnio().getNumero().intValue() == 5){
            edad = 16;
        }
        if(materia.getAnio().getNumero().intValue() == 6){
            edad = 17;
        }
        if(materia.getAnio().getNumero().intValue() == 7){
            edad = 18;
        }

    return edad;
    }
}
