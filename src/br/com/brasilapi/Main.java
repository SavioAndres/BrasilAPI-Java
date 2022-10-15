package br.com.brasilapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import br.com.brasilapi.api.CEP;
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
		BrasilAPI brasilAPI = new BrasilAPI();
		//BrasilAPI brasilAPI2 = new BrasilAPI();
		//Map<?, ?> cnpj = brasilapi.cnpj("06990590/000123");
		//Map<?, ?> ddd = brasilapi.feriados("1999");
		//FipePreco[] ddd = brasilapi.fipePreco("081001-0");
		//System.out.println(cep);
		//for (IbgeMunicipios fipePreco : ib) {
		//RegistroBR cnpj = brasilAPI.registroBR("google.com.br");
		//CNPJ cnpj = brasilAPI.cnpj("06990590000123");
		//Ddd ddd = brasilAPI.ddd("79");
		
//		IBGEUF rr = brasilAPI.ibgeUf("SE");
//		System.out.println(rr);
//		IBGEUF rr2 = brasilAPI.ibgeUf("SE");
//		rr2.setId(123);
//		System.out.println(rr2);
//		
//		IBGEUF rr3 = brasilAPI.ibgeUf("SE");
//		System.out.println(rr3);
//		IBGEUF rr4 = brasilAPI.ibgeUf("SE");
//		System.out.println(rr4);
		BrasilAPI.setEnableCache(true);
		BrasilAPI.setCacheTime(60000L);
		IBGEUF obg = BrasilAPI.ibgeUf("SE");
		obg.setNome("AAA");
		
		System.out.println(obg);
		BrasilAPI.setEnableLog(false);
		IBGEUF obg2 = BrasilAPI.ibgeUf("SE");
		
		System.out.println(obg2);
		IBGEUF obg3 = BrasilAPI.ibgeUf("SP");
		
		System.out.println(obg3);
		IBGEUF obg4 = BrasilAPI.ibgeUf("SE");
		obg4.setId(000000);
		System.out.println(obg4);
		IBGEUF obg5 = BrasilAPI.ibgeUf("SE");
		
		System.out.println(obg5);
		
		
//		IBGEMunicipios[] mu = BrasilAPI.ibgeMunicipios("SE");
//		System.out.println(mu[0]);
		
		IBGEUF obg6 = BrasilAPI.ibgeUf("SE");
		
		System.out.println(obg6);
		IBGEUF obg7 = BrasilAPI.ibgeUf("SP");
		
		System.out.println(obg7);
		
		IBGEMunicipios[] mu2 = BrasilAPI.ibgeMunicipios("Sp");
		System.out.println(mu2[0]);
		
		
		IBGEUF obg8 = BrasilAPI.ibgeUf("SE");
		
		System.out.println(obg8);
		IBGEMunicipios[] mu3 = BrasilAPI.ibgeMunicipios("SE");
		System.out.println(mu3[0]);
		IBGEUF obg9 = BrasilAPI.ibgeUf("SE");
		
		System.out.println(obg9);
		//System.out.println(cnpj2);
		//}
	}

}
