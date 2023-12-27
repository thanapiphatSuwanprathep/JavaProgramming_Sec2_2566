import java.text.DecimalFormat;
import java.util.*;
public class lab02 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.00");
		Scanner scan = new Scanner(System.in);
		double[] num = new double[5];
		double sum = 0,avg;
		
		for(int i =0;i<num.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			num[i] = scan.nextDouble();
			sum = sum + num[i];
	}
		avg = sum / num.length;
		System.out.println("Average of "+sum+" student is "+frm.format(avg));
		for(int i =0;i<num.length;i++) {
			if(num[i] > avg) {
				System.out.println("> Student "+(i+1)+"("+frm.format(num[i])+")");
			}
	}
		
	}
	

}
