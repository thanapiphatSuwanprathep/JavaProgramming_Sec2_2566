import java.util.*;
public class Ex503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
			
		}
		int countSpace=0;
		for(int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				countSpace+=1;
			}
		}
		System.out.println();
		System.out.println("This sentence has "+countSpace+" space");
		System.out.println("This sentence has "+(countSpace+1)+" word.");

	}

}
