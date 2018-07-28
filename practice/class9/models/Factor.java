package models;

public class Factor extends Unary implements Calculation{
    //Field
    private double result;

    //Constructor
    public Factor(){
        this.result = 1;
    }
    //Getter and setter

    //Implement method in Calculation
    //@Override
    public double getResult(){
        return result;
    }
    //@Override
    public void calculate(){
        for(double i=super.getNumber(); i>0; i--){
            this.result = this.result * i;
        }
    }
}