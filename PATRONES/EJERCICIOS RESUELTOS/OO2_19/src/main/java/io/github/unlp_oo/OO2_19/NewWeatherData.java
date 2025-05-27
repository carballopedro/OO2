package io.github.unlp_oo.OO2_19;

public abstract class NewWeatherData implements WeatherData {

	public double getAverage() {
		return this.getTemperatures().stream().mapToDouble(t -> t).average().orElse(0);
	}
	
	public double getMin() {
		return this.getTemperatures().stream().mapToDouble(t -> t).min().orElse(0);
	}
	
	public double getMax() {
		return this.getTemperatures().stream().mapToDouble(t -> t).max().orElse(0);
	}
}
