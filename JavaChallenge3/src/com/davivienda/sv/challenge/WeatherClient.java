package com.davivienda.sv.challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class WeatherClient {
	private Optional<ConfigData> config;
	
	public WeatherClient(Optional<ConfigData> config) {
		this.config = config;
	}
	
	public Optional<WeatherData> getWeather() {
		if (!this.config.isPresent()) {
			System.out.println("No config data");
			return Optional.empty();
		}
		
		Optional<WeatherData> data = Optional.empty();
		try {
			String urlString = this.config.get().getUrl().replace("{latitude}", this.config.get().getLatitude())
					.replace("{longitude}", this.config.get().getLongitude())
					.replace("{apiKey}", this.config.get().getApiKey());
			
			System.out.println("Connect to URL " + urlString);
			String xmlResult = "";
			
			//TODO: Implementar conexion HTTP (Ej. https://www.baeldung.com/java-http-request)
			
			System.out.println("xmlResult: " + xmlResult);
			
			//TODO: Parsear XML de respuesta para sacar los atributos value, min y max del nodo <temperature> (Ej. https://www.baeldung.com/java-xerces-dom-parsing)
			//Ejemplo XML respuesta: <?xml version="1.0" encoding="UTF-8"?><current><city id="3585968" name="El Salvador"><coord lon="-88.9167" lat="13.8333"></coord><country>SV</country><timezone>-21600</timezone><sun rise="2024-07-30T11:39:38" set="2024-07-31T00:24:20"></sun></city><temperature value="23.36" min="22.22" max="23.36" unit="celsius"></temperature><feels_like value="24.28" unit="celsius"></feels_like><humidity value="97" unit="%"></humidity><pressure value="1013" unit="hPa"></pressure><wind><speed value="1.44" unit="m/s" name="Calm"></speed><gusts value="1.06"></gusts><direction value="305" code="NW" name="Northwest"></direction></wind><clouds value="100" name="overcast clouds"></clouds><visibility value="10000"></visibility><precipitation mode="no"></precipitation><weather number="804" value="overcast clouds" icon="04n"></weather><lastupdate value="2024-07-31T05:05:52"></lastupdate></current>
			
			System.out.println("Weather data: " + data);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		return data;
	}
	
}
