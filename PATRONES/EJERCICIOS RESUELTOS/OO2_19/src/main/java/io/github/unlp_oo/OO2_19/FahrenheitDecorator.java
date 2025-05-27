package io.github.unlp_oo.OO2_19;

public class FahrenheitDecorator extends WeatherDecorator {

	public FahrenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura F: " + this.getTemperature() + "; ";
	}

}
