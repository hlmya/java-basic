//Name: Hoang Le My Anh
//Code: e1cs55
package gifts;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class ArrayGift{
    private ArrayList<Gift> gifts;

    public ArrayGift(){
        gifts = new ArrayList<Gift>();
    }

    public ArrayList<Gift> getGifts(){
        return this.gifts;
    }

    public void setGifts(ArrayList<Gift> gifts){
        this.gifts = gifts;
    }

    public void addGift(Gift g){
        gifts.add(g);
    }

    public int numberOfGift(){
        return gifts.size();
    }

    public void listGift(){
        SimpleDateFormat myFormat= new SimpleDateFormat("dd/MM/yyyy h:m");
		if (gifts.size() > 0){
            for(Gift g: gifts){
			    System.out.println(g.getDonorName() + " : " + g.getGiftDescription() + " : " + myFormat.format(g.getGivenDate()));
		    }
        }else{
            System.out.println("Nothing in list, please add gift");
        }

	}
}