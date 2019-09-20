package Entity;

public class Pay {
	int presID;
	int operatorID;
	
	public Pay() {}
	
	public Pay(int presID, int operatorID) {
		this.presID = presID;
		this.operatorID = operatorID;
	}

	public int getPresID() {
		return presID;
	}

	public void setPresID(int presID) {
		this.presID = presID;
	}

	public int getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(int operatorID) {
		this.operatorID = operatorID;
	}
}
