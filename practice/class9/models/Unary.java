package models;

public abstract class Unary{
    // field
    private double n;

    //constructor
    public Unary(){
        //Do nothing
    }
    //Getter and setter
    public void setNumber(double n){
        this.n = n;
    }
    public double getNumber(){
        return this.n;
    }
}