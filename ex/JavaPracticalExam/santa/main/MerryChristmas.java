package santa.main;

import santa.MallSanta;
import santa.Kid;
import santa.SantaDelivery;

import java.util.*;
import java.text.*;

public class MerryChristmas{
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat myFormat = new SimpleDateFormat("yyyy");

    public static void main (String args[]){
        // Grade 2
        Date year1 = new Date();
        Date year2 = new Date();
        Date year3 = new Date();
        
        try{
            year1 = myFormat.parse("2015");
            year2 = myFormat.parse("2014");
            year3 = myFormat.parse("2014");
        }catch(ParseException e){
            System.out.println("Errror");
        }

        Kid kid1 = new Kid("Josh", year1, "male", true);
        Kid kid2 = new Kid("Amanda", year2, "female", true);
        Kid kid3 = new Kid("Robert", year3, "male", false);
        
        MallSanta tesco = new MallSanta(kid1, "TescoMall");
        MallSanta allee = new MallSanta(kid3, "Allee");

        System.out.println(MallSanta.hoHoHo());
        System.out.println(tesco.merryChristmas());
        System.out.println(tesco.merryChristmas(kid2.getName()));
        System.out.println(allee.merryChristmas());

        // Grade 3
        SantaDelivery delivery1 = new SantaDelivery(kid1, "15:00", "Pazmany Peter");
        SantaDelivery delivery2 = new SantaDelivery(kid2, "15:00", "Deak");
        SantaDelivery delivery3 = new SantaDelivery(kid3, "15:00", "Pazmany Peter");
        System.out.println("\n");
        System.out.println(delivery1);
        System.out.println(delivery2);
        System.out.println(delivery3);
        
        // Grade 4
        Kid inputKid1 = createKid();
        Kid inputKid2 = createKid();
        if(inputKid1.isEquals(inputKid2)){
            System.out.println("The same Kid");
        }else{
            System.out.println("Not the same Kid");
        }
    }
    public static Kid createKid(){
        System.out.println("\nInput the name Kid:");
        String nameKid4 = scanner.next();
        
        System.out.println("Input the birth year Kid4:");
        Date yearKid4 = new Date();
        boolean check = false;
        while(!check){
            try{
                yearKid4 = myFormat.parse(scanner.next());
                check = true;
            }catch(ParseException e){
                System.out.println("Wrong syntax. try again");
                check =false;
            }
        }

        System.out.println("Input the gender Kid4:");
        String genderKid4 = scanner.next();

        boolean isGood=false;
        System.out.println("Is a good kid True or false:");
        try{
            isGood = scanner.nextBoolean();
        }catch(Exception e){
            System.out.println("Wrong syntax");
        }

        Kid kid4 = new Kid(nameKid4, yearKid4, genderKid4, isGood);
        return kid4;
    }
}