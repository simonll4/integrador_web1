package Integrador.Colegio.Ar.edu.aui.model;

public class RegistrationForm {

    // Variables
    Turn turn;
    Person candidate;
    Person[] tutors;
    Person emergencyContact;

    // constructor
    public RegistrationForm() {
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    public Person getCandidate() {
        return candidate;
    }

    public void setCandidate(Person candidate) {
        this.candidate = candidate;
    }

    public Person[] getTutors() {
        return tutors;
    }

    public void setTutors(Person[] tutors) {
        this.tutors = tutors;
    }

    public Person getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(Person emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    /*
     * public String toString(){
     * //return this.candidate + "";
     * }
     */

    public boolean equals(RegistrationForm other) {
        boolean flag = false;
        if (other == null)
            flag = false;
        if (this.candidate == null)
            flag = false;
        if (other.candidate == null)
            flag = false;
        if (other.candidate == this.candidate)
            flag = true;
        return flag;
    }
}
