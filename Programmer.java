public class Programmer extends Person2 {
    private String companyName;
    private int heir;

    public Programmer(String name, String companyName,int  heir) {
        super(name);
        this.companyName = companyName;
        this. heir= heir;

    }
    public String learn1(){
        return "coding";
    }
    public String walk1(){
        return "Office";
    }
    public String eat1(){
        return "Sushi";
    }

    public void pacan() {
        ;
        System.out.println("son followed father = "+" heir: " + heir);
        System.out.println("legacy: "+learn()+" ,"+walk()+" ,"+eat()+" \nhis skills: "+learn1()+"\nWalk: "+walk1()+"\nEat: "+eat1());

    }


    @Override
    public String toString() {
        return super.toString() + ", companyName = " + companyName;


    }

}




