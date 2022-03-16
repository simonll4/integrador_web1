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

    // setters
    public void setCountry(String country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setComments(String comments) {
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
}
