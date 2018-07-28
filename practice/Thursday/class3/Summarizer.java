//Hoang Le My Anh E1CS55
//Exercise 2
public class Summarizer{
	public static void main(String args[]){
		int sum = 0;
		int nonNumberArgs = 0;
		for(String num: args){
			try{
				sum =  sum + Integer.parseInt(num);
			}catch(NumberFormatException npe){
				nonNumberArgs ++;
			}
		}
		int numOfInteger = args.length -  nonNumberArgs;
		if(numOfInteger == 0){
			System.out.println("Non average");
		}else{
			System.out.println("Average of arguments: "+ sum/numOfInteger);
		}
		System.out.println("Non number arguments: "+ nonNumberArgs);
	}
}