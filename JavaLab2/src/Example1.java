
public class Example1 {

	public static void main(String[] args) {
		String bookIsbn = " IB2-6325-85-4-1";
		String booktitle = "Basic Java \r\n"+ "Programming";
		int bookUnit = 5;
		float bookPrice = 225.75f;
		
		//display to console
		System.out.println("Book ISBN : "+bookIsbn);
		System.out.println("Book tital : "+booktitle);
		System.out.println("Book Unit : "+bookUnit+"Books.");
		System.out.println("Book Price : "+bookPrice+"Baht.");
		System.out.println("--------------------------------");
		
		//calculate totalprice and vat
		double totalPrice = bookUnit * bookPrice;
		System.out.println("Total Price is "+totalPrice);
		double vat = totalPrice + (totalPrice *7/100);
		System.out.println("Add VAT 7% is"+vat);

	}

}
