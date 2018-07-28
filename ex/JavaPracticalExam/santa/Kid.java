package santa;
import java.util.*;
import java.text.*;

public class Kid{
    // Field
    private String name;
    private Date birthYear;
    private String gender;
    private boolean goodKid;
    //private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    //Contructor
    public Kid(String name, Date birthYear, String gender, boolean goodKid){
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.goodKid = goodKid;
    }
    //Getter and setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setBirthYear(Date birthYear){
        this.birthYear = birthYear;
    }
    public Date getBirthYear(){
        return this.birthYear;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

    public void setGoodKid(boolean goodKid){
        this.goodKid = goodKid;
    }
    public boolean getGoodKid(){
        return this.goodKid;
    }

    // //get age method: returns the age based on the year of birth as compared to 2017
    // public int getAge(){
    //     String yearBirth = yearFormat.format(this.birthYear);
    //     int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    //     return currentYear - Integer.parseInt(yearBirth);
    // }

    //Tostring method
    public String toString(){
        return this.name + " (" + getAge() + ","+ this.gender + ") " + this.goodKid; 
    }

    // equals method
    public boolean isEquals(Kid kid){
        if(this.name.equalsIgnoreCase(kid.getName()) && this.gender.equalsIgnoreCase(kid.getGender()) && (this.birthYear.compareTo(kid.getBirthYear())==0)){
            return true;
        }
        return false;
    }

    public int getAge(){
        Calendar lCal = Calendar.getInstance();
        lCal.setTime(this.birthYear);
        int yearBirth = lCal.get(Calendar.YEAR);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearBirth;
   }
}