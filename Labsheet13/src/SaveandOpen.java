import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert()throws IOException{
		Scanner scan = new Scanner(System.in);
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//employee.txt"));
		String answer;
		
		do {
			header();
			System.out.print("Enter name :  ");
			name = scan.next();
			System.out.print("Enter department : ");
			dept = scan.next();
			
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = scan.next().toLowerCase();

		}while(answer.equals("y"));
		writeFile.close();
	}
public void read() {
	try{
		//create object for read File
		Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
		boolean check = false;
		header();
		int i = 1,person = 0;
		while(readFile.hasNext()) {
			name = readFile.next();
			dept = readFile.next();
			if(dept.equalsIgnoreCase(super.getDept())) {
				System.out.println(i+") "+name);
				i++;
				person++;
				check = true;
			}
		}
		if(check == false) {
			System.out.println("\nSorry,no department : "+super.getDept()+"in File");
		}
		if(check == true) {
			header();
			System.out.println("\n Employee in dept "+super.getDept()+" is "+person+" person.");
		}
	}catch(IOException e) {
		System.out.println("\nSorry, file not found...");
	}
	
}
}