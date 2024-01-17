import java.util.Scanner;

public class BookDemo {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		System.out.print("Input Book title : ");
		String title = scan.nextLine();
		System.out.print("Input Book price : ");
		float price = scan.nextFloat();
		System.out.print("Input publish year : ");
		int year = scan.nextInt();
		
		book.setTitle(title);
		book.setPrice(price);
		book.setPublishyear(year);
        System.out.println(book.toString());
	}

}
