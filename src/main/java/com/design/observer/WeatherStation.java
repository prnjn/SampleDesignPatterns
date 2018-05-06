package com.design.observer;

import com.design.observer.observe.CurrentConditionDisplay;
import com.design.observer.observe.ForecastDisplay;
import com.design.observer.subject.WeatherData;

public class WeatherStation {
	
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDiaplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMesurements(9, 45, 14.5f);
		weatherData.setMesurements(12, 78, 15.5f);
		weatherData.setMesurements(37, 68, 16.1f);
	}
}
