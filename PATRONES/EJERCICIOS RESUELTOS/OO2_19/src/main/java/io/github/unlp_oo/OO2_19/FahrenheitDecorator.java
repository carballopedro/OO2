package io.github.unlp_oo.OO2_19;

public class FahrenheitDecorator extends WeatherDecorator {

	public FahrenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		return "Temperatura F: " + this.getTemperature() + "; ";
	}

}
