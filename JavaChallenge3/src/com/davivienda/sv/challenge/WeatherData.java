package com.davivienda.sv.challenge;

public class WeatherData {
	private double currentTemp;
	private double maxTemp;
	private double minTemp;
	
	public WeatherData() {
		
	}
	
	public WeatherData(double currentTemp, double maxTemp, double minTemp) {
		this.currentTemp = currentTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}
	
	public double getCurrentTemp() {
		return currentTemp;
	}
	public void setCurrentTemp(double currentTemp) {
		this.currentTemp = currentTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	@Override
	public String toString() {
		return "WeatherData [currentTemp=" + currentTemp + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + "]";
	}
}
