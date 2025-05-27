package io.github.unlp_oo.OO2_19;

public class CelsiusDecorator extends WeatherDecorator {

	public CelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + "Temperature C: " + ((this.getTemperature()-32)/1.8) + "; ";
	}
	
}
