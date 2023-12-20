import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		System.out.print("Please enter your name,separated by a space. \n : ");
		Scanner scan =new Scanner(System.in);
		String fullname = scan.nextLine();
		String firstname = fullname.substring(0,fullname.indexOf(" "));
		String abbname = abbreviatName(fullname);
		int space = fullname.indexOf(' ');
		String nam = fullname.substring(0,space);
		
	System.out.println(abbreviatName(fullname)+nam);
	

	}
	public static String abbreviatName(String fullname) {
		String name = "";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				name = name + fullname.charAt(i+1)+".";
			}
		}return name;
	}
	
	

}
