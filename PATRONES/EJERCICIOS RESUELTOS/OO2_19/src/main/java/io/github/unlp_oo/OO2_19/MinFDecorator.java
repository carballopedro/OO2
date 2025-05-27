package io.github.unlp_oo.OO2_19;

public class MinFDecorator extends WeatherDecorator {

	public MinFDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double min = Math.round(this.getTemperatures().stream().mapToDouble(t -> t).min().orElse(0));
		return super.displayData() + "Min. F: " + min + "; ";
	}

}
