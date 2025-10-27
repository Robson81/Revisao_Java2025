package entitites;

public class Rent {

	private String name;
	private String email;
	private int unit;
	
	public Rent(String name, String email, int unit) {

		this.name = name;
		this.email = email;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public String toString() {
		
		return	getUnit()
				+":  " 
				+getName()
				+", " 
				+getEmail();
	}

}
