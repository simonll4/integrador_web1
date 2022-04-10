package ingweb.Integrador.Colegio.Ar.edu.aui.model;

public class BloodType {

    // Variables
    private int code;
    private String type;

    // Constructors
    public BloodType(int code, String type) {
        this.code = code;
        this.type = type;
    }

    // Functions
    public void setCode(int code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
