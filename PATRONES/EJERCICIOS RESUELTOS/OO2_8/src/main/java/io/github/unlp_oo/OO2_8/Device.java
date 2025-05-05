package io.github.unlp_oo.OO2_8;

public class Device {

	private Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;
	
	public Device(Calculator crcCalculator, Connection connection, Ringer ringer, Display display) {
		this.crcCalculator = crcCalculator;
		this.connection = connection;
		this.ringer = ringer;
		this.display = display;
	}
	
	public String send(String data) {
		int aux = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, aux);
	}
	
	// vendria a ser mi setStrategy pero de conexion
	public String changeConnection(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
		return "Connection has changed";
	}
	
	// setStrategy de calculator
	public String setStrategy(Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
		return "Calculator has changed";
	}
}

// Calculator (strategy)
// CRC16_Calculator (concreteStrategy)
// CRC32_Calculator (concreteStrategy)

// Connection (strategy)
// WifiConnection (concreteStrategy)
// FourGConnectionAdapter (concreteStrategy) (Adapter)
// FourGConnectionA (Adaptee)
