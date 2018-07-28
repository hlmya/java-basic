import models.Factor;
public class CoolCalculator{
    public static void main(String args[]){
        double n1 = 4;
        double n2 = 2;
    
        Factor f = new Factor();
        f.setNumber(5);
        f.calculate();
        System.out.println("factor " + f.getResult());
        n1 = f.getResult();
        f.setNumber(3);
        System.out.println("factor before getResult" + f.getResult());//120
        f.calculate();
        System.out.println("factor after getResult" + f.getResult());//720 => how to reset?
        n2 = f.getResult();
        System.out.println("factor n2" + n2);//720
    }
}