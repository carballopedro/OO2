package io.github.unlp_oo.OO2_19;

import java.util.List;

public interface WeatherData {

	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperature();

	//retorna la presión atmosférica en hPa
	public double getPressure();

	//retorna la radiación solar
	public double getSolarRadiation();

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperatures();
	
	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData();
}
