package br.com.brasilapi.api;

import java.util.Arrays;

/**
 * DDD significa Discagem Direta � Dist�ncia. 
 * � um sistema de liga��o telef�nica autom�tica 
 * entre diferentes �reas urbanas nacionais. 
 * O DDD � um c�digo constitu�do por 2 d�gitos que 
 * identificam as principais cidades do pa�s e devem 
 * ser adicionados ao n� de telefone, 
 * juntamente com o c�digo da operadora.
 * 
 * @author S�vio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/DDD">https://brasilapi.com.br/docs#tag/DDD</a>
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
	public String toString() {
		return "DDD [state=" + state + ", cities=" + Arrays.toString(cities) + "]";
	}
	
	
}
