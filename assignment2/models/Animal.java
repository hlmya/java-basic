package models;

public abstract class Animal implements ArrivalMode{
    //Fields
    private String name;
    private String specie;
    private String song;
    private String needs;

    //Constructor
    public Animal(String name, String specie, String song, String needs){
        this.name = name;
        this.specie = specie;
        this.song = song;
        this.needs = needs;
    }

    //Getter and setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSpecie(String specie){
        this.specie = specie;
    }
    public String getSpecie(){
        return this.specie;
    }
    public void setSong(String song){
        this.song = song;
    }
    public String getSong(){
        return this.song;
    }
    public void setNeeds(String needs){
        this.needs = needs;
    }
    public String getNeeds(){
        return this.needs;
    }
    //ToString
    public String toString(){
        return this.name + " : " + this.specie + " : " + this.song + " : " + this.needs;
    }

    //Implement from interface
    public String entranceMode(){
        return "Main entrance";
    }
}