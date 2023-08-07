public class Singer extends Person2 {
    private String bandName;
    private int  heir;


    public Singer(String name, String bandName,int heir) {
        super(name);
        this.bandName = bandName;
        this. heir=heir;

    }
    public String learn3(){
        return "Singing";
    }

    public String walk3(){
        return "Singing shou";
    }
    public String eat3(){
        return "Pelmeny";
    }


    public void pacan2() {

        System.out.println("son followed father = " +"heir: "+ heir);
        System.out.println("legacy: "+learn()+" ,"+walk()+" ,"+eat()+" \nhis skilss: "+learn3()+"\nWalk: "+walk3()+"\nEat: "+eat3());
    }

    @Override
    public String toString() {
        return super.toString() + ", bandName = " + bandName;
    }
}

