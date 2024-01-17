
public class Circle {
	
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	//The private 2 attributes
	private double radius;
	private String color;
	
	//Constructs a Circle with default radius and color
	//1st(default)
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	//return the radius-the public getter for private attributte radius
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getcolor() {
		return this.color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String toString() {
		return"Circle[radius = "+radius+",color = "+color+"]";
	}
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
		//return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
	

}
