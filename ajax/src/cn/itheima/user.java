package cn.itheima;

public class user {

	private String name;
	private String password;

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
