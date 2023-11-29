package System.out;
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variables
		int taxableIncome;
		double taxPayable;
		taxableIncome = 85000;
		
		//Compute tax payable using a nested-if 4 cases
		if(taxableIncome<=20000) { //[0,20000]
			taxPayable = 0;
		}
		else if(taxableIncome<=40000) { //[200001,400000]
			taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome<=60000) { //[400001,600000]
			taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		}
		else { //[600001]
			taxPayable = (20000*TAX_RATE_ABOVE_20K)+(200000*TAX_RATE_ABOVE_40K)+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		}
		//System.out.print("The income tax payable is "+ taxPayable);
		System.out.printf("The income tax payable is: %.2f", taxPayable);
		
	}

}
