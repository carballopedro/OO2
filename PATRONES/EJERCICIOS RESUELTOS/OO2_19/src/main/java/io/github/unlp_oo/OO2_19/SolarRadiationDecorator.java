package io.github.unlp_oo.OO2_19;

public class SolarRadiationDecorator extends WeatherDecorator {

	public SolarRadiationDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		return "Solar Radiation: " + this.getSolarRadiation() + "; ";
	}

}
