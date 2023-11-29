import java.text.DecimalFormat;
import java.util.Scanner;
public class LabSheet2Exemple {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
	      Scanner console = new Scanner (System.in);
	      System.out.print("Input Product Name : ");
	      String productname = console.nextLine();
	      System.out.print("Input Product Unit : ");
	      int productunit = console.nextInt();
	      System.out.print("Input Product per unit : ");
	      Float productper = console.nextFloat();
	      float price = productunit*productper;
	      System.out.println("--------------------------------------------------");
	      System.out.println("Total Price is "+frm.format(price)+"Baht.");
	      System.out.println("--------------------------------------------------");
	      System.out.print("How many discount (%) : ");
	      int discount = console.nextInt();
	      float discountfore = (price*15/100);
	      System.out.println("--------------------------------------------------");
	      System.out.println("Discount froe "+(discount)+ "%\t" +frm.format (discountfore) +"Baht.");  
	      float paid = price-discountfore;
	      System.out.println("Amount to be paid\t "+frm.format(paid)+"Baht.");
	}

}
