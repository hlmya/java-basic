package models;

public class Landing extends Animal{
    private String mode;
    //Constructor
    public Landing(String name, String specie, String song, String needs){
        super(name, specie, song, needs);
        this.mode = "Landing";
    }

    @Override
    public String entranceMode(){
        return this.mode;
    }

    @Override
    public String toString(){
        return super.toString() + " : " + this.mode;
    }
}