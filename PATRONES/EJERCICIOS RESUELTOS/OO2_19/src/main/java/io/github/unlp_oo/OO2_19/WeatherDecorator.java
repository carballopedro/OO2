package io.github.unlp_oo.OO2_19;

import java.util.List;

public abstract class WeatherDecorator implements NewWeatherData {

	private NewWeatherData component;
	
	public WeatherDecorator(NewWeatherData component) {
		this.component = component;
	}
	
	public double getTemperature() {
		return this.component.getTemperature();
	}

	public double getPressure() {
		return this.component.getPressure();
	}

	public double getSolarRadiation() {
		return this.component.getSolarRadiation();
	}

	public List<Double> getTemperatures(){
		return this.component.getTemperatures();
	}
	
	// TEMPLATE
	public String displayData() {
		return this.component.displayData() + this.addExtraData();
	}
	
	// HOOK
	public abstract String addExtraData();
	
	public double getAverage() {
		return this.component.getAverage();
	}
	
	public double getMin() {
		return this.component.getMin();
	}
	
	public double getMax() {
		return this.component.getMax();
	}
}
