public class Dancer extends Person2 {
    private String groupName;
    private int  heir;

    public Dancer(String name, String groupName,int heir) {
        super(name);
        this.groupName = groupName;
        this. heir= heir;

    }public String learn2(){
        return "Dancing";
    }

    public String walk2(){
        return "Party";
    }
    public String eat2(){
        return "Lagman";
    }


    public void devochka() {

        System.out.println("daughter followed father = " +" heir: "+ heir);
        System.out.println("legacy: "+learn()+" ,"+walk()+" ,"+eat()+" \nher skills: "+learn2()+"\nWalk: "+walk2()+"\nEat: "+eat2());
    }

    @Override
    public String toString() {
        return super.toString() + ", groupName = " + groupName;
    }
}
