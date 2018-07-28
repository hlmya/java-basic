package models;

public class Flying extends Animal{
    private String mode;
    //Constructor
    public Flying(String name, String specie, String song, String needs){
        super(name, specie, song, needs);
        this.mode = "Flying";
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