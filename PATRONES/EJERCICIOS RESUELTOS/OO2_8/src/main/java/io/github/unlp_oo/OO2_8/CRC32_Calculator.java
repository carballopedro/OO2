package io.github.unlp_oo.OO2_8;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return (int)result;
	}
}
