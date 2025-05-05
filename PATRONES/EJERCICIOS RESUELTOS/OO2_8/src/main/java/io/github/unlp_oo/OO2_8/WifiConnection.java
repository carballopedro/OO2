package io.github.unlp_oo.OO2_8;

public class WifiConnection implements Connection {

	private String pict;
	
	public WifiConnection() {
		this.pict = "Wifi";
	}
	
	public String sendData(String data, int crc) {
		return "Wifi:" + data + "(CRC: " + crc + ")";
	}
	
	public String pict() {
		return this.pict;
	}

}
