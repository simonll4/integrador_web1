package Integrador.Colegio.Ar.edu.aui.model;

public class User {

    // Variables
    private String userName;
    private String password;

    // Constructors
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // setters
    public void setUserName(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getters
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
