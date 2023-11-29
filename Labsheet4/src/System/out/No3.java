package System.out;
import java.util.*;
public class No3 {

	public static void main(String[] args) {
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 Scanner scan = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("Enter sales in dollars (or -1 to end) : ");
			 sales = scan.nextInt();
			 if(sales == SENTINEL) {
				 System.out.print("Bye Bye...");
				 break;
			 }
			 salary = 1000 + sales*COMMISSION_RATE;
			 System.out.printf("Salary is : $%.2f\n",salary);
			 
		 }
	}

}
