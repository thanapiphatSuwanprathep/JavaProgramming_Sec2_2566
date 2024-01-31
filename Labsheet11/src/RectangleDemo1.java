import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));
		String colorInput = JOptionPane.showInputDialog("Input color:");
		
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		JOptionPane.showInternalMessageDialog(null, obj1.toString()+"\nArea of Rectangle is "+obj1.getArea());*/
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showInternalMessageDialog(null, obj2.toString()+"\nArea of Rectangle2 is "+obj2.getArea());

	}

}
