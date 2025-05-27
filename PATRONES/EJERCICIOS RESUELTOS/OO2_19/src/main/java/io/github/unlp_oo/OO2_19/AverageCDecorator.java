package io.github.unlp_oo.OO2_19;

public class AverageCDecorator extends WeatherDecorator {

	public AverageCDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	// HOOK
	public String addExtraData() {
		double average = Math.round((this.getAverage()-32)/1.8);
		return "Average C: " + average + "; ";
	}
}
