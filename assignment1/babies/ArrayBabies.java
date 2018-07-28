//Name: Hoang Le My Anh
//Code: e1cs55
package babies;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class ArrayBabies{
    private ArrayList<Baby> babies;

    public ArrayBabies(){
        babies = new ArrayList<Baby>();
    }

    public ArrayList<Baby> getBabies(){
        return this.babies;
    }

    public void setBabies(ArrayList<Baby> babies){
        this.babies = babies;
    }

    public void addBaby(Baby b){
        babies.add(b);
    }

    public int numberOfBabies(){
        return babies.size();
    }

    public void listBabies(){
        SimpleDateFormat myFormat= new SimpleDateFormat("dd/MM/yyyy h:m");
		if(babies.size()>0){
			for(Baby b: babies){
				System.out.println(b.getName() + " : " + b.getGender() + " : " + myFormat.format(b.getBirthday()));
			}
		}else{
			System.out.println("Nothing in list, please add baby");
		}

	}

    public void sortByName(){	
		for(int i=0; i<babies.size()-1; i++){
			for(int j=i+1; j<babies.size(); j++){
				Baby b1 = babies.get(i);
				Baby b2 = babies.get(j);
				if(b1.getName().compareTo(b2.getName())>0){
					Baby temp = b1;
					babies.set(j,temp);
					babies.set(i, b2);
				}
			}
		}
	}

    public void sortByAge(){	
		for(int i=0; i<babies.size()-1; i++){
			for(int j=i+1; j<babies.size(); j++){
				Baby b1 = babies.get(i);
				Baby b2 = babies.get(j);
				if(b2.isOlder(b1)){
					Baby temp = b1;
					babies.set(j,temp);
					babies.set(i, b2);
				}
			}
		}
	}
}