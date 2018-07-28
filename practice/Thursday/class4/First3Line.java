
import java.io.File;
import java.io.FileReader; 
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.PrintWriter;
// java.io.*

public class First3Line{
	public static void main(String args[]){
		File file = new File("ReadingAFile.java");
		File outputFile = new File("output.txt");
		
		try(FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			PrintWriter outputWriter = new PrintWriter(outputFile);
		){
			String line = br.readLine();
			while(line != null){
				outputWriter.println(line);
				line = br.readLine();
			}
			
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}catch(java.io.IOException e){
			System.out.println("Some i/o error occured");
		}
	}
}