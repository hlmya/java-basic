package santa;

public class MallSanta extends SantaSaying{
    // Field
    private Kid kid;
    private String mallName;

    // Constructor
    public MallSanta(Kid kid, String mallName){
        this.kid = kid;
        this.mallName = mallName;
    }

    // Getter and setter
    public void setName(String mallName){
        this.mallName = mallName;
    }
    public String getName(){
        return this.mallName;
    }

    public void setKid(Kid kid){
        this.kid = kid;
    }
    public Kid getKid(){
        return this.kid;
    }

    // Override merrychritsmas
    @Override
    public String merryChristmas(String name){
        return super.merryChristmas(name)+", enjoy shopping with " + this.mallName;
    }

    // Overload method  
    public String merryChristmas(){
        return "Merry Christmas dear " + kid.getName()+ ", enjoy shopping with "+ this.mallName;
    }
}