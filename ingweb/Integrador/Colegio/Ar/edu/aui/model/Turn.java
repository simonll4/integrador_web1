package ingweb.Integrador.Colegio.Ar.edu.aui.model;

public class Turn {

    // Variables
    private int code;
    private String turnName;
    private int startHour;
    private int finishHour;

    // Constructors
    public Turn(int code, String turnName, int startHour, int finishHour) {

        this.code = code;
        this.turnName = turnName;
        this.startHour = startHour;
        this.finishHour = finishHour;
    }

    public Turn() {

    }

    // setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setTurnName(String turnName) {
        if (turnName != null) {
            turnName = turnName.trim();
        }
        this.turnName = turnName;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public void setFinishHour(int finishHour) {
        this.finishHour = finishHour;
    }

    // getters
    public int getCode() {
        return code;
    }

    public String getTurnName() {
        return turnName;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getFinishHour() {
        return finishHour;
    }

    public String toString() {
        return this.code + "";
    }

    public boolean equals(Turn other) {
        boolean flag = false;
        if (other == null)
            flag = false;
        if (other.code == 0)
            flag = false;
        if (this.code == 0)
            flag = false;
        if (other.turnName == null)
            flag = false;
        if (this.turnName == null)
            flag = false;
        if (this.turnName == other.turnName)
            flag = true;
        if (this.code == other.code)
            flag = true;
        return flag;

    }

}
