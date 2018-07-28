package santa;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SantaDelivery extends SantaSaying{
    // field
    private Kid kid;
    private Date deliveryTime;
    private String address;
    SimpleDateFormat myFormat = new SimpleDateFormat("HH:mm");

    // constructor handle Date
    public SantaDelivery(Kid kid, String deliveryTime, String address){  
        this.kid = kid;
        this.address = address;
        try{
            this.deliveryTime = myFormat.parse(deliveryTime);
        }catch(ParseException e){
            System.out.println("Error when parse Time");
        }
    }

    // getter and setter
    public void setKid(Kid kid){
        this.kid = kid;
    }
    public Kid getKid(){
        return this.kid;
    }

    public void setDeliveryTime(Date deliveryTime){
        this.deliveryTime = deliveryTime;
    }
    public Date getDeliveryTime(){
        return this.deliveryTime;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    
    public static String hoHoHo(){
        return  "Ho Ho Ho, the traffic is crazy today";
    }

    @Override
    public String toString(){
        if(this.kid.getGoodKid()){
            return "Delivery to "+ this.address+ " for " + kid.toString() +" at " + myFormat.format(this.deliveryTime);
        }else{
            return "No delivery for "  + kid.toString() +", because he was bad";
        }
    }
}