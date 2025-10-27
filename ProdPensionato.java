package entitites;

public class ProdPensionato {

	private String name;
	private String email;
	private int room;

	public ProdPensionato(String name, String email, int room) {

		this.name = name;
		this.email = email;
		this.room = room;

	}
	public ProdPensionato(String name, String email) {

		this.name = name;
		this.email = email;

	}
	public String getName() {

		return this.name;
		
	}
	
	public void  setName(String name) {
		
		this.name = name;
	}
	public String getEmail() {
		
		return this.email;
		
	}
	
	public void  setEamil(String email) {
		
		this.email = email;
	}
	public int getRoom() {
		
		return this.room;
		
	}
	
	public void  setRoom(int room) {
		
		this.room = room;
	}
	
	public String toString() {
		
		return room + ": " + name + ", " + email;
		
	}

}
