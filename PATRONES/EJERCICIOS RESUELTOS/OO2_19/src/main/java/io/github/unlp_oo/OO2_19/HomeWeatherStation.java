package io.github.unlp_oo.OO2_19;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
	
	
	// CONSULTAR: puedo no tener var de temperatura y cuando me pide la temp retornar la ultima de la lista temperaturas?
	private double pressure;
	private double solarRadiation;
	private List<Double> temperatures;
	
	public HomeWeatherStation(double temperature, double pressure, double solarRadiation) {
		this.pressure = pressure;
		this.solarRadiation = solarRadiation;
		this.temperatures = new ArrayList<Double>();
		this.addTemperature(temperature);
	}
	
	// SETTERS
	
	public void setTemperature(double temperature) {
		this.addTemperature(temperature);
	}
	
	private void addTemperature(double temperature) {
		this.temperatures.add(temperature);
	}
	
	// GETTERS

	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperature() {
		return this.temperatures.getLast();
	}

	//retorna la presión atmosférica en hPa
	public double getPressure() {
		return this.pressure;
	}

	//retorna la radiación solar
	public double getSolarRadiation() {
		return this.solarRadiation;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperatures(){
		return this.temperatures;
	}
	
	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
		return "Temperatura F: " + this.getTemperature() +
				"Presión atmosf: " + this.getPressure() +
				"Radiación solar: " + this.getSolarRadiation();
	}

}
