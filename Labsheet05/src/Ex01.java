import java.util.Scanner;

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		String text = " ";
		while(true) {
			System.out.print("Enter word: ");
			word = scan.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			text = text+word+" ";
		}
		System.out.print(text.toUpperCase());

	}

}
