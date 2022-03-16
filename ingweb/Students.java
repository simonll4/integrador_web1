package ingweb;

public class Students implements Comparable<Students>{
    // atributos
    private int id;
    private String name;
    private int age;
    private String origin;
    private int yearStudy;

    // constructor
    Students(int id, String name, int age, String origin, int yearStudy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.yearStudy = yearStudy;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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
    public String getName(){
        return name;
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
        return this.name.compareTo(s.getName());
    }
}
