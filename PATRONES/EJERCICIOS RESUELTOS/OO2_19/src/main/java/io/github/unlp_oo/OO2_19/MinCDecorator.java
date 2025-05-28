package io.github.unlp_oo.OO2_19;

public class MinCDecorator extends WeatherDecorator {

	public MinCDecorator(NewWeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		double min = Math.round((this.getMin()-32)/1.8);
		return "Min. C: " + min + "; ";
	}

}
