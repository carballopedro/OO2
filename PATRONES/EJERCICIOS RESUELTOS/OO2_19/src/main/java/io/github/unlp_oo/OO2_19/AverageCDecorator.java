package io.github.unlp_oo.OO2_19;

public class AverageCDecorator extends WeatherDecorator {

	public AverageCDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		double average = Math.round(this.getTemperatures().stream().mapToDouble(t -> ((t-32)/1.8)).average().orElse(0));
		return super.displayData() + "Average C: " + average + "; ";
	}
}
