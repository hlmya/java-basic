package santa;

public abstract class SantaSaying{

    // COnstruct
    public SantaSaying(){
        // Nothing;
    }
    
    // method
    public static String hoHoHo(){
        return "Ho Ho Ho";
    }

    public String merryChristmas(String name){
        return "Merry Christmas dear " + name;
    }
}