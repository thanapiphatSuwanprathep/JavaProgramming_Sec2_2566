import java.text.*;
public class sales extends Employee{
	private double sales;
	
	DecimalFormat frm = new DecimalFormat("#,###.00");
	public sales(String id,String name, double salary,double sales) {
		super(id,name,salary);
		this.sales = sales;
	}
	public sales(String id,String name) {
		super(id,name);
		this.sales = 0;
	}
	public double getCommission() {
		if(sales<10000) {
			return 0;
		}else if(sales<50000) {
			return(sales - 10000)* 0.10;
		}else {
			return(sales - 50000)* 0.15;
		}
	}
	public String toString() {
		return super.getName()+"("+super.getID()+")get commission"+frm.format(getCommission()+ "B.");
	}

}
