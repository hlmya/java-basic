import java.util.Date;
import java.text.*;

public class DateItinerary{
    private Date current;
    private Date goal;
    private SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");

    //Constructor with strings
    public DateItinerary(String current, String goal){
        try{
            this.current = myFormat.parse(current);
            this.goal = myFormat.parse(goal);
        }catch(ParseException e){
            System.out.println(e.toString());
        }
    }

    //Empty constructor
    public DateItinerary(){

    }

    //Constructor with Date
    public DateItinerary(Date current, Date goal){
        this.current = current;
        this.goal = goal;
        System.out.println("check:"+this.goal);
    }

    //Getter and Setter
    public void setGoal(Date goal){
        this.goal = goal;
    }
    public Date getGoal(){
        return this.goal;
    }
    public void setCurrent(Date current){
        this.current = current;
    }
    public Date getCurrent(){
        return this.current;
    }

    public boolean isInFuture(){
        return this.current.before(this.goal);
    }

    public boolean isInPast(){
        return this.current.after(this.goal);
    }

    public String toString(){
        if(isInFuture()){
            return "Travelling from " + myFormat.format(this.current) + " to " + myFormat.format(this.goal) + ", we are travelling to the future";
        }else if(isInPast()){
            return "Travelling from " + myFormat.format(this.current) + " to " + myFormat.format(this.goal) + ", we are travelling to the past";
        }else{
            return "No trip";
        }
    }
}