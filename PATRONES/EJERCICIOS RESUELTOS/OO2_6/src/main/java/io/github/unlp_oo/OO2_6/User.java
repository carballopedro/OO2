package io.github.unlp_oo.OO2_6;

public class User {

	private String name;
	private String surname;
	private String email;
	
	public User (String name, String surname, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
