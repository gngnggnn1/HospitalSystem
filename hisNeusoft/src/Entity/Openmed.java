package Entity;

public class Openmed {
	int presID;
	int medID;
	String medUsage;
	String medDosage;
	String medFrequency;
	int medAmount;
	
	public Openmed() {}
	
	public Openmed(int presID, int medID, String medUsage, String medDosage, String medFrequency, int medAmount) {
		this.presID = presID;
		this.medID = medID;
		this.medUsage = medUsage;
		this.medDosage = medDosage;
		this.medFrequency = medFrequency;
		this.medAmount = medAmount;
	}
	
	public int getPresID() {
		return presID;
	}

	public void setPresID(int presID) {
		this.presID = presID;
	}

	public int getMedID() {
		return medID;
	}

	public void setMedID(int medID) {
		this.medID = medID;
	}

	public String getMedUsage() {
		return medUsage;
	}

	public void setMedUsage(String medUsage) {
		this.medUsage = medUsage;
	}

	public String getMedDosage() {
		return medDosage;
	}

	public void setMedDosage(String medDosage) {
		this.medDosage = medDosage;
	}

	public String getMedFrequency() {
		return medFrequency;
	}

	public void setMedFrequency(String medFrequency) {
		this.medFrequency = medFrequency;
	}

	public int getMedAmount() {
		return medAmount;
	}

	public void setMedAmount(int medAmount) {
		this.medAmount = medAmount;
	}
}
