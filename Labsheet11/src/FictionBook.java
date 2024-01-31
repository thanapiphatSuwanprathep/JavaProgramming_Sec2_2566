import java.time.Year;
public class FictionBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
		
		
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return author_name.substring(author_name.indexOf(" ")+1).toUpperCase();
		
	}
    public String getFirstName() {
    	return author_name.substring(0,author_name.indexOf(" ")).toUpperCase();
		
	}
	public boolean checkFormatname() {
		if(author_name.indexOf(" ")!=-1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean checkEmail() {
	if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
		return true;
	}else {
		return false;
	}
		
	}
	public int totalPublicYear() {
		return Year.now().getValue()-this.publicYear;
	}
	public String toString() {
		return getTitle()+ " write by "+ getLastName().substring(0,1)+","+getFirstName()+"("+email+")"+"\nPublishd for"+totalPublicYear()+"years";
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
