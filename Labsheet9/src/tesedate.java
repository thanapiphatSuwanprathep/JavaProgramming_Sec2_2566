
public class tesedate {

	public static void main(String[] args) {
		//Test constructor to String
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
		
		d1.setYear(2024);
		d1.setMonth(12);
		d1.setDay(21);
		System.out.println(d1);
		System.out.println("Year is: "+d1.getyear());
		System.out.println("Month is: "+d1.getmonth());
		System.out.println("day is: "+d1.getday());
		
		d1.setDate(2024,1,2);
		System.out.println("The date of object : "+d1);

	}

}
