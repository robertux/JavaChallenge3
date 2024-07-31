package com.davivienda.sv.challenge;

import java.util.Optional;
import java.util.Properties;

public class ConfigManager {
	public static final String CONFIG_FILE_NAME = "config.properties";
	
	public Optional<ConfigData> loadData() {
		Properties props = new Properties();
		try {
			props.load(this.getClass().getResourceAsStream(CONFIG_FILE_NAME));
			ConfigData data = new ConfigData(props.getProperty("url"), props.getProperty("apiKey"), props.getProperty("latitude"), props.getProperty("longitude"));
			return Optional.of(data);
		} catch (Exception e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		}
		//TODO: implementar
		return Optional.empty();
	}
}
