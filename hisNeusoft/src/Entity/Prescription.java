package Entity;

public class Prescription {
	private int registID;
	private String presName;
	
	public Prescription() {}
	
	public Prescription(int registID, String presName) {
		this.registID = registID;
		this.presName = presName;
	}
	
	public int getRegistID() {
		return registID;
	}
	public void setRegistID(int registID) {
		this.registID = registID;
	}
	public String getPresName() {
		return presName;
	}
	public void setPresName(String presName) {
		this.presName = presName;
	}
}
