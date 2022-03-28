package Integrador.Colegio.Ar.edu.aui.business;

public class Login {

    // attributes
    private String user;
    private String password;

    // roles
    /*private enum schoolRole {
        PROFESSOR, STUDENT
    }*/

    // constructor
    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    // setters
    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getters
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
