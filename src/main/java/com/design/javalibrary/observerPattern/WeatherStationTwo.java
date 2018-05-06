package com.design.javalibrary.observerPattern;

public class WeatherStationTwo {
	
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDiaplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		/**
		 * Notice the order of output as compared to own implementation of observer pattern
		 * Don't depend on a specific order of notification for your observers when using java.util
		 *  **/
		
		weatherData.setMesurements(9, 45, 14.5f);
		weatherData.setMesurements(12, 78, 15.5f);
		weatherData.setMesurements(37, 68, 16.1f);
	}
}
