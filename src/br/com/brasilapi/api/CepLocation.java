package br.com.brasilapi.api;

public class CepLocation {
	private String type;
	private CepLocationCoordinates coordinates;
	
	public CepLocation(String type, CepLocationCoordinates coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CepLocationCoordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(CepLocationCoordinates coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "CepLocation [type=" + type + ", coordinates=" + coordinates + "]";
	}
	
	
}
