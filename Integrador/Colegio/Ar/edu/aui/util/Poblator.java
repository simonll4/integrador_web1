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
    private String[] type = { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" };

    // Country
    private String[] nameCountry = { null, "Argentina", "Peru", null, null, "Argentina", "Argentina",
            "Chile", null, "Argentina", null, "Argentina", "Argentina", "Bolivia", null, "Argentina",
            "Surinam", "Argentina", "Argentina", "Guyana", "Argentina", "Argentina" };

    private String[] nacionality = { "argentino/a", "peruano/a", "brasilero/a", "chileno/a",
            "guyano", "guyanes", "boliviano/a" };

    private String[] code2 = { "AR", "AR", "AR", "AR", "AR", "AR", "AR", "AR", "AR", "AR", "AR", "BR", "BO", "CL", "CO",
            "GY", "PE", null };

    private String[] code3 = { "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "ARG", "BRA",
            "BOL", "CHL", "COL", "GYN", "PER", null };

    // home
    private String[] tower = { "1", "2", "3" };

    private String[] country = { null, "Argentina", "Peru", null, "Brasil", "Argentina", "Argentina",
            "Chile", null, "Argentina", null, "Argentina", "Argentina", "Bolivia", null, "Argentina",
            "Surinam", "Argentina", "Argentina", "Guyana", "Argentina", "Argentina" };

    private String[] street = { "Bariloche", "La Paz", "Gral. Llamosas", "Jorge Newbery", "Los Monos",
            "Las Naranjas", "Salvador", "Talleres", "San Martin", null, "Merlo", "Av. De Las Camelias",
            null, "La Barra", "Richeri", "Ruggeri", null, "Int. Guillalba", "Punta del Norte", "Hawai",
            null, "Los Angeles" };

    private String[] postalCodes = { "5000", "5010", "5015", "5020", "4000", "4010", "4015", "4020",
            "3000", "3010", "3015", "3020", "2000", "2010", "2015", "2020", "1000", "1010", "1015", "1020",
            "900", "910", };

    private String[] neighborhood = { "Las Palmas", "Quilmes", "Guemes", "Pueyrredon", "Los Olmos",
            "Villa El Libertador", "Paz Carlos", "San Jose", "La Quintana", "Gral. Guillalba",
            "Parque Las Pradas", "Parque America", "Villavicencio", "Las Pradas 1", "Las Pradas 2", "Newells",
            "Los Sauces", "Las Gacelas", "Las Gacelas Anexo", "Bonavena", "Van Dame", "Los Monos" };

    private String[] namesLocations = { "Capital", "Capital Federal", "Unquillo", "Sarmiento", "Roca",
            "Agua de Plata", "Alejo Gacela", "Alma Debil", "Marito Juarez", "Bouwer", "Mialet Basse", "Vell Bille",
            "Balnearios", "Tercero Abajo", "Unidos", "Rio Septimo", "San Injusto", "Rio Blanco", "Calamuchito",
            "Roque Penia", "Ferrari", "Luther King" };

    private double[] latitude = {};
    private double[] longitude = {};

    // Person
    private String[] id = { "47782444", "47495523", "47554715", "69531161", "46275063", "76874464",
            "85357399Y", "71836034L", "75324014A", "74115380L", "16988532L", "32369962S", "34037170E", "22920980P",
            "20851837Z", "55192555F", "31768382T", "13944350W", "46829254N", "54059316R", "14061055M", "72781211B" };

    private String[] name = { "Alberto", "Ana", "Benjamin", "Brenda", "Carlos", "Carmen", "Dylan", "Delfina",
            "Elias", "Eliana", "Federico", "Fernanda", "German", "Gabriel", "Hernan", "Heliana", "Ismael", "Irina",
            "Jorge", "Juliana", "Kilian", "Karmen", "Lionel", "Lucila", "Matias", "Micaela", "Nahuel", "Natalia",
            "Osvaldo", "Oriana", "Pablo", "Paola", "Quinto", "Quetzal", "Raul", "Rocio", "Simon", "Sabrina",
            "Tadeo", "Taehyung", "Uriel", "Ulda", "Valentin", "Viviana", "Walter", "Wanda", "Xavi", "Ximena",
            "Yoshua", "Yessica", "Zacarias", "Zara" };

    private String[] lastName = { "Carrizo", "Rodriguez", "Otamendi", "Messi", "Gates", "Musk",
            "Luna", "Villalba", "Llamosas", "Besos", "De La Serna", "De La Fuente", "De Armas", "Guillaumet",
            "Ponce", "Sosa", "Olivera", "Ragessi", "Joaquin", "Quiroga", "Van Dame", "Dominguez" };

    private String[] dateBirth = { "05/10/2001", "25/11/2012", "12/04/2011", "13/03/2008", "05/10/2001",
            "", "", "", "", "", "", "","","","","","","","","","","","","","05/10/1985",};
    private LocalDate[] dateBirth2 = new LocalDate[dateBirth.length];

    private String[] email = { "masitas12", "bananas2", "emailrandom", "claro3", "talleresmivida4",
            "yc23vub", "lwenhgiuo2", "caviar5", "condor9", "vivaperon15", "menem7", "maildemessi", "billgates", "rtj4",
            "wiufehu1", "bastadecastear", "ojebf99", "lolaso12", "iu34ty2i", "vegeta777", "microhard", "a32" };

    private String[] phone = { "3545768561 ", "3510100710", "3212991844 ", "3654181123", "3510955567",
            "3237875974", "3717335875", "3589331667", "3316312998", "3117527369", "3516226468", "3222728590",
            "3510674431", "3569673029", "3894238816", "3278894893", "3116021441", "3576871168", "3998146207", null,
            "3519668696", null, null };

    // User
    private String[] userName = { null, "admin23", "mcreg5", "fullpipe2", "orion8", "12k34b", "kgb2",
            "mqbo3rb", "kjnh3", "blem88", "mcig1ue", "talleres12", "messi214", "eeee1", "mattgode", "thor1",
            "agustinolix", "river13", "aadqf12", "qwert13" };

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
            countryList.add(new Country(code2[(int) (Math.random() * code2.length)],
                    code3[(int) (Math.random() * code3.length)],
                    nameCountry[(int) (Math.random() * nameCountry.length)],
                    nacionality[(int) (Math.random() * nacionality.length)]));
        }
        return countryList;
    }

    public List<Home> buildRandomHome(int count) {
        List<Home> homeList = new ArrayList<Home>();
        Home aux = new Home();
        for (int ii = 0; ii < count; ii++) {
            aux.setCountry(country[(int) (Math.random() * country.length)]);
            aux.setStreet(street[(int) (Math.random() * street.length)]);
            aux.setNum((int) (Math.random() * 5000) + 1000);
            aux.setPostalCode(postalCodes[(int) (Math.random() * postalCodes.length)]);
            aux.setApartament((int) (Math.random() * 40));
            aux.setTower(tower[(int) (Math.random() * tower.length)]);
            aux.setFloor((int) (Math.random() * 20));
            aux.setNeighborhood(neighborhood[(int) (Math.random() * neighborhood.length)]);
            aux.setLocation(namesLocations[(int) (Math.random() * namesLocations.length)]);
            aux.setComments(null);
            aux.setLatitude(latitude[(int) (Math.random() * latitude.length)]);
            aux.setLongitude(longitude[(int) (Math.random() * longitude.length)]);
            homeList.add(aux);
        }
        return homeList;
    }

    public List<Turn> buildRandomTurn(int count) {
        List<Turn> turnList = new ArrayList<Turn>();
        for (int ii = 0; ii < count; ii++) {
            Turn aux = new Turn();
            aux.setCode((int) (Math.random() * 2) + 1);
            if (aux.getCode() == 1) {
                aux = new Turn(1, "Maniana", 7, 12);
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
            usersList.add(new User(userName[(int) (Math.random() * userName.length)],
                    userPassword[(int) (Math.random() * userPassword.length)]));
        }
        return usersList;
    }

    public List<Person> buildRandomPerson(int count, List<BloodType> b1, List<Home> h1, List<Country> c1,
            List<Country> c2) {
        List<Person> personList = new ArrayList<Person>();
        Person aux = new Person();

        for (int ii = 0; ii < dateBirth2.length; ii++) {
            dateBirth2[ii] = LocalDate.parse(dateBirth[ii]);
        }

        for (int ii = 0; ii < count; ii++) {
            aux.setID(id[(int) Math.random() * id.length]);
            aux.setName(name[(int) Math.random() * name.length]);
            aux.setLastname(lastName[(int) Math.random() * lastName.length]);
            aux.setDateBirth(dateBirth2[(int) Math.random() * dateBirth.length]);
            aux.setEmail(email[(int) Math.random() * email.length] + "@gmail.com");
            aux.setPhone(phone[(int) Math.random() * phone.length]);
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
            num = (int) Math.random() * 2;
            Person[] p2 = new Person[num];
            for (int jj = 0; jj < p2.length; jj++) {
                p2[jj] = p1.get((int) Math.random() * p1.size());
            }
            aux.setTutors(p2);
            aux.setEmergencyContact(p1.get((int) Math.random() * p1.size()));
            registrationFormsList.add(aux);
        }

        return registrationFormsList;
    }

}
