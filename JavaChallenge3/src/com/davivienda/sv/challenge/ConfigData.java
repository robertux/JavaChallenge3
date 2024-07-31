package com.davivienda.sv.challenge;

public class ConfigData {
	private String url;
	private String apiKey;
	private String latitude;
	private String longitude;
	
	public ConfigData() {
		
	}
	
	public ConfigData(String url, String apiKey, String latitude, String longitude) {
		this.url = url;
		this.apiKey = apiKey;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "ConfigData [url=" + url + ", apiKey=" + apiKey + ", latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}
}
