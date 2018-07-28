import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;

import models.Flying;
import models.Landing;
import models.Swimming;
import models.Guest;
import models.Animal;

public class LionKingParty{
    static Scanner scanner = new Scanner(System.in);
    static Guest guests = new Guest();

    public static void main(String args[]){
        // Create sample data on list
        createdData();

        String userCommand;
        do{
            System.out.println("\n[0.]Exit [1.]Register guest [2.]List guest [3.]Remove guest [4.]Check if animal is on list");
            System.out.println("[5.]List registered songs [6.]Pick a song [7.]List played songs [8.]List needs by name");
            System.out.println("[9.]List needs by specie [10.]Search animal needs by name [11.]Search animal needs by specie");
            userCommand = scanner.nextLine();

            switch(userCommand){
                case "0":
                    return;
                case "1":
                    registerGuest();
                    break;
                case "2":
                    guests.printAllGuests();
                    break;
                case "3":
                    System.out.println("What's animal name?");
                    String name = scanner.nextLine();
                    if(guests.removeGuests(name)){
                        System.out.println("The animal " + name + " is removed");
                    }else{
                        System.out.println("No animal " + name + " to remove");
                    }
                    break;
                case "4":
                    System.out.println("What's animal name?");
                    String checkName = scanner.nextLine();
                    if(guests.isGuestExist(checkName)){
                        System.out.println("Animal is on the list");
                    }else{
                        System.out.println("Animal is not existed");
                    }
                    break;
                case "5":
                    guests.printRegisteredSong();
                    break;
                case "6":
                    System.out.println(guests.pickSong());
                    break;
                case "7":
                    guests.printPlayedSong();
                    break;
                case "8":
                    guests.sortByName();
                    guests.printNeedsByName();
                    break;
                case "9":
                    guests.sortBySpecie();
                    guests.printNeedsBySpecie();
                    break;
                case "10":
                    System.out.println("What's animal name?");
                    String nameAnimal = scanner.nextLine();
                    guests.filterNeedsByName(nameAnimal);
                    break;
                case "11":
                    System.out.println("What's specie name?");
                    String specieAnimal = scanner.nextLine();
                    guests.filterNeedsBySpecie(specieAnimal);
                    break;
                default:
                    System.out.println("Please choose input from 0 to 11");
                    break;
            }
        }while(!userCommand.equals("0"));
    }

    //Register guest for the party
    public static void registerGuest(){
        String guestName = registerName();

        System.out.println("What's guest specie?");
        String guestSpecie = scanner.nextLine();
        
        String songName = registerSong();

        System.out.println("What's animal needs?");
        String needs = scanner.nextLine();

        String entranceMode;
        do{
            System.out.println("What does animal need? [1.]Landing [2.]Swimming [3.]Flying");
            entranceMode = scanner.nextLine();
            switch(entranceMode){
                case "1":
                    Animal g1 = new Landing(guestName,guestSpecie,songName,needs);
                    guests.addGuests(g1);
                    break;
                case "2":
                    Animal g2 = new Swimming(guestName,guestSpecie,songName,needs);
                    guests.addGuests(g2);
                    break;
                case "3":
                    Animal g3 = new Flying(guestName,guestSpecie,songName,needs);
                    guests.addGuests(g3);
                    break;
                default:
                    System.out.println("Please input from 1 to 3");
                    break;
            }
        }while(!entranceMode.equals("1") && !entranceMode.equals("2") && !entranceMode.equals("3"));
    }

    // Register Name of guest
    public static String registerName(){
        String animalName="";
        do{
            System.out.println("What's guest name?");
            animalName = scanner.nextLine();
        }while(guests.isGuestExist(animalName));
        return animalName;
    }

    //Register a song for party
    public static String registerSong(){
        String songName = "";
        do{
            System.out.println("What's song name?");
            songName = scanner.nextLine();
        }while(guests.isRegisteredSong(songName) || guests.isPlayedSong(songName));
        return songName;
    }

    // Create database
    public static void createdData(){
        Animal g1 = new Landing("Simba","Lion","Heal the world","Large road for 4 paws");
        guests.addGuests(g1);
        Animal g2 = new Landing("Alex","Chicken","Happy new year","Land for comming");
        guests.addGuests(g2);

        Animal g3 = new Swimming("Carlos","Shark","If I die young","Come from sea");
        guests.addGuests(g3);
        Animal g4 = new Swimming("Kaka","Shark","My heart will go on","Come from sea");
        guests.addGuests(g4);

        Animal g5 = new Flying("Leonard","Bird","Love you, love me","The extension of its wings");
        guests.addGuests(g5);
        Animal g6 = new Flying("Jay","Butterfly","Please forget me","Small wings");
        guests.addGuests(g6);
    }
}