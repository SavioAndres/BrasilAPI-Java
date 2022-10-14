package br.com.brasilapi.api;

public class CEP2 {
	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	private CEP2Location location;
	
	public CEP2(String cep, String state, String city, String neighborhood, String street, String service,
			CEP2Location location) {
		super();
		this.cep = cep;
		this.state = state;
		this.city = city;
		this.neighborhood = neighborhood;
		this.street = street;
		this.service = service;
		this.location = location;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public CEP2Location getLocation() {
		return location;
	}
	public void setLocation(CEP2Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", state=" + state + ", city=" + city + ", neighborhood=" + neighborhood
				+ ", street=" + street + ", service=" + service + ", location=" + location + "]";
	}
}
