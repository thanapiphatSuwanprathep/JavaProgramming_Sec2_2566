import javax.swing.*;
public class Exemple03 {

	public static void main(String[] args) {
		//input and convert weight from user
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		
		height = height/100;
		double bmi = weight/(height*height);
		
		String bmiCategory;
		if(bmi<18.5) bmiCategory="Underweight";
		else if(bmi<25) bmiCategory="Normal-weight";
		else if(bmi<30) bmiCategory="Overweight";
		else bmiCategory = "Obesity";
		//displays BMI value to shoMessang dialog box
		JOptionPane.showMessageDialog(null,"BMI = "+ String.format("%.1f",bmi) +"\nYou're "+bmiCategory);
		
	}

}
