package io.github.unlp_oo.OO2_19;

public class MaxCDecorator extends WeatherDecorator {

	public MaxCDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		double max = Math.round(this.getTemperatures().stream().mapToDouble(t -> ((t-32)/1.8)).max().orElse(0));
		return super.displayData() + "Max. C: " + max + "; ";
	}
}
