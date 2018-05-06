package com.design.observer.observe;

import com.design.observer.Observer;
import com.design.observer.Subject;

public class ForecastDisplay implements Observer , DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	// the constructor is passed the weatherData object (the subject)
	// and we use it to register the display as observer
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData; // making a local copy as we might want to unregister as observer later
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
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
