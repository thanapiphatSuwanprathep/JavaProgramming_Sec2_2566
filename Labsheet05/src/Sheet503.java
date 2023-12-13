import java.util.*;
public class Sheet503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		int space = Message.trim().indexOf(" ");
		if(Message.indexOf("nichi")>=0)  {
			System.out.print("Nichi is a sentence");
			
			
		}
		else {
			System.out.print(Message);
			
			
		}

	}

}
