import java.io.*;
import java.util.*;
public class lab1205 {

	public static void main(String[] args)throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tstatus");
		System.out.println("*******************************************************************************************");
		int i = 1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			double grade = Double.parseDouble(readFile.next());
			readFile.next();
			System.out.println (i+".\t"+id+"\t"+Level(id)+"\t"+fname.charAt(0)+"."+lname+"\t"+grade+"\t"+Status(grade));i++;
		}
		

	}
	public static String Level(String id) {
		if(id.substring(0,2).equals("19")) {
			return "3th";
			
		}else {
			return "4th";
		}
			
	}
	public static String Status(double grade) {
		if(grade>=2) {
			return "Pass";
		}else if(grade>1&&grade<2) {
			return "Critical";
		}else {
			return "Retired";
		}
	}

}
