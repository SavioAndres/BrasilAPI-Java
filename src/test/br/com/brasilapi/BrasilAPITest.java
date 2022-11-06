package test.br.com.brasilapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.brasilapi.BrasilAPI;
import br.com.brasilapi.api.Bank;
import br.com.brasilapi.api.CEP;
import br.com.brasilapi.api.CEP2;
import br.com.brasilapi.api.CNPJ;
import br.com.brasilapi.api.DDD;
import br.com.brasilapi.api.Feriados;
import br.com.brasilapi.api.FipeMarca;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.FipeTabela;
import br.com.brasilapi.api.IBGEMunicipio;
import br.com.brasilapi.api.IBGEUF;
import br.com.brasilapi.api.ISBN;
import br.com.brasilapi.api.NCM;
import br.com.brasilapi.api.RegistroBR;
import br.com.brasilapi.api.Taxa;

class BrasilAPITest {

	@Test
	void logPass() {
		BrasilAPI.setEnableLog(true);
		assertEquals(true, BrasilAPI.getEnableLog());
	}

	@Test
	void cachePass() {
		BrasilAPI.setEnableCache(true);
		assertEquals(true, BrasilAPI.getEnableCache());
	}

	@Test
	void banksPass() {
		Bank[] bank = BrasilAPI.banks();
		assertNotNull(bank);
	}

	@Test
	void bankPass() {
		Bank bank = BrasilAPI.bank("1");
		assertEquals("1", bank.getCode());
	}

	@Test
	void cepPass() {
		CEP expectedCep = new CEP();
		expectedCep.setCep("04538133");
		expectedCep.setState("SP");
		expectedCep.setCity("São Paulo");
		expectedCep.setNeighborhood("Itaim Bibi");
		expectedCep.setStreet("Avenida Brigadeiro Faria Lima");
		expectedCep.setService("correios");

		CEP actualCep = BrasilAPI.cep("04538133");

		assertEquals(expectedCep.toString(), actualCep.toString());
	}

	@Test
	void cep2Pass() {
		CEP2 cep2 = BrasilAPI.cep2("04538133");
		assertEquals("04538133", cep2.getCep());
	}

	@Test
	void cnpjPass() {
		CNPJ cnpj = BrasilAPI.cnpj("06.990.590/0001-23");
		assertEquals("06990590000123", cnpj.getCnpj());
	}

	@Test
	void dddPass() {
		DDD ddd = BrasilAPI.ddd("79");
		assertEquals("SE", ddd.getState());
	}

	@Test
	void feriadosPass() {
		Feriados[] feriados = BrasilAPI.feriados("2023");
		assertEquals("2023-01-01", feriados[0].getDate());
	}

	@Test
	void fipeMarcasPass() {
		FipeMarca[] fipeMarcas = BrasilAPI.fipeMarcas("carros");
		assertNotNull(fipeMarcas);
	}

	@Test
	void fipePrecosPass() {
		FipePreco[] fipePrecos = BrasilAPI.fipePrecos("031049-2");
		assertEquals("Ferrari", fipePrecos[0].getMarca());
	}

	@Test
	void fipeTabelasPass() {
		FipeTabela[] fipeTabelas = BrasilAPI.fipeTabelas();
		assertNotNull(fipeTabelas);
	}

	@Test
	void ibgeMunicipiosPass() {
		IBGEMunicipio[] ibgeMunicipios1 = BrasilAPI.ibgeMunicipios("SE");
		IBGEMunicipio[] ibgeMunicipios2 = BrasilAPI.ibgeMunicipios("SE", new String[] { "dados-abertos-br" });
		assertNotNull(ibgeMunicipios1);
		assertNotNull(ibgeMunicipios2);
	}

	@Test
	void ibgeUfsPass() {
		IBGEUF[] ibgeUfs = BrasilAPI.ibgeUf();
		assertNotNull(ibgeUfs);
	}

	@Test
	void ibgeUfPass() {
		IBGEUF ibgeUf = BrasilAPI.ibgeUf("SE");
		assertEquals("SE", ibgeUf.getSigla());
	}

	@Test
	void isbnPass() {
		ISBN isbn1 = BrasilAPI.isbn("9788567097688");
		ISBN isbn2 = BrasilAPI.isbn("9788567097688", new String[] { "cbl" });
		assertEquals("9788567097688", isbn1.getIsbn());
		assertEquals("9788567097688", isbn2.getIsbn());
	}

	@Test
	void ncmPass() {
		NCM[] ncm = BrasilAPI.ncm();
		assertNotNull(ncm);
	}

	@Test
	void ncmCodePass() {
		NCM ncm = BrasilAPI.ncm("01");
		assertEquals("01", ncm.getCodigo());
	}

	@Test
	void ncmSearchPass() {
		NCM[] ncmSearch = BrasilAPI.ncmSearch("Animais vivos.");
		assertNotNull(ncmSearch);
	}

	@Test
	void registroBRPass() {
		RegistroBR registroBR = BrasilAPI.registroBR("savio.pw");
		assertNotNull(registroBR);
	}

	@Test
	void taxasPass() {
		Taxa[] taxas = BrasilAPI.taxas();
		assertNotNull(taxas);
	}

	@Test
	void taxaPass() {
		Taxa taxa = BrasilAPI.taxa("SELIC");
		assertEquals("SELIC", taxa.getNome());
	}

}
