package com.design.observer.observe;

import com.design.observer.Observer;
import com.design.observer.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	// the constructor is passed the weatherData object (the subject)
	// and we use it to register the display as observer
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData; // making a local copy as we might want to unregister as observer later.
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
		 System.out.println("** Current Conditions ** ");
		 System.out.println("    temperature :"+temperature);
		 System.out.println("    pressure : "+pressure);
		 System.out.println("    humidity : "+humidity);
	}
}
