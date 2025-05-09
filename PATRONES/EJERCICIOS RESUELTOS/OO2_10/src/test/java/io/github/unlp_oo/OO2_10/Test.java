package io.github.unlp_oo.OO2_10;

public class Test {

	public void test(String[] args) {
		
		// create FeistelCipherAdapter
		FeistelCipherAdapter f = new FeistelCipherAdapter("key");
		
		// create Messenger
		Messenger m = new Messenger();
		// set FeistelCipherAdapter as Encyrptor
		m.setEncryptor(f);
		
		// send message
		m.send("message");
		
		// create RC4Adapter
		RC4Adapter r = new RC4Adapter("key");
		
		// set RC4Adapter as Encryptor
		m.setEncryptor(r);
		
		// send message
		m.send("message");
		
	}
}
