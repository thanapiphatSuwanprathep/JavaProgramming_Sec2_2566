import java.util.*;
public class sheet502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		int Space = 0;
		for (int i=0; i<sentence.length();i++) {
			if(sentence.charAt(i)==' '||sentence.charAt(i)=='.') {
				String come = sentence.substring(Space,i+1);
				System.out.println(come);
				Space = i+1;
			}
		}
	}

}
