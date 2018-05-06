package com.design.javalibrary.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer , DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	// Observable is passed from Observable using which we can pull data we want
	@Override
	public void update(Observable obs, Object arg) {
		// in update we first make sure observable is of type WeatherData
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		 System.out.println("** Forecast ** ");
		 if(temperature<10) {
			 System.out.println("Get Ready for very cold weather");
		 }else if (humidity > 75) {
			System.out.println("Excpect to have a rain shower outside");
		 }else if(temperature>30) {
			 System.out.println("Will be a Hot day out");
		 }else if(temperature > 32 && humidity > 65) {
			 System.out.println("Get ready to be screwed by very hot and humid climate");
		 }
		 System.out.println("--------------------------------------------------");
		 
	}
}
