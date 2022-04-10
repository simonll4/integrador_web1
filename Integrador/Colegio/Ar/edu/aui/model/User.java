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
    public void setUserName(String userName) {
        if (userName != null) {
            userName = userName.trim();
        }
        this.userName = userName;
    }

    public void setPassword(String password) {
        if (password != null) {
            password = password.trim();
        }
        this.password = password;
    }

    // getters
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Functions
    public String toString() {
        return this.userName + this.password;
    }

    public boolean equals(User other) {
        boolean flag = false;
        if (other == null)
            flag = false;
        if (other.userName == null)
            flag = false;
        if (other.password == null)
            flag = false;
        if (other.userName == this.userName)
            flag = true;
        if (other.password == this.password)
            flag = true;

        return flag;

    }
}
