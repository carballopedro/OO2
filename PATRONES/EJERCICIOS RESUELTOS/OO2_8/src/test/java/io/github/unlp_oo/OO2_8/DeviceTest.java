package io.github.unlp_oo.OO2_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeviceTest {

	private Device device;
	private Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;

	
	@BeforeEach
	void setUp() {
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConnection();
		this.ringer = new Ringer();
		this.display = new Display();
		this.device = new Device(this.crcCalculator, this.connection, this.ringer, this.display);

	}
	
	@Test
	void testSendCRC16Wifi() {
		assertEquals("Wifi:Test(CRC: 10376)", this.device.send("Test"));
	}
	
	@Test
	void testSendCRC32Wifi() {
		this.device.setStrategy(new CRC32_Calculator());
		assertEquals("Wifi:Test(CRC: -1741497163)", this.device.send("Test"));
	}
	
	@Test
	void testSendCRC164G() {
		this.device.changeConnection(new FourGConnectionAdapter(new FourGConnection()));
		assertEquals("4G:Test(CRC: 10376)", this.device.send("Test"));
	}
	
	@Test
	void testSendCRC324G() {
		this.device.changeConnection(new FourGConnectionAdapter(new FourGConnection()));
		this.device.setStrategy(new CRC32_Calculator());
		assertEquals("4G:Test(CRC: -1741497163)", this.device.send("Test"));
	}
	
	@Test
	void testChangeConnection() {
		assertEquals("Connection has changed", this.device.changeConnection(new FourGConnectionAdapter(new FourGConnection())));
		assertEquals("Connection has changed", this.device.changeConnection(new WifiConnection()));
	}
	
	@Test
	void testSetStrategy() {
		assertEquals("Calculator has changed", this.device.setStrategy(new CRC32_Calculator()));
		assertEquals("Calculator has changed", this.device.setStrategy(new CRC16_Calculator()));
	}
}
