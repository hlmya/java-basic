
import java.util.*;
import models.TrainTrip;
import models.AirportTrip;
import models.City;
import models.TravelTwoCities;

public class MyTripPlanner{
    public static void main (String args[]){
        City budapest = new City("budapest");
        City debrecen = new City("debrecen");
        City barcelona = new City("barcelona");

        TrainTrip trBPDB = new TrainTrip(50.5, 100, budapest, debrecen, "Keleti", 'A');
        AirportTrip aiBPDB = new AirportTrip(200, 100, budapest, debrecen, "Liszt Ferenc", 20);

        printIfWorthsTrain(aiBPDB,trBPDB);
    }

    public static void printIfWorthsTrain(AirportTrip aiBPDB, TrainTrip trBPDB){
        if(!aiBPDB.sameTrip(trBPDB)){
            System.out.println("Invalid trip-cannot compare");
        }else if(trBPDB.averageTime() + 3 < aiBPDB.averageTime()){
            System.out.println("less than 3hours - take Train");
        }else if(trBPDB.getMaximumClass() == 'A'){
            System.out.println("class A - take Train");
        }else{
            System.out.println("Take airport");
        }
    }
}