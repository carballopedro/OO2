package io.github.unlp_oo.OO2_19;

public class MaxFDecorator extends WeatherDecorator {

	public MaxFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double max = Math.round(this.getTemperatures().stream().mapToDouble(t -> t).max().orElse(0));
		return super.displayData() + "Max. F: " + max + "; ";
	}

}
