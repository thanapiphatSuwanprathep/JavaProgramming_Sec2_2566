
public class Author {
	private  String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Author(String name,String email){
		this.name = name;
		this.email = email;
		this.gender = ' ';
	}
	Author(){
		this.name = "";
		this.email = "";
		this.gender = ' ';
	}
	public String getName() {
		return this.name ;
	}
	public String getEmail() {
		return this.email ;
	}
	public String getGenderName() {
		if(gender == 'm'||gender =='M') {
			return "Male";
		}else if(gender == 'f'||gender =='F'){
			return "Female";
		}else {
			return "Null";
		}
			
	}
	public String toString() {
		return "Author name : "+ name +" ("+email+";"+ getGenderName()+")";
	}


}
