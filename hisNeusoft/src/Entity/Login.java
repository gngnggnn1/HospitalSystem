package Entity;

public class Login {
	private String uName;
	private String pass;

	public Login() {}
	
	public Login(String uName, String pass) {
		this.uName = uName;
		this.pass = pass;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
