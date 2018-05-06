package com.design.javalibrary.observerPattern;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementChanged() {
		setChanged(); // first call setChanged to indicate the state has changed before calling notifyObservers
		notifyObservers();
		
		// if you want to push data to observers, you can pass the data as object to notifyObservers(args) 
		// method. If not, then the Observer has to "pull" the data it wants from Observable object passed
		// to it.
		/** notifyObservers(arg); **/
	}
	
	public void setMesurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
