package io.github.unlp_oo.OO2_8;

public class FourGConnection {

	private String symb;
	
	public FourGConnection () {
		this.symb = "4G";
	}
	
	public String transmit(String data, long crc) {
		return "4G:" + data + "(CRC: " + crc + ")"; 
	}
	
	public String symb() {
		return this.symb;
	}
}

// reemplazo de adapter:
// tendria que implementar la interfaz y no necesito el adapter

//public String sendData(String data, int crc) {
//	return this.transmit(data, crc);
//}

//	public String pict() {
//	return this.symb();
// }