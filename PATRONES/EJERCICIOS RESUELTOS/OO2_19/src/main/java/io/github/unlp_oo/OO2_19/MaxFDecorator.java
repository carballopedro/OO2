package io.github.unlp_oo.OO2_19;

public class MaxFDecorator extends WeatherDecorator {

	public MaxFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		double max = Math.round(this.getMax());
		return "Max. F: " + max + "; ";
	}

}
