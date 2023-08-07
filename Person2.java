public class Person2 {
    private String name;

    public Person2(String name1) {
        this.name = name1;
    }
    public String learn(){
        return "Buisness";
    }
    public String walk(){
        return "Parks";
    }
    public String eat(){
        return "Manty";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
