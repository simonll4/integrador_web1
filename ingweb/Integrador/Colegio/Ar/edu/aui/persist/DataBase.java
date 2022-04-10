package ingweb.Integrador.Colegio.Ar.edu.aui.persist;

import java.util.ArrayList;
import java.util.List;

import ingweb.Integrador.Colegio.Ar.edu.aui.business.Login;
import ingweb.Integrador.Colegio.Ar.edu.aui.model.*;

public class DataBase {

    // variables
    public static List<RegistrationForm> registrationForms = new ArrayList<RegistrationForm>();
    public static List<Person> people = new ArrayList<Person>();
    public static List<Home> home = new ArrayList<Home>();
    public static List<Country> country = new ArrayList<Country>();
    public static List<Turn> turn = new ArrayList<Turn>();
    public static List<AcademicYear> academicYear = new ArrayList<AcademicYear>();

    //datebase users
    public static List<User> users = new ArrayList<User>();
    
    public DataBase(){
        
        

    }
}