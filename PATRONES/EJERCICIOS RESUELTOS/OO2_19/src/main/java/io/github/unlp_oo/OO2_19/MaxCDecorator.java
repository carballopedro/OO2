package io.github.unlp_oo.OO2_19;

public class MaxCDecorator extends WeatherDecorator {

	public MaxCDecorator(NewWeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	// HOOK
	public String addExtraData() {
		double max = Math.round((this.getMax()-32)/1.8);
		return "Max. C: " + max + "; ";
	}
}
