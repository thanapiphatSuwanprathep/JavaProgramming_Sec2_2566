import javax.swing.*;
public class Ex702_1 {

	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0.0;
	static boolean validItem = false;
	
	public static void main(String[] args) {
		inputItem();

	}
	public static void inputItem() {
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number order"));
		
		if(checkItem(itemOrder)) {
			System.out.print("Item"+itemOrder + " is "+itemPrice);
		}
		else {
			System.out.print("Invalid Item");
		}
				
	}//end of inputItem()
	public static boolean checkItem(int item) {
		for(int i=0;i<validValues.length;i++) {
			if(item==validValues[i]) {
				itemPrice = price[i];
				validItem = true;
			}
			
	}
		return validItem;
	}
}
