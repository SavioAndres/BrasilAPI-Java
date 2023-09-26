package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Classe CEP. Representa o CEP com seus atributos.
 * 
 * O CEP (Código de Endereçamento Postal) é um sistema de códigos que visa
 * racionalizar o processo de encaminhamento e entrega de correspondências
 * através da divisão do paás em regiões postais. ... Atualmente, o CEP é
 * composto por oito dígitos, cinco de um lado e três de outro. Cada algarismo
 * do CEP possui um significado.
 * 
 * @version 1
 * @author Sávio Andres
 * @see br.com.brasilapi.api.CEP2
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CEP">https://brasilapi.com.br/docs#tag/CEP</a>
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
	public int hashCode() {
		return Objects.hash(cep, city, neighborhood, service, state, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEP other = (CEP) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(city, other.city)
				&& Objects.equals(neighborhood, other.neighborhood) && Objects.equals(service, other.service)
				&& Objects.equals(state, other.state) && Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", state=" + state + ", city=" + city + ", neighborhood=" + neighborhood
				+ ", street=" + street + ", service=" + service + "]";
	}

}
