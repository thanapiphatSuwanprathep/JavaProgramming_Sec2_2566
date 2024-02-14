import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data?: ");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert"))&& !(choice.equals("read"))) {
			System.out.print("Pleas type Insert or Read data,again : ");
			choice = scan.next().toLowerCase();
		}
		//create object
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert();//call insert method from lass saveandOpen
		}else if(choice.equals("read")) {
			System.out.print("\nEnter deparment : ");
			department = scan.next();
			obj.setDept(department);//sent department to setdept() method from class Employee
			obj.read(); //call read() method from class SaveandOpen
			
		}
		
	}

}
