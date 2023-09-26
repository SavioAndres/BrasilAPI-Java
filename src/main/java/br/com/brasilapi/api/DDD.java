package br.com.brasilapi.api;

import java.util.Arrays;
import java.util.Objects;

/**
 * DDD significa Discagem Direta à Distância. é um sistema de ligação telefônica
 * automática entre diferentes áreas urbanas nacionais. O DDD é um código
 * constituído por 2 dígitos que identificam as principais cidades do país e
 * devem ser adicionados ao nº de telefone, juntamente com o código da
 * operadora.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/DDD">https://brasilapi.com.br/docs#tag/DDD</a>
 */
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cities);
		result = prime * result + Objects.hash(state);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DDD other = (DDD) obj;
		return Arrays.equals(cities, other.cities) && Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "DDD [state=" + state + ", cities=" + Arrays.toString(cities) + "]";
	}

}
