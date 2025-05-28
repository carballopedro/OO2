package io.github.unlp_oo.OO2_19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {

	private NewHomeWeatherStation adapter;
		
	@BeforeEach
	void setUp() throws Exception {
		HomeWeatherStation homeStation = new HomeWeatherStation(86, 1008, 200);
		homeStation.setTemperature(80.6);
		homeStation.setTemperature(89.6);
		homeStation.setTemperature(86.0);
        this.adapter = new NewHomeWeatherStation(homeStation);
	}
	
	@Test
	void testDisplayData() {
		CelsiusDecorator temperatureC = new CelsiusDecorator(adapter);
	    PressureDecorator pressure= new PressureDecorator(temperatureC);
	    SolarRadiationDecorator solarRadiation = new SolarRadiationDecorator(pressure);
	    AverageCDecorator average = new AverageCDecorator(solarRadiation);
	    MinCDecorator min = new MinCDecorator(average);
	    MaxCDecorator max = new MaxCDecorator(min);

	    // voy probando de a poco
	    assertEquals("Temperature C: 30.0; ", temperatureC.displayData());
	    assertEquals("Temperature C: 30.0; Atmospheric Pressure: 1008.0; ", pressure.displayData());
	    assertEquals("Temperature C: 30.0; Atmospheric Pressure: 1008.0; Solar Radiation: 200.0; ", solarRadiation.displayData());
	    assertEquals("Temperature C: 30.0; Atmospheric Pressure: 1008.0; Solar Radiation: 200.0; Average C: 30.0; ", average.displayData());
	    assertEquals("Temperature C: 30.0; Atmospheric Pressure: 1008.0; Solar Radiation: 200.0; Average C: 30.0; Min. C: 27.0; ", min.displayData());
	    
	    // Ej 5: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;”
	    assertEquals("Temperature C: 30.0; Atmospheric Pressure: 1008.0; Solar Radiation: 200.0; Average C: 30.0; Min. C: 27.0; Max. C: 32.0; ", max.displayData());
	}
}
