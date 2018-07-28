package models;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student extends Person{
    private Date enrolment;
    private SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
    // Constructor
    public Student(String name, Date birthday, Date enrolment){
        super(name, birthday);
        this.enrolment = enrolment;
    }

    //Getter and Setter
    public void setEnrolment(Date enrolment){
        this.enrolment = enrolment;
    }
    public Date getEnrolment(){
        return this.enrolment;
    }
    //ToString method
    public String toString(){
        return super.toString() + " :Enrolment date: " + myFormat.format(this.enrolment);
    }
}
