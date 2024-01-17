import java.util.*;
public class AuthorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Author name : ");
		String name = scan.nextLine();
		
		System.out.print("Input Author email : ");
		String email = scan.next();
		
		System.out.print("Input Author gender : ");
		char gender = scan.next().charAt(0);
		
		Author total = new Author(name,email,gender);
		
		System.out.println();
		System.out.println(total);
		

	}

}
