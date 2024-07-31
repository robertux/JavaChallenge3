package com.davivienda.sv.challenge;

import java.util.Optional;

public class Program {

	public static void main(String[] args) {
		Optional<WeatherData> data = new WeatherClient(new ConfigManager().loadData()).getWeather();
		System.out.println("Weather data: " + data.orElse(null));
	}

}
