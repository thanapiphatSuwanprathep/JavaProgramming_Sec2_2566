import javax.swing.*;
import java.util.*;
public class Big {

	public static void main(String[] args) {
		// using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		
		//JOptionPane.showMessageDialog(null, "You balance:"+balance);
		int money = Integer.parseInt(JOptionPane.showInputDialog( "You balance:"+balance+"\nInput money to withdraw : "));
		
		
		if(money > balance ) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more that balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money > 20000) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more that 20000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money%100 !=0) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw "+money%100+"Baht","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int number = money/1000;
			int number2 = money%1000/500;
			int number3 = money%1000%500/100;
			JOptionPane.showMessageDialog(null, "You withdraw "+money+"Baht.\n"
					+"1000 = "+number+"\n500 = "+number2+"\n100 = "+number3);
		}


	}

}
