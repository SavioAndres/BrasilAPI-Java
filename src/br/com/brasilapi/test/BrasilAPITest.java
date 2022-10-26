package br.com.brasilapi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.brasilapi.BrasilAPI;
import br.com.brasilapi.api.CEP;
import br.com.brasilapi.api.CEP2;

class BrasilAPITest {

	@Test
	void cepPass() {
		CEP expectedCep = new CEP();
		expectedCep.setCep("04538133");
		expectedCep.setState("SP");
		expectedCep.setCity("São Paulo");
		expectedCep.setNeighborhood("Itaim Bibi");
		expectedCep.setStreet("Avenida Brigadeiro Faria Lima");
		expectedCep.setService("correios");
		
		CEP cepCep = BrasilAPI.cep("04538133");
		
		assertEquals(expectedCep.toString(), cepCep.toString());
	}
	
	@Test
	void cep2Pass() {
		CEP2 cep2Cep = BrasilAPI.cep2("04538133");
		assertEquals("04538133", cep2Cep.getCep());
	}

}
