import java.io.*;
import java.util.*;
public class Addproduct {

	public static void main(String[] args)throws IOException {
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt"));
		//create object for ipt data from keybord
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product id : ");
		String productId = scan.next();
		System.out.print("Input product Name : ");
		String productName = scan.next();
		System.out.print("Input product Unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input product Price : ");
		float productPrice = scan.nextFloat();
		
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already...");
		writeFile.close();


	}

}
