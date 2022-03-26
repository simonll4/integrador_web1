package Integrador.Colegio.Ar.edu.aui.model;
enum Estado {APROBED, PROCESS, DRAFT, REJECTED, CANCELED}

public class RegistrationForm {
    
    //Variables
    Turn turn;
    Person candidate;
    Person[] tutors;
    Person emergencyContact;

    //constructor
    public RegistrationForm(){
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
}
