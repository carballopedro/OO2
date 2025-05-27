package io.github.unlp_oo.OO2_19;

public class PressureDecorator extends WeatherDecorator {

	public PressureDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + "Atmospheric Pressure: " + this.getPressure() + "; ";
	}

}
