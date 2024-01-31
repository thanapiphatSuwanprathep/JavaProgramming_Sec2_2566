import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("BookName");
		String name = scan.nextLine();
		System.out.print("Year");
		int  year = scan.nextInt(); 
		System.out.print("");
		FictionBook book = new FictionBook(name,year);
		scan.nextLine();
		System.out.print("autor name");
		String authorname = scan.nextLine();
		System.out.print("autor email");
		String email = scan.nextLine(); 
		
		book.setAuthorName(authorname);
		
		book.setEmail(email);
		while(book.checkFormatname()== false) {
			System.out.print("autor name");
			authorname = scan.nextLine();
			book.setAuthorName(authorname);
		}
		while(book.checkEmail()== false) {
			System.out.print("autor email");
			email = scan.nextLine(); 
			book.setEmail(email);
		}
		System.out.print(book);
		

	}

}
