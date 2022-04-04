package Integrador.Colegio.Ar.edu.aui.model;

public class AcademicYear {

    // Variables
    private int year;

    // Constructors
    public AcademicYear(int year) {
        this.year = year;
    }

    // Functions
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return this.year + "";
    }

    public boolean equals(AcademicYear other){

        if(other==null) return false;
        
        return this.year == other.year;
    }

}
