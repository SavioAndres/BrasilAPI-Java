package br.com.brasilapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import br.com.brasilapi.api.CEP2;
import br.com.brasilapi.api.CNPJ;
import br.com.brasilapi.api.DDD;
import br.com.brasilapi.api.Feriados;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.IBGEMunicipios;
import br.com.brasilapi.api.IBGEUF;
import br.com.brasilapi.api.RegistroBR;

public class Main {

	public static void main(String[] args) {
		BrasilAPI brasilAPI = new BrasilAPI(true);
		//BrasilAPI brasilAPI2 = new BrasilAPI();
		//Map<?, ?> cnpj = brasilapi.cnpj("06990590/000123");
		//Map<?, ?> ddd = brasilapi.feriados("1999");
		//FipePreco[] ddd = brasilapi.fipePreco("081001-0");
		//System.out.println(cep);
		//for (IbgeMunicipios fipePreco : ib) {
		//RegistroBR cnpj = brasilAPI.registroBR("google.com.br");
		CNPJ cnpj = brasilAPI.cnpj("06990590000123");
		//Ddd ddd = brasilAPI.ddd("79");
			System.out.println(cnpj);
		
		
		//System.out.println(cnpj2);
		//}
	}

}
