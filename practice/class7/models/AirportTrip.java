package models;

public class AirportTrip extends TravelTwoCities{
    private String airportName;
    private double distanceToAirport;

    //Contructor
    public AirportTrip(double speed, double distance, City cityOne, City cityTwo, String airportName, double distanceToAirport){
        super(speed, distance, cityOne, cityTwo);
        this.airportName = airportName;
        this.distanceToAirport = distanceToAirport;
    }
    //Getter and setter
    public void setAirportName(String airportName){
        this.airportName = airportName;
    }
    public String getAirportName(){
        return this.airportName;
    }
    public void setDistanceToAirport(double distanceToAirport){
        this.distanceToAirport = distanceToAirport;
    }
    public double getDistanceToAirport(){
        return this.distanceToAirport;
    }
}