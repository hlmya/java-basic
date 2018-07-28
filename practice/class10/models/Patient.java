package models;
import java.util.Date;
public class Patient extends Person{
    
    // constructor
    public Patient(String name, Date birthday, String phone, String bloodType){
        super(name, birthday, phone, bloodType);
    }
}