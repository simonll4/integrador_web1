package Integrador.Colegio.Ar.edu.aui.persist;

import Integrador.Colegio.Ar.edu.aui.business.Login;
import Integrador.Colegio.Ar.edu.aui.model.Person;
import Integrador.Colegio.Ar.edu.aui.model.RegistrationForm;

public class DataBase {

    static private final int MAX_ITEMS = 100;

    // variables
    public static RegistrationForm[] registrationForms = new RegistrationForm[MAX_ITEMS];
    public static Person[] people = new Person[MAX_ITEMS];

    //datebase users
    public static Login[] users = new Login[5];
    
    public DataBase(){
        
        users[0] = new Login("admin","123");

    }
}