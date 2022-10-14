package br.com.brasilapi.api;

public class CEP2Location {
	private String type;
	private CEP2LocationCoordinates coordinates;
	
	public CEP2Location(String type, CEP2LocationCoordinates coordinates) {
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
	public CEP2LocationCoordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(CEP2LocationCoordinates coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "CepLocation [type=" + type + ", coordinates=" + coordinates + "]";
	}
	
	
}
