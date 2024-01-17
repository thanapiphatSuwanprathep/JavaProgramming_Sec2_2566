
public class Date {
	//private int year,moth,day

	private int year;
	private int month;
	private int day;
	
	Date(int year,int moth,int day){
		this.year = year;
		this.month = moth;
		this.day = day;
		
	}
	public int getyear() {
		return this.year;
	}
	public int getmonth() {
		return this.month;
	}
	public int getday() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		return String.format("%02d/%02d/%4d",month,day,year);
	}
	public void setDate(int year,int onth,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}
