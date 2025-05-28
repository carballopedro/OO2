package io.github.unlp_oo.OO2_19;

import java.util.List;

public class NewHomeWeatherStation implements NewWeatherData {

	private HomeWeatherStation station;
	
	public NewHomeWeatherStation(HomeWeatherStation station) {
		this.station = station;
	}
	
	public HomeWeatherStation getStation() {
		return this.station;
	}
	
	public double getTemperature() {
		return this.station.getTemperature();
	}

	public double getPressure() {
		return this.station.getPressure();
	}

	public double getSolarRadiation() {
		return this.station.getSolarRadiation();
	}

	public List<Double> getTemperatures(){
		return this.station.getTemperatures();
	}
	
	public String displayData(){
		return "";
	}
	
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
