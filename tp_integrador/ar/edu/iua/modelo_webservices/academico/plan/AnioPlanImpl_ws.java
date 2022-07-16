package ar.edu.iua.modelo_webservices.academico.plan;

import java.util.ArrayList;
import java.util.List;

public class AnioPlanImpl_ws extends AnioPlan_ws {

    private Integer numero;
    private String nombre;
    private List<Materia_ws> materias = new ArrayList<Materia_ws>();

    public AnioPlanImpl_ws(Integer numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = (nombre != null && nombre.trim().length() > 0) ? nombre.trim() : null;
        this.nombre = nombre;
    }

    public List<Materia_ws> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia_ws> materias) {
        this.materias = materias;
    }

    // ----

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AnioPlanImpl_ws other = (AnioPlanImpl_ws) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }

    public String toString() {
        return nombre != null ? nombre : (numero != null ? "Año " + numero : "Año sin identificación");
    }

    public String fullToString() {

        String z = (numero != null ? numero.toString() : "") + "\n" + (nombre != null ? nombre.toString() : "") + "\n";

        for (Materia_ws materia : materias) {
            String m = materia.fullToString().trim();
            z += (m.length() > 0) ? m + "\n" : "";
        }

        return z.trim();
    }

    public String fullToJson() {

        String z = (numero != null ? "{\n \"anio\" : " + numero.toString() + " ," : "") + "\n" + 
                    (nombre != null ? " \"nombre\" : \"" + nombre.toString() + "\" ," : "") + "\n" + "\"materias\" : [";


        for (int ii = 0; ii < materias.size(); ii++) {
            String m = materias.get(ii).fullToJson();
            if(ii == materias.size()-1){
                z += (m.length() > 0) ? m + "\n" : "";
            }
            else{
                z += (m.length() > 0) ? m + "," : "";
            }
        }

        z += " ]\n }";

        return z.trim();
    }

    public Object clone() throws CloneNotSupportedException {
        AnioPlan_ws anio = (AnioPlan_ws) super.clone();
        List<Materia_ws> auxMaterias = new ArrayList<>();
        for (Materia_ws materia : this.materias) {
            if (materia != null) {
                auxMaterias.add((Materia_ws) materia.clone());
            }
        }
        anio.setMaterias(auxMaterias);
        return anio;
    }

}
