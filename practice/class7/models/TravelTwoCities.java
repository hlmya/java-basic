package models;

public class TravelTwoCities{
    private double speed;
    private double distance;
    private City cityOne;
    private City cityTwo;
    //Constructor
    public TravelTwoCities(double speed, double distance, City cityOne, City cityTwo){
        this.speed = speed;
        this.distance = distance;
        this.cityOne = cityOne;
        this.cityTwo = cityTwo;
    }

    //Getter and setter
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public double getDistance(){
        return this.distance;
    }
    public void setCityOne(City cityOne){
        this.cityOne = cityOne;
    }
    public City getCityOne(){
        return this.cityOne;
    }
    public void setCityTwo(City cityTwo){
        this.cityTwo = cityTwo;
    }
    public City getCityTwo(){
        return this.cityTwo;
    }

    // double Average time method
    public double averageTime(){
        return distance/speed;
    }
    // bolean same trip method: A->B different B->A
    public boolean sameTrip(TravelTwoCities ttc){
        return (this.getCityOne().equals(ttc.getCityOne()) && this.getCityTwo().equals(ttc.getCityTwo()));
    }
}