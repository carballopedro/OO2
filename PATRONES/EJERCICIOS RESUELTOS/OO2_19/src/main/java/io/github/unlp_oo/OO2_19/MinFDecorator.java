package io.github.unlp_oo.OO2_19;

public class MinFDecorator extends WeatherDecorator {

	public MinFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		double min = Math.round(this.getMin());
		return "Min. F: " + min + "; ";
	}

}
