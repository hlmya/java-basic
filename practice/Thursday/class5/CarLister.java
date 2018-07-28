import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;

public class CarLister{
	public static void main(String args[]){
		File file = new File("cars.csv");
		//FileReader fr = null;
		int[] colorCount = new int[CarColor.values().length];
		
		try(FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr)
			){
				//fr = new FileReader(file);
				
				String line = reader.readLine();
				while(line!= null){
					//System.out.println(line);
					String parts[] = line.split(";");
					if(parts.length != 3){
						System.out.println("Error element in line: " + line);
					}else{
						//ok
						String colorAsString = parts[2];
						CarColor color = CarColor.valueOf(colorAsString);
						colorCount[color.ordinal()]++;
					}
					line = reader.readLine();
				}
				
				
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}catch(IOException e){
			System.out.println("IO error");
		}
		/*finally{ //dont need tp use
			if(fr != null) {
				fr.close();
			}
		}*/
		
		for(CarColor color: CarColor.values()){
			System.out.println(color + ":" + colorCount[color.ordinal()]);
		}
		
	}
}