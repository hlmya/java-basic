import java.util.*;
import java.util.Date;
import java.text.*;

import models.Driver;

public class SalaryCalculator{
    public static void main(String args[]){
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
        Date birthday;
        try{
            birthday = myFormat.parse("19901010");
            Driver d = new Driver("Josh",birthday,"PK99324");
            // d.setGrossSalary(300);
            // d.setAditionalNightHours(40);
            // d.setGottenFines(0);
            //System.out.println(d.getDiscounts());
            //System.out.println(d.getGrossWage());
        }catch(ParseException e){

        }

    }
}