package models;

public class TrainTrip extends TravelTwoCities{
    private String stationName;
    private char maximunClass;

    // Constructor
    public TrainTrip(double speed, double distance, City cityOne, City cityTwo, String stationName, char maximunClass){
        super(speed, distance, cityOne, cityTwo);
        this.stationName = stationName;
        this.maximunClass = maximunClass;
    }

    //Getter and Setter
    public void setStationName(String stationName){
        this.stationName = stationName;
    }
    public String getStationName(){
        return this.stationName;
    }
    public void setMaximumClass(char maximunClass){
        this.maximunClass = maximunClass;
    }
    public char getMaximumClass(){
        return this.maximunClass;
    }
}