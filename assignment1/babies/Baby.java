//Name: Hoang Le My Anh
//Code: e1cs55
package babies;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;

import gifts.ArrayGift;

public class Baby{
    private String name;
    private char gender;
    private Date birthday;

    //Constructor
    public Baby(){
        //nothing
    }
    //Constructor
    public Baby(String name, char gender, Date birthday){
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }
    //Constructor
    public Baby(String name, char gender, String birthday){
        this.name = name;
        this.gender = gender;
        this.birthday = convertStringToDate(birthday);
    }

    public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Date getBirthday(){
		return this.birthday;
	}

    // If a given kid is older than the current one
    public boolean isOlder(Baby baby){
        if(baby.howOld() > howOld()){
            return true;
        }
        return false;
    }

    // The actual age of the kid in days
    public int howOld(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - getBirthYear();
    }

    //Get year of birthday
    public int getBirthYear(){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year = yearFormat.format(this.birthday);
        return Integer.parseInt(year);
    }

    //Convert String to Date when user input String
    public Date convertStringToDate(String birthday){
        SimpleDateFormat birthdayFormat = new SimpleDateFormat("ddMMyyyy");
        Date birthDate = null;
        try {
            return birthdayFormat.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return birthDate;
    }
}