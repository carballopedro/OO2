package io.github.unlp_oo.OO2_19;

import java.util.List;

public abstract class WeatherDecorator extends NewWeatherData {

	private WeatherData component;
	
	public WeatherDecorator(WeatherData component) {
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
}
