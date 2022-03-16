package Integrador.Colegio.Ar.edu.aui.model;

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

    // setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setTurnName(String turnName) {
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

}
