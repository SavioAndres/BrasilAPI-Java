package br.com.brasilapi.api;

import java.util.Arrays;

public class DDD extends API {
	private String state;
	private String[] cities;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String[] getCities() {
		return cities;
	}

	public void setCities(String[] cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "DDD [state=" + state + ", cities=" + Arrays.toString(cities) + "]";
	}
	
	
}
