package io.github.unlp_oo.OO2_19;

public class TemperaturesDecorator extends WeatherDecorator {

	public TemperaturesDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	// HOOK
	public String addExtraData() {
		return "Temperatures: " + this.getTemperatures().toString() + "; ";
	}
}
