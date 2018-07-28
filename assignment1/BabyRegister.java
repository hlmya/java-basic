//Name: Hoang Le My Anh
//Code: e1cs55
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.io.IOException;
import java.util.InputMismatchException;

import gifts.Gift;
import gifts.ArrayGift;
import babies.Baby;
import babies.ArrayBabies;

public class BabyRegister {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat myFormat= new SimpleDateFormat("ddMMyyyy");
		//Define and initialize valuable
		String userOption;
        ArrayGift arrayGift = new ArrayGift();
		ArrayBabies arrayBaby = new ArrayBabies();

		//Fill sample data
		prefilledData(arrayBaby, arrayGift);

		// Handle Baby or Gift options 
        do{
			System.out.println("HOME: Choose number [0.Exit] [1.Baby registration] or [2.Gift]");
			userOption = scanner.next();

			switch(userOption){
				case "0":
					break;
				case "1":
					userOption = babyRegistration(scanner, arrayBaby, myFormat);
					break;
				case "2":
					userOption = giftRegistration(scanner, arrayGift, myFormat);
					break;
				default:
					break;
			}
		}while(!userOption.equalsIgnoreCase("0"));
    }

	//Method to handle with GIFT
	public static String giftRegistration(Scanner scanner, ArrayGift arrayGift, SimpleDateFormat myFormat){
		String userInput;
		do{
			System.out.println("GIFT: Choose number [1.Exit] [2.Add] or [3.List]");
			userInput = scanner.next();
			switch(userInput){
				case "1":
					break;
				case "2":
					System.out.println("Name of the donor:");
					String donorName = scanner.next();

					System.out.println("Description of the gift:");
					String description = scanner.next();

					System.out.println("Date from when the gift was given (ddMMyyyy):");
					Date givenDate = new Date();

					// If wrong input format (ddMMyyyy), type it again
					boolean validDate = false;
					while(!validDate){
						try{
							givenDate = myFormat.parse(scanner.next());
							validDate = true;
						}catch(ParseException e){
							System.out.println("Invalid date, type it again");
							validDate = false;
						}
					}
					Gift g = new Gift(donorName, description, givenDate);
					arrayGift.addGift(g);
					System.out.println("Total gifts are "+  arrayGift.numberOfGift());
					break;
				case "3":
					arrayGift.listGift();
					break;
				default:
					break;
			}
		}while(!userInput.equalsIgnoreCase("1"));
		return userInput;
	}

	//Method to handle with BABY
	public static String babyRegistration(Scanner scanner, ArrayBabies arrayBaby, SimpleDateFormat myFormat){
		String userInput;
		do{
			System.out.println("BABY: Choose number [1.Exit] [2.Add] [3.List by name] [4.List by age]");
			userInput = scanner.next();

			switch(userInput){
				case "1":
					break;
				case "2":
					System.out.println("Name of the baby:");
					String babyName = scanner.next();

					System.out.println("Gender:");
					char babyGender = scanner.next().charAt(0);

					System.out.println("Birthday (ddMMyyyy):");

					Date babyBirthday = new Date();
					boolean validDate = false;
					// If wrong input format (ddMMyyyy), type it again
					while(!validDate){
						try{
							babyBirthday = myFormat.parse(scanner.next());
							validDate = true;
						}catch(ParseException e){
							System.out.println("Invalid date, type it again");
							validDate = false;
						}
					}

					Baby b = new Baby(babyName, babyGender, babyBirthday);
					arrayBaby.addBaby(b);
					System.out.println("Total babies are "+  arrayBaby.numberOfBabies());
					break;
				case "3":
					arrayBaby.sortByName();
					arrayBaby.listBabies();
					break;
				case "4":
					arrayBaby.sortByAge();
					arrayBaby.listBabies();
					break;
				default:
					break;
			}
		}while(!userInput.equalsIgnoreCase("1"));
		return userInput;
	}

	public static void prefilledData(ArrayBabies arrayBaby, ArrayGift arrayGift){
		//Pre-filled data
		//Baby
		Baby b1 = new Baby("Annie",'f',"12122015");
		arrayBaby.addBaby(b1);
		Baby b2 = new Baby("John",'m',"09012014");
		arrayBaby.addBaby(b2);
		Baby b3 = new Baby("Katty",'f',"12042016");
		arrayBaby.addBaby(b3);
		Baby b4 = new Baby("Alice",'f',"02022013");
		arrayBaby.addBaby(b4);
		//Gift
		Gift g1 = new Gift("Jane","Car toy", "12122015");
		arrayGift.addGift(g1);
		Gift g2 = new Gift("Jack","Doll toy", "09012014");
		arrayGift.addGift(g2);
		Gift g3 = new Gift("Taylor","Boat toy", "12042016");
		arrayGift.addGift(g3);
		Gift g4 = new Gift("Micky","Train toy", "02022013");
		arrayGift.addGift(g4);
	}
}