package Integrador.Colegio.Ar.edu.aui;

public class Students implements Comparable<Students>{
    // atributos
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private String origin;
    private int yearStudy;

    // constructor
    Students(int id, String firstname, String lastname ,int age, String origin, int yearStudy) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.origin = origin;
        this.yearStudy = yearStudy;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public void setYearstudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    // getters
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public int getAge(){
        return age;
    }

    public String getOrigin(){
        return origin;
    }

    public int getYearstudy(){
        return yearStudy;
    }

    @Override
    public int compareTo(Students s){
        if(this.yearStudy != s.getYearstudy()){
            return this.yearStudy - s.getYearstudy();
        }
        return this.firstname.compareTo(s.getFirstname());
    }
}
