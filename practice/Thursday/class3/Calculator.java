//Hoang Le My Anh E1CS55
//Exercise 3

public class Calculator{

	public static void main(String args[]){
		try{
			int resultValue = Integer.parseInt(args[0]);
			for(int i = 1; i< args.length; i = i+2){
				resultValue = calculate(resultValue, args[i], Integer.parseInt(args[i+1]));
			}
			System.out.println("Result: " + resultValue);
		}catch(Exception e){
				System.out.println("Bad arguments");
		}
		
	}
	
	static int calculate(int firstNumber, String operation, int secondNumber){
		int result = 0;
		switch (operation){
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				result = firstNumber / secondNumber;
				break;
			default:
				break;
		}
		return result;
	}
}