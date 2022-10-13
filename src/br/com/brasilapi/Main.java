package br.com.brasilapi;

import java.util.Map;

import br.com.brasilapi.api.Cep;
import br.com.brasilapi.api.Cnpj;
import br.com.brasilapi.api.Ddd;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.IbgeMunicipios;
import br.com.brasilapi.api.IbgeUf;

public class Main {

	public static void main(String[] args) {
		BrasilAPI brasilapi = new BrasilAPI();
		//Map<?, ?> cnpj = brasilapi.cnpj("06990590/000123");
		//Map<?, ?> ddd = brasilapi.feriados("1999");
		//FipePreco[] ddd = brasilapi.fipePreco("081001-0");
		//System.out.println(cep);
		//for (IbgeMunicipios fipePreco : ib) {
		//Cnpj cnpj = brasilapi.cnpj("06990590000123");
		Ddd ddd = brasilapi.ddd("79");
		System.out.println(ddd.getCities());
		//}
		
	}

}
