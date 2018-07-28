import java.util.Random;

public class ArrayExamples{
	private static int pickRandomNumber(){
		Random random = new Random();
		int picknumber = random.nextInt(50);
		return picknumber;
	}
	//Check unique
	private static boolean isUnique(int randomNumber, int[] numArray){
		for(int num: numArray){
			if(randomNumber == num){
				return false;
			}
		}
		return true;
	}
	public static void main (String[] args){
		final int number =30;
		int[] arraySort = new int[number];

		// Feeding array
		int temp;
		for(int i=0; i<30; i++){
			temp = pickRandomNumber();
			while(!isUnique(temp, arraySort)){
				temp = pickRandomNumber();
			}
			arraySort[i] = temp;
		}

		//Print
		for(int i=0; i<30; i++){
			System.out.println(arraySort[i]);
		}
			
	}
}