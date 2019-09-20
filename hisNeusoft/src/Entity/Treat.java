package Entity;

public class Treat {
	private int registID;
	private String actionInChief;
	private String presentSickHistory;
	private String presentSickTreatment;
	private String previousHistory;
	private String allergicHistory;
	private String physicalExam;
	private String advice;
	private String notice;
	private String sickResult;
	
	public Treat(int registID, String actionInChief, String presentSickHistory, String presentSickTreatment, 
	String previousHistory, String allergicHistory, String physicalExam, String advice ,String notice, String sickResult) 
	{
		this.registID = registID;
		this.actionInChief = actionInChief;
		this.presentSickHistory = presentSickHistory;
		this.presentSickTreatment = presentSickTreatment;
		this.previousHistory = previousHistory;
		this.allergicHistory = allergicHistory;
		this.physicalExam = physicalExam;
		this.physicalExam = physicalExam;
		this.advice = advice;
		this.notice = notice;
		this.sickResult = sickResult;
	}
	
	public Treat() {
		// TODO Auto-generated constructor stub
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public int getRegistID() {
		return registID;
	}
	public void setRegistID(int registID) {
		this.registID = registID;
	}
	public String getActionInChief() {
		return actionInChief;
	}
	public void setActionInChief(String actionInChief) {
		this.actionInChief = actionInChief;
	}
	public String getPresentSickHistory() {
		return presentSickHistory;
	}
	public void setPresentSickHistory(String presentSickHistory) {
		this.presentSickHistory = presentSickHistory;
	}
	public String getPresentSickTreatment() {
		return presentSickTreatment;
	}
	public void setPresentSickTreatment(String presentSickTreatment) {
		this.presentSickTreatment = presentSickTreatment;
	}
	public String getPreviousHistory() {
		return previousHistory;
	}
	public void setPreviousHistory(String previousHistory) {
		this.previousHistory = previousHistory;
	}
	public String getAllergicHistory() {
		return allergicHistory;
	}
	public void setAllergicHistory(String allergicHistory) {
		this.allergicHistory = allergicHistory;
	}
	public String getPhysicalExam() {
		return physicalExam;
	}
	public void setPhysicalExam(String physicalExam) {
		this.physicalExam = physicalExam;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getSickResult() {
		return sickResult;
	}
	public void setSickResult(String sickResult) {
		this.sickResult = sickResult;
	}
	
	
}
