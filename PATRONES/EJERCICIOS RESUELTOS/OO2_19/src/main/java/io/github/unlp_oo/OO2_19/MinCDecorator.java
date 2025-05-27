package io.github.unlp_oo.OO2_19;

public class MinCDecorator extends WeatherDecorator {

	public MinCDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double min = Math.round(this.getTemperatures().stream().mapToDouble(t -> ((t-32)/1.8)).min().orElse(0));
		return super.displayData() + "Min. C: " + min + "; ";
	}

}
