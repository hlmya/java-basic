package models;

public class Swimming extends Animal{
    private String mode;
    //Constructor
    public Swimming(String name, String specie, String song, String needs){
        super(name, specie, song, needs);
        this.mode = "Swimming";
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