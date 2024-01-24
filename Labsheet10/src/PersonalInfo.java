
public class PersonalInfo {
	private Person name;
	private date bDay;
	
	private int personID;
	
	PersonalInfo(){
		name = new Person();//fristName = "",lastName =" ";
		bDay = new date();
		personID = 0;
	}
	//Constructor with parameter
	PersonalInfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last);
		bDay = new date (month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first,last);
		bDay.setDate(month,day,year);
		personID = ID;
		
	}
	public String toString() {
		return"Name: "+name.toString() +"\n"+"Date of birth: "+bDay.toString()+"\n"+"Personal ID" +personID;
	}

}
