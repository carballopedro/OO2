package io.github.unlp_oo.OO2_19;

public class AverageFDecorator extends WeatherDecorator {

	public AverageFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double average = Math.round(this.getTemperatures().stream().mapToDouble(t -> t).average().orElse(0));
		return super.displayData() + "Average F: " + average + "; ";
	}

}
