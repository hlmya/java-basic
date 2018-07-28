//Name: Hoang Le My Anh
//Code: e1cs55
package gifts;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Gift{
    private String donorName;
    private String description;
    private Date givenDate;
    //Constructor
    public Gift(){
        
    }
    public Gift(String donorName, String description, Date givenDate){
        this.donorName = donorName;
        this.description = description;
        this.givenDate = givenDate;
    }

    public Gift(String donorName, String description, String givenDate){
        this.donorName = donorName;
        this.description = description;
        this.givenDate = convertStringToDate(givenDate);
    }

    public String getDonorName(){
        return this.donorName;
    }

    public void setDonorName(String donorName){
        this.donorName = donorName;
    }

    public String getGiftDescription(){
        return this.description;
    }

    public void setGiftDescription(String description){
        this.description = description;
    }

    public Date getGivenDate(){
        return this.givenDate;
    }

    public void setGivenDate(Date givenDate){
        this.givenDate = givenDate;
    }

    //Convert String to Date when user input String
    public Date convertStringToDate(String input){
        SimpleDateFormat dayFormat = new SimpleDateFormat("ddMMyyyy");
        Date givenDate = null;
        try {
            return dayFormat.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return givenDate;
    }
}