package io.github.unlp_oo.OO2_10;

public class Messenger {

	private Encryptor encryptor;
		
	public void setEncryptor (Encryptor encryptor) {
		this.encryptor = encryptor;
	}
	
	public String send(String msg) {
		return this.encryptor.encrypt(msg);
	}
	
	public String recieve(String msg) {
		return this.encryptor.decrypt(msg);
	}
}
