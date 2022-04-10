package ingweb.Integrador.Colegio.Ar.edu.aui.model;

public class Country {

    // Variables
    private String code2;
    private String code3;
    private String name;
    private String nationality;

    // Constructor
    public Country(String code2, String code3, String name, String nationality) {
        this.code2 = code2;
        this.code3 = code3;
        this.name = name;
        this.nationality = nationality;
    }

    // setters
    public void setCode2(String code2) {
        if (code2 != null) {
            code2 = code2.trim();
        }
        this.code2 = code2;
    }

    public void setCode3(String code3) {
        if (code3 != null) {
            code3 = code3.trim();
        }
        this.code3 = code3;
    }

    public void setName(String name) {
        if (name != null) {
            name = name.trim();
        }
        this.name = name;
    }

    public void setNationality(String nationality) {
        if (nationality != null) {
            nationality = nationality.trim();
        }
        this.nationality = nationality;
    }

    // getters
    public String getCode2() {
        return code2;
    }

    public String getCode3() {
        return code3;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String toString() {
        return this.name + "";
    }

    public boolean equals(Country other) {
        if (other == null)return false;
        if(other.name == null)return false;
        if (this.name == null)return false;
        return this.name == other.name;
    }
}
