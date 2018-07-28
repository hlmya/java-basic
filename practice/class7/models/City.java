package models;

public class City{
    private String name;
    //Constructor
    public City(String name){
        this.name = name;
    }

    //Getter and setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //boolean equals method
}