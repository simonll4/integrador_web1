package pj_integrador.ar.edu.iua.modelo.academico.plan;

public class Materia {

    private String codigo;
    private String nombre;
    private Double cargaHoraria;
    private AnioPlan anio;
    
    public String getCodigo() {
        return codigo;
    }

    public AnioPlan getAnio() {
        return anio;
    }

    public void setAnio(AnioPlan anio) {
        this.anio = anio;
    }
    
    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNombre(String nombre) {
        nombre = (nombre != null && nombre.trim().length() == 0) ? null : nombre.trim();
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        codigo = (codigo != null && codigo.trim().length() == 0) ? null : codigo.trim();
        this.codigo = codigo;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    //Acomodar despues
    
    public boolean equals(Object obj) {
        
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Materia other = (Materia) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    
    public String toString() {
        if(this.nombre == null) return "Sin nombre " + this.cargaHoraria + "";
        if(this.cargaHoraria == null) return this.nombre;
        if(this.nombre == null && this.cargaHoraria == null) return "Sin nombre";
        return this.nombre + " " + this.cargaHoraria + ""; 
    }

    
}
