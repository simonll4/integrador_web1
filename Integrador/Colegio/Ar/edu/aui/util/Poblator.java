package Integrador.Colegio.Ar.edu.aui.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Integrador.Colegio.Ar.edu.aui.model.*;
import Integrador.Colegio.Ar.edu.aui.persist.*;

public class Poblator {

    // AcademicYear

    // BloodType
    private int[] code = {};
    private String[] type = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };

    // Country
    private String[] nameCountry = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
    private String[] nacionality = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
    private String[] code2 = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
    private String[] code3 = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };

    // home
    private String[] tower = { "1", "2", "3" };
    private String[] country = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] street = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] postalCodes = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] neighborhood = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", "", };
    private String[] namesLocations = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", "" };
    private double[] latitude = {};
    private double[] longitude = {};

    // Person
    private String[] id = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] name = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] lastName = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private LocalDate[] dateBirth = {};
    private String[] email = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };
    private String[] phone = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", };

    // Turn
    private String[] turnName = {};
    private String[][] startHour = { { "", "" }, { "", "" } };
    private String[][] finishHour = { { "", "" }, { "", "" } };

    // User
    private String[] usersNames = { null, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
    private String[] userPassword = { "123456", "password", "123456789", "12345678", "12345", "111111", "1234567",
            "sunshine",
            "qwerty", "iloveyou", "princess", "welcome", "666666", "666666",
            "football", "123123", "monkey", "654321", "charlie", "aa123456", };

    public List<AcademicYear> buildRandomAcademicYears(int count) {
        List<AcademicYear> academicYearList = new ArrayList<AcademicYear>();
        for (int ii = 0; ii < count; ii++) {
            academicYearList.add(new AcademicYear((int) (Math.random() * 2022) + 2019));
        }
        return academicYearList;
    }

    public List<Country> buildRandomCountry(int count) {
        List<Country> countryList = new ArrayList<Country>();
        for (int ii = 0; ii < count; ii++) {
            countryList.add(new Country(code2[(int) (Math.random() * 19)], code3[(int) (Math.random() * 19)],
                    nameCountry[(int) (Math.random() * 19)], nacionality[(int) (Math.random() * 19)]));
        }
        return countryList;
    }

    public List<Home> buildRandomHome(int count) {
        List<Home> homeList = new ArrayList<Home>();
        for (int ii = 0; ii < count; ii++) {
            homeList.add(new Home(country[(int) (Math.random() * 19)], street[(int) (Math.random() * 19)],
                    (int) (Math.random() * 5000) + 1000, postalCodes[(int) (Math.random() * 5999) + 5000],
                    (int) (Math.random() * 40), tower[(int) (Math.random() * 3)], (int) (Math.random() * 20),
                    neighborhood[(int) (Math.random() * 19)], namesLocations[(int) (Math.random() * 19)], null,
                    latitude[(int) (Math.random() * 19)], longitude[(int) (Math.random() * 3)]));
        }
        return homeList;
    }

    public List<Turn> buildRandomTurn(int count) {
        List<Turn> turnList = new ArrayList<Turn>();
        for (int ii = 0; ii < count; ii++) {
            Turn aux = new Turn();
            aux.setCode((int) (Math.random() * 2) + 1);
            if (aux.getCode() == 1) {
                aux = new Turn(1, "Mañana", 7, 12);
                turnList.add(aux);
            } else {
                aux = new Turn(2, "Tarde", 13, 18);
                turnList.add(aux);
            }
        }
        return turnList;
    }

    public List<User> buildRandomUsers(int count) {
        List<User> usersList = new ArrayList<User>();
        for (int ii = 0; ii < count; ii++) {
            usersList.add(new User(usersNames[(int) (Math.random() * 19)], userPassword[(int) (Math.random() * 19)]));
        }
        return usersList;
    }

        ///////////////////////////////////////////////////////////////////////
        //////////////////// FECHA DE NACIMIENTO CASTEO? //////////////////////
        ///////////////////////////////////////////////////////////////////////

    public List<Person> buildRandomPerson(int count, List<BloodType> b1, List<Home> h1, List<Country> c1,
            List<Country> c2) {
        List<Person> personList = new ArrayList<Person>();
        Person aux = new Person();

        for (int ii = 0; ii < count; ii++) {
            aux.setID(id[(int) Math.random() * id.length]);
            aux.setName(name[(int) Math.random() * name.length]);
            aux.setLastname(lastName[(int) Math.random() * 19]);
            aux.setEmail(email[(int) Math.random() * 19]);
            aux.setPhone(phone[(int) Math.random() * 19]);
            aux.setBloodType(b1.get((int) Math.random() * b1.size()));
            aux.setResidence(h1.get((int) Math.random() * h1.size()));
            aux.setNationality(c1.get((int) Math.random() * c1.size()));
            aux.setEmisorID(c2.get((int) Math.random() * c2.size()));
            personList.add(aux);
        }
        return personList;
    }

    public List<RegistrationForm> buildRandomRegistrationForm(int count, List<Turn> t1, List<Person> p1) {
        List<RegistrationForm> registrationFormsList = new ArrayList<RegistrationForm>();

        int num = 0;
        RegistrationForm aux = new RegistrationForm();

        for (int ii = 0; ii < count; ii++) {
            aux.setTurn(t1.get((int) Math.random() * t1.size()));
            aux.setCandidate(p1.get((int) Math.random() * p1.size()));
            num = (int)Math.random()*2;
            Person[] p2 = new Person[num];
            for(int jj = 0;jj < p2.length; jj++){
                p2[jj] = p1.get((int)Math.random()*p1.size());
            }
            aux.setTutors(p2);
            aux.setEmergencyContact(p1.get((int)Math.random()*p1.size()));
            registrationFormsList.add(aux);
        }

        return registrationFormsList;
    }

}
