package br.com.brasilapi.api;

/**
 * Classe CEP2. Representa o CEP com seus atributos.
 * 
 * O CEP (Código de Endereçamento Postal) é um sistema de códigos 
 * que visa racionalizar o processo de encaminhamento e entrega de 
 * correspondências através da divisão do paás em regiões postais. ... 
 * Atualmente, o CEP é composto por oito dígitos, cinco de um lado e 
 * três de outro. Cada algarismo do CEP possui um significado.
 * 
 * @author Sávio Andres
 * @version 2
 * @see <a href="https://brasilapi.com.br/docs#tag/CEP-V2">https://brasilapi.com.br/docs#tag/CEP-V2</a>
 */
public class CEP2 extends API {
	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	private CEP2Location location;
	
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
