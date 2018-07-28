package models;
import java.util.Date;

public abstract class Person{
    private String name;
    private Date birthday;
    private String phone;
    private String bloodType;

    //Constructor
    public Person(String name, Date birthday, String phone, String bloodType){
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.bloodType = bloodType;
    }

    // Getter and setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public Date getBirthday(){
        return this.birthday;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    public String getBloodType(){
        return this.bloodType;
    }

    // To string
    public String toString(){
        return "Name: "+ name + " Birthday: " + birthday.toString() + " Phone: " + phone + " Blood: "+bloodType;
    }

}