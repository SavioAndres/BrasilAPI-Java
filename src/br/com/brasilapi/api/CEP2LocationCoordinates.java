package br.com.brasilapi.api;

public class CEP2LocationCoordinates {
	private String longitude;
	private String latitude;
	
	public CEP2LocationCoordinates(String longitude, String latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "CepLocationCoordinates [longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
}
