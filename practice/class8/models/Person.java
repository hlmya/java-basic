package models;
import java.util.Date;
public class Person{
    private String name;
    private Date birthday;

    //Constructor
    public Person(){}
    public Person(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
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
}