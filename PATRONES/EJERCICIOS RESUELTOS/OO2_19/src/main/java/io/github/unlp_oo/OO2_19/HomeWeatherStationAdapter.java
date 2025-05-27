package io.github.unlp_oo.OO2_19;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData{

	private HomeWeatherStation station;
	
	public HomeWeatherStationAdapter(HomeWeatherStation station) {
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
}
