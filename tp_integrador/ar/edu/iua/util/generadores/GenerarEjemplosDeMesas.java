package ar.edu.iua.util.generadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.examen.MesaExamen;
import ar.edu.iua.util.UtilMesaRandom;

public class GenerarEjemplosDeMesas {

    public static List<MesaExamen> generarMesasAleatorias(int cantGenerar)throws CloneNotSupportedException {
        List<MesaExamen> mesasExamen = new ArrayList<>();
        MesaExamen aux = new MesaExamen();
        
        for (int ii = 0; ii < cantGenerar; ii++) {
            aux = UtilMesaRandom.generarMesa();
            mesasExamen.add(aux);
        }
        
        return mesasExamen;
    }

}
