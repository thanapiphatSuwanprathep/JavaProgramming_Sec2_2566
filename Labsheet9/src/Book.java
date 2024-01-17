import java.time.Year;
public class Book {
	private  String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
    public void setPrice(float price) {
		this.price = price;
	}
    public float getPrice() {
		return this.price;
    }
    public void setPublishyear(int year) {
		this.publishyear = year ;
	}
    public float getpublishYear() {
		return this.publishyear;
    }
    public int getTotalYear(){
    	return Year.now().getValue()-this.publishyear;
    }
    public String toString(){
    	return "Title: "+this.title+ " published for "+getTotalYear()+ "year" +"("+this.price +"baht).";

    }
}
