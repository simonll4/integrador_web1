package Integrador.Colegio.Ar.edu.aui.persist;

import Integrador.Colegio.Ar.edu.aui.model.Person;
import Integrador.Colegio.Ar.edu.aui.model.RegistrationForm;

public class DataBase {

    static private final int MAX_ITEMS = 100;

    //variables

    static public RegistrationForm[] registrationForms = new RegistrationForm[MAX_ITEMS];
    public static Person[] people = new Person[MAX_ITEMS];

}
