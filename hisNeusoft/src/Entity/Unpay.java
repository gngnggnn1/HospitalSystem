package Entity;

public class Unpay {
	private int presID;
	private int billNumber;
	
	public int getPresID() {
		return presID;
	}
	public void setPresID(int presID) {
		this.presID = presID;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public Unpay(int presID, int billNumber) {
		super();
		this.presID = presID;
		this.billNumber = billNumber;
	}
	public Unpay() {
		super();
	}
	
	
}
