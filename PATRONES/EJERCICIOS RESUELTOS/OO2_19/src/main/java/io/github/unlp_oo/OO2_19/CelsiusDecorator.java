package io.github.unlp_oo.OO2_19;

public class CelsiusDecorator extends WeatherDecorator {

	public CelsiusDecorator(NewWeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		return "Temperature C: " + ((this.getTemperature()-32)/1.8) + "; ";
	}
	
}
