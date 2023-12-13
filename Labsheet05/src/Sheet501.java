import java.util.*;
public class Sheet501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Full Name : ");
		String sentence = scan.nextLine();
		 if(sentence.indexOf(" ")== -1 ) {
			 System.out.print("Incorrect Name");
			 
		 }else {
			 String first = sentence.substring(0,sentence.indexOf(" "));
			 String last = sentence.substring(sentence.indexOf(" ")+1);
			 System.out.println("first Name : "+first.toUpperCase());
			 System.out.println("last Name : "+last.toLowerCase());

		 }
		 


	}

}
