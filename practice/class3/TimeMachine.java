import java.util.Date;
import java.text.*;

public class TimeMachine{
    public static void main (String args[]){
        Date date1 = new Date();
        System.out.println("Today: " + date1.toString()); //Today: Thu Dec 07 11:29:09 CET 2017

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Today with new format: " + dateFormat.format(date1));

        // Parse String to Date
        Date date2 = new Date();
        try{
            date2 = dateFormat.parse("2017-12-07");
            System.out.println("Yesterday: " + dateFormat.format(date2));
        }catch(ParseException e){
            System.out.println("Wrong day");
        }

        // DateItinerary test = new DateItinerary("20171207","20171207");
        // System.out.println(test.toString());

        //How to solve the case Today: Thu Dec 07 11:29:09 CET 2017 and Today: Thu Dec 07 00:00:09 CET 2017
        DateItinerary test = new DateItinerary(date1,date2);
        System.out.println(test.toString());
    }
}