package ingweb.Integrador.Colegio.Ar.edu.aui.model;

import java.sql.Date;
import java.time.*;

public class Person {

    // Variables
    private String id;
    private String name;
    private String lastname;
    private LocalDate dateBirth;
    private String email;
    private String phone;

    BloodType bloodType;
    Home residence;
    Country nationality;
    Country emisorID;

    // Constructor
    public Person(String id, String name, String lastname, LocalDate dateBirth, String email, String phone,
            BloodType bloodType, Home residence, Country nationality, Country emisorID) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dateBirth = dateBirth;
        this.email = email;
        this.phone = phone;
        this.bloodType = bloodType;
        this.residence = residence;
        this.nationality = nationality;
        this.emisorID = emisorID;
    }

    public Person() {

    }

    // setters
    public void setID(String id) {
        if (id != null) {
            id = id.trim();
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name != null) {
            name = name.trim();
        }
        this.name = name;
    }

    public void setLastname(String lastname) {
        if (lastname != null) {
            lastname = lastname.trim();
        }
        this.lastname = lastname;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setEmail(String email) {
        if (email != null) {
            email = email.trim();
        }
        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone != null) {
            phone = phone.trim();
        }
        this.phone = phone;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public void setResidence(Home residence) {
        this.residence = residence;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setEmisorID(Country emisorID) {
        this.emisorID = emisorID;
    }

    // getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDatebirth() {
        return dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public BloodType getBloobType() {
        return bloodType;
    }

    public Home getResidence() {
        return residence;
    }

    public Country getNationality() {
        return nationality;
    }

    public Country getEmisorID() {
        return emisorID;
    }

    public String toString() {
        return this.name + this.lastname + "";
    }

    public boolean equals(Person other) {
        boolean flag = false;
        if (other == null)
            flag = false;
        if (other.id == null)
            flag = false;
        if (this.id == null)
            flag = false;
        if (other.name == null)
            flag = false;
        if (other.lastname == null)
            flag = false;
        if (this.name == null)
            flag = false;
        if (this.lastname == null)
            flag = false;
        if (this.id == other.id)
            flag = true;
        if (this.name == other.name)
            flag = true;
        if (this.lastname == other.lastname)
            flag = true;
        return flag;
    }
}
