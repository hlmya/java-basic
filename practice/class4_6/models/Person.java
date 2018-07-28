package models;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Person{
    private String name;
    private Date birthday;
    private SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");

    // Constructor
    public Person(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public Person(){
        //Do nothing
    }

    //Getter and setter
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

    // Equals method
    public boolean equalPerson(Person other){
        // Return true if person exist
        if(this.name.equalsIgnoreCase(other.name) && this.birthday.equals(other.birthday)){
            return true;
        }
        return false;
    }

    //ToString method
    public String toString(){
        return this.name + ":Birthday: " + myFormat.format(this.birthday);
    }

}