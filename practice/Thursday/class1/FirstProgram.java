public class FirstProgram {

	// public static void printHello(){
	// 	System.out.println("Hello World by using printHello method!");
	// }
	public static void main(String[] args){
		//printHello();
		//args[0] - first command line parameter
		//args.length - number of the command line parameter
		// int firstArgAsInt = Integer.parseInt(args[0])

		// for(int i = 0; i < args.length; i++){
		// 	System.out.println(args[i]);
		// }
		// int firstArgAsInt = Integer.parseInt(args[0]);
		// if(firstArgAsInt == 7){
		// 	System.out.println("1st is 7");
		// }

		//Ex1
		System.out.println("Hello " + args[0] + "!");
		// HelloWorldPrinter.print();
		// HelloName.printName();

		//Ex2
		ex2(args[0]);

	}

	public static void ex2(String firstArg){
		int firstArgAsInt = Integer.parseInt(firstArg);
		for(int i = 1;  i<=200; i++){
			if(i%firstArgAsInt == 0){
				System.out.println("ex2: " + i);
			}
		}
	}
}

//zsoltparragi@casears