package io.github.unlp_oo.OO2_8;

public class FourGConnectionAdapter implements Connection {

	private FourGConnection fourG;
	
	public FourGConnectionAdapter(FourGConnection fourG) {
		this.fourG = fourG;
	}
	
	public String sendData(String data, int crc) {
		return this.fourG.transmit(data, crc);
	}
	
	public String pict() {
		return this.fourG.symb();
	} 
}
