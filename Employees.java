package entitites;

public class Employees {

	private String name;
	private Double salary;
	private Integer id;

	public Employees(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public Employees(int id) {
		
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Integer getId() {
		return id;
	}

	public double increaseSalary(double percentage) {

		return salary = salary * (1 + (percentage / 100));
	}
	
	public String toString() {
		
		return id + ", " + name + ", " + String.format("%.2f", salary); 
	}

}
