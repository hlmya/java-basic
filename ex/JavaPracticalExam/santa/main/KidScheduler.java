package santa.main;

import santa.MallSanta;
import santa.Kid;
import santa.SantaDelivery;

import java.util.*;
import java.text.*;


public class KidScheduler{
    static List<Kid> list1 = new ArrayList<>();
    static List<Kid> list2 = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat myFormat = new SimpleDateFormat("yyyy");

    public static void main (String args[]){
        // requirement 5
        System.out.println("How many kids");
        int numKid = scanner.nextInt();

        Kid kid1 = createKid();
        list1.add(kid1);

        Kid kidnext;
        for(int i = 0; i<numKid-1; i++){
            kidnext = createKid();
            if(kid1.getName().compareToIgnoreCase(kidnext.getName())>0){
                list1.add(kidnext);
            }else if(kid1.getName().compareToIgnoreCase(kidnext.getName())<0){
                list2.add(kidnext);
            }
        }

        for(Kid k: list1){
            System.out.println(k);
        }
        System.out.println(" ");
        for(Kid k: list2){
            System.out.println(k);
        }

    }

    public static Kid createKid(){
        
        System.out.println("Input the name Kid:");
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

        System.out.println("Input the gender Kid:");
        String genderKid4 = scanner.next();

        boolean isGood = false;
        System.out.println("Is a good kid True or false:");
        try{
            isGood = scanner.nextBoolean();
        }catch(Exception e){
            System.out.println("Wrong syntax");
        }

        Kid newKid = new Kid(nameKid4, yearKid4, genderKid4, isGood);
        return newKid;
    }
}