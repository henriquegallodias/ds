package model;

public class User {
	private String name;
	private String email;
	private String login;
	private String pass;
	
	public User() {
		this("","","","");
	}
	
	public User(String name,String email,String login,String pass) {
		this.email = email;
		this.login = login;
		this.name = name;
		this.pass = pass;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void provarExistencia() {
		System.out.println("Oi,eu existo!");
	}
	
	public static void main(String[] args) {
		User u = new User();
		u.provarExistencia();
	}

}
