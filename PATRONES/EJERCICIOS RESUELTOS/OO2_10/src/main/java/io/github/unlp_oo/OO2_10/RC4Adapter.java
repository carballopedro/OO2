package io.github.unlp_oo.OO2_10;

public class RC4Adapter implements Encryptor {

	private RC4 rc4;
	private String key;
	
	public RC4Adapter (String key) {
		this.rc4 = new RC4();
		this.key = key;
	}
	
	public String encrypt(String msg) {
		return this.rc4.encriptar(msg, this.key);
	}
	public String decrypt(String msg) {
		return this.rc4.desencriptar(msg, this.key);
	}
}
