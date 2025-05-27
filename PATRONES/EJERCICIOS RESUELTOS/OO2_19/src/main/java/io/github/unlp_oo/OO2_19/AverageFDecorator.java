package io.github.unlp_oo.OO2_19;

public class AverageFDecorator extends WeatherDecorator {

	public AverageFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// HOOK
	public String addExtraData() {
		double average = Math.round(this.getAverage());
		return "Average F: " + average + "; ";
	}

}
