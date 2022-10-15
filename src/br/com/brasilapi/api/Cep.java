package br.com.brasilapi.api;

/**
 * Classe CEP. Representa o CEP com seus atributos.
 * 
 * O CEP (C�digo de Endere�amento Postal) � um sistema de c�digos que 
 * visa racionalizar o processo de encaminhamento e entrega de 
 * correspond�ncias atrav�s da divis�o do pa�s em regi�es postais. ... 
 * Atualmente, o CEP � composto por oito d�gitos, cinco de um lado e 
 * tr�s de outro. Cada algarismo do CEP possui um significado.
 * 
 * @version 1
 * @author S�vio Andres
 * @see br.com.brasilapi.api.CEP2
 * @see <a href="https://brasilapi.com.br/docs#tag/CEP">https://brasilapi.com.br/docs#tag/CEP</a>
 */
public class CEP extends API {
	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	
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

	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", state=" + state + ", city=" + city + ", neighborhood=" + neighborhood
				+ ", street=" + street + ", service=" + service + "]";
	}
	
}
