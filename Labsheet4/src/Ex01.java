import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber;
		
		System.out.print("Input number : ");
		previousNumber = scan.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previousNumber) {
				break;
				
			}
			previousNumber = currentNumber;
		}
		System.out.print("\nBye Bye ");
		/*if(currentNumber < previousNumber) {
			
			System.out.print("Bye Bye ");
		}*/


	}

}
