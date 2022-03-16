package Integrador.Colegio.Ar.edu.aui.model;

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

    // setters
    public void setID(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
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
    public LocalDate getDatebirth(){
        return dateBirth;
    }
    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }
    
    public BloodType getBloobType(){
        return bloodType;
    }
    
    public Home getResidence(){
        return residence;
    }
    
    public Country getNationality(){
        return nationality;
    }
    
    public Country getEmisorID() {
        return emisorID;
    }
}
