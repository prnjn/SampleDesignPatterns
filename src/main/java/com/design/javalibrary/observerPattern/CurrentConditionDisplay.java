package com.design.javalibrary.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
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
		 System.out.println("*** Current Conditions *** ");
		 System.out.println("    temperature :"+temperature);
		 System.out.println("    humidity : "+humidity);
	}
}
