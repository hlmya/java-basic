//Hoang Le My Anh E1CS55
//Exercise 1
public class Reverser{
	
	static String[] reverse(String args[]){ //have to have "static" because error non-static
		String value[] = new String[args.length];
		for(int i = 0; i<args.length; i++){
			value[args.length - i - 1] = args[i];
		}
		return value;
	}
	
	static String printArray(String arr[]){
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		/*for(String s: arr){
			builder.append(s);
			builder.append(",");
		}*/
		for(int i = 0; i< arr.length; i++){
			builder.append(arr[i]);
			if(i!= arr.length - 1){
				builder.append(", ");
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String args[]){
		String reversedArgs[] = reverse(args);
		String str = printArray(reversedArgs);
		System.out.println(str);
	}

}