package Integrador.Colegio.Ar.edu.aui.model;

public class Home {

    // Variables
    private String country;
    private String street;
    private int num;
    private String postalCode;
    private int apartament;
    private String tower;
    private int floor;
    private String neighborhood;
    private String location;
    private String comments;
    private double latitude;
    private double longitude;

    // Constructors
    public Home(String country, String street, int num,
            String postalCode, int apartament, String tower, int floor,
            String neighborhood, String location, String comments, double latitude, double longitude) {

        this.country = country;
        this.street = street;
        this.num = num;
        this.postalCode = postalCode;
        this.apartament = apartament;
        this.tower = tower;
        this.floor = floor;
        this.neighborhood = neighborhood;
        this.location = location;
        this.comments = comments;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Home(){

    }

    // setters
    public void setCountry(String country) {
        if (country != null) {
            country = country.trim();
        }
        this.country = country;
    }

    public void setStreet(String street) {
        if (street != null) {
            street = street.trim();
        }
        this.street = street;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPostalCode(String postalCode) {
        if (postalCode != null) {
            postalCode = postalCode.trim();
        }
        this.postalCode = postalCode;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }

    public void setTower(String tower) {
        if (tower != null) {
            tower = tower.trim();
        }
        this.tower = tower;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNeighborhood(String neighborhood) {
        if (neighborhood != null) {
            neighborhood = neighborhood.trim();
        }
        this.neighborhood = neighborhood;
    }

    public void setLocation(String location) {
        if (location != null) {
            location = location.trim();
        }
        this.location = location;
    }

    public void setComments(String comments) {
        if (comments != null) {
            comments = comments.trim();
        }
        this.comments = comments;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // getters
    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getNum() {
        return num;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public int getApartament() {
        return apartament;
    }

    public String getTower() {
        return tower;
    }

    public int getFloor() {
        return floor;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getLocation() {
        return location;
    }

    public String getComments() {
        return comments;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String toString() {
        return this.street + this.num + this.country + this.postalCode + "";
    }

    public boolean equals(Home other) {
        boolean flag = false;
        if (other == null)
            flag = false;
        if (other.latitude == 0 || other.longitude == 0)
            flag = false;
        if (this.latitude == 0 || this.longitude == 0)
            flag = false;
        if (other.longitude == this.longitude && other.latitude == this.latitude)
            flag = true;
        return flag;
    }
}
