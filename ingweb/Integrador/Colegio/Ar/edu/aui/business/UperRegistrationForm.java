package ingweb.Integrador.Colegio.Ar.edu.aui.business;

import ingweb.Integrador.Colegio.Ar.edu.aui.model.RegistrationForm;

public class UperRegistrationForm {

    enum Condition {
        APROBED, PROCESS, DRAFT, REJECTED, CANCELED
    }

    public static Condition validate(RegistrationForm form) {

        if (form.getTurn() != null && form.getCandidate() != null && form.getTutors() != null
                && form.getEmergencyContact() != null) {
            return Condition.APROBED;
        }
        

        return Condition.CANCELED;
    }
}
