import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		//use Scanner Class read ata from file
		Scanner readFile = new Scanner(new File("d://txtFile//Memberlogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();
			String lname = readFile.next();
			String id = readFile.next();
			String email = readFile.next().toUpperCase();
			
			System.out.println(fname+" "+"("+email+")");
			
			
			
		}
		readFile.close();

	}

}
