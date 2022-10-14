package br.com.brasilapi.api;

import java.util.List;

public class DDD {
	private String state;
	private List<String> cities;

	public DDD(String state, List<String> cities) {
		super();
		this.state = state;
		this.cities = cities;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Ddd [state=" + state + ", cities=" + cities + "]";
	}

	
	
}
