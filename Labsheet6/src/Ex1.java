import javax.swing.*;
public class Ex1 {

	public static void main(String[]args) {
		inputEmail();
	}
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail : ").toLowerCase();
		
		
		//inputEmail = inputEmail.toLowerCase
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		
	}//end main()
	public static boolean checkEmail(String email) {
		
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}//end checkEmail()
	public static void displayEmail(boolean chEmail,String inEmail) {
		if(chEmail==true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inEmail);
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail ");
		}
	}

}
