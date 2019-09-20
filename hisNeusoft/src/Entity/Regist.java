package Entity;

public class Regist {
	private String name;
	private String sex;
	private int age;
	private String birthday;
	private int idNumber;
	private int deptID;
	private int userID;
	private String regisTime;//午别 
	private int needNotebook;
	
	public Regist(int idNumber, String name, String sex, String birthday, int age, String regisTime, int deptID, int userID, int needNotebook) {
		this.idNumber = idNumber;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.idNumber = idNumber;
		this.deptID = deptID;
		this.userID = userID;
		this.regisTime = regisTime;
		this.needNotebook = needNotebook;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRegisTime() {
		return regisTime;
	}

	public void setRegisTime(String regisTime) {
		this.regisTime = regisTime;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getNeedNotebook() {
		return needNotebook;
	}
	public void setNeedNotebook(int needNotebook) {
		this.needNotebook = needNotebook;
	}
	
}
