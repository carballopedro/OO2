package io.github.unlp_oo.OO2_10;

public class FeistelCipherAdapter implements Encryptor {

	private FeistelCipher feistelCipher;
	
	public FeistelCipherAdapter (String key) {
		this.feistelCipher = new FeistelCipher(key);
	}
	
	
	// encode sirve para ambos casos
	
	public String encrypt(String msg) {
		return this.feistelCipher.encode(msg);
	}
	public String decrypt(String msg) {
		return this.feistelCipher.encode(msg);
	}
}
