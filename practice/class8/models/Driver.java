package models;
import java.util.Date;

public class Driver extends Person implements PaymentCheck{
    private int hours;
    private double fines;
    private String code;

    // Constructor
    public Driver(String name, Date birthday, String code){
        super(name, birthday);
        this.code = code;
    }

    // Getter and setter
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setAditionalNightHours(int hours){
        this.hours = hours;
    }
    public int getAditionalNightHours(int hours){
        return this.hours;
    }

    // Implement method from Interface
    // returning the gross salary 
    public double getGrossWage(){
        return 0;
    }

    // returning the discounts and descriptions double 
    public String getDiscounts(){
        return "getDiscounts";
    }

    //returning the net wage.
    public double calculateNetWage(){
        return 2;
    }
}