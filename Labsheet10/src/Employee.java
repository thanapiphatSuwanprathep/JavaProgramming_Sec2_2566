
public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee(String id,String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public Employee(String id,String namr) {
		this.id = id;
		this.name = name;
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

}
