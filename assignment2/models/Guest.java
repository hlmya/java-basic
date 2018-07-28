package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*; 

public class Guest{
    private List<Animal> guests;
    private List<String> registeredSongs;
    private List<String> playedSongs;

    //Constructor
    public Guest(){
        guests = new ArrayList<Animal>();
        registeredSongs = new ArrayList<String>();
        playedSongs = new ArrayList<String>();
        // hashset = new HashSet<String>();  
    }

    //Getter and setter
    public List<Animal> getGuests(){
        return this.guests;
    }
    public void setGuests(List<Animal> guests){
        this.guests = guests;
    }

    // Put all the animals into an ArrayList
    public void addGuests(Animal g){
        guests.add(g);
        registeredSongs.add(g.getSong());
    }
    
    //Number of guests
    public int howManyGuest(){
		return guests.size();
    }
    // Check if an animal is on the Guest list
    public boolean isGuestExist(String guestName){
        boolean isGuest = false;
        for(Animal g: guests){
            if(g.getName().equalsIgnoreCase(guestName)){
                System.out.println("Existed Name");
                isGuest = true;
            }
        }
        return isGuest;
    }
    // Remove Guest from the list
    public boolean removeGuests(String guestName){
        boolean isRemoved = false;
        for(int i=0; i< guests.size(); i++){
            Animal g = guests.get(i);
            if(g.getName().equalsIgnoreCase(guestName)){
                guests.remove(i);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    // Print all guests on the list
    public void printAllGuests(){
        if(guests.size()>0){
            for(Animal g: guests){
                System.out.println(g);
            }
        }else{
            System.out.println("No guests on the list");
        }
    }
    
    // Add a new song
    public void addSongs(String song){
        registeredSongs.add(song);
    }

    // Pick a song randomly
    public String pickSong(){
        if(registeredSongs.size()>0){
            // Pick song randomly
            Random random = new Random();
            int index = random.nextInt(registeredSongs.size());
            String pickedSong = registeredSongs.get(index);
            
            //Remove the song on the registered list
            registeredSongs.remove(index);
            
            //Add the picked song into played list
            playedSongs.add(pickedSong);
            return "The picked song is: "+ pickedSong;
        }else{
            return "No songs to pick. Need to add more songs.";
        }
    }

    // Check the song is exist on the registered list or not
    public boolean isRegisteredSong(String songName){
        boolean isSong = false;
        for(String s: registeredSongs){
            if(s.equalsIgnoreCase(songName)){
                System.out.println("Existed song on the registered list");
                isSong = true;
            }
        }
        return isSong;
    }

    // Check the song is exist on the played list or not
    public boolean isPlayedSong(String songName){
        boolean isSong = false;
        for(String s: playedSongs){
            if(s.equalsIgnoreCase(songName)){
                System.out.println("Existed song on the played list");
                isSong = true;
            }
        }
        return isSong;
    }

    // Print registered songs
    public void printRegisteredSong(){
        if(registeredSongs.size()>0){
            for(String s: registeredSongs){
                System.out.println(s);
            }
        }else{
            System.out.println("No songs on the registered list");
        }
    }

    // Print played songs
    public void printPlayedSong(){
        if(playedSongs.size()>0){
            for(String s: playedSongs){
                System.out.println(s);
            }
        }else{
            System.out.println("No songs on the played list");
        }
    }

    // Sort animal needs by name
    public void sortByName(){	
		for(int i=0; i<guests.size()-1; i++){
			for(int j=i+1; j<guests.size(); j++){
				Animal g1 = guests.get(i);
				Animal g2 = guests.get(j);
				if(g1.getName().compareTo(g2.getName())>0){
					Animal temp = g1;
					guests.set(j,temp);
					guests.set(i, g2);
				}
			}
		}
    }

    // Print animal needs by name
    public void printNeedsByName(){
        for(Animal a: guests){
            System.out.println(a.getName() + " - " + a.getNeeds() + " - " + a.entranceMode());
        }
    }

    // Print animal needs by Specie
    public void printNeedsBySpecie(){
        Set<String> hashset = new HashSet<String>(); 
        for(Animal a: guests){
            hashset.add(a.getSpecie() + " - " + a.getNeeds() + " - " + a.entranceMode());
        }
        printHashSet(hashset);
    }

    // Print hash set
    public void printHashSet(Set<String> hashset){
        Iterator<String> itr=hashset.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }
    }
    
    // Sort animal needs by name
    public void sortBySpecie(){	
		for(int i=0; i<guests.size()-1; i++){
			for(int j=i+1; j<guests.size(); j++){
				Animal g1 = guests.get(i);
				Animal g2 = guests.get(j);
				if(g1.getSpecie().compareTo(g2.getSpecie())>0){
					Animal temp = g1;
					guests.set(j,temp);
					guests.set(i, g2);
				}
			}
		}
    }
    
    //Search animal needs by name
    public void filterNeedsByName(String name){
        boolean check = false;
        for(Animal a : guests){
            if(a.getName().equalsIgnoreCase(name)){
                System.out.println(a.getNeeds() + " - "+ a.entranceMode());
                check = true;
            }
        }
        if(check == false){
            System.out.println("Animal name is not existed");
        }
    }

    //Search animal needs by name
    public void filterNeedsBySpecie(String name){
        Set<String> hashset = new HashSet<String>(); 
        boolean check = false;
        for(Animal a : guests){
            if(a.getSpecie().equalsIgnoreCase(name)){
                hashset.add(a.getNeeds() + " - "+ a.entranceMode());
                check = true;
            }
        }
        if(check == false){
            System.out.println("Animal specie is not existed");
        }else{    
            printHashSet(hashset);
        }
    }
}