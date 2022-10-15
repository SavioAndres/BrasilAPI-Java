package br.com.brasilapi;

import com.google.gson.Gson;

import br.com.brasilapi.api.CEP;
import br.com.brasilapi.api.CEP2;
import br.com.brasilapi.api.CNPJ;
import br.com.brasilapi.api.DDD;
import br.com.brasilapi.api.Feriados;
import br.com.brasilapi.api.FipeMarcas;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.IBGEMunicipios;
import br.com.brasilapi.api.IBGEUF;
import br.com.brasilapi.api.NCM;
import br.com.brasilapi.api.RegistroBR;

/**
 * Biblioteca criada para facilitar o acesso à API BrasilAPI na linguagem de programação Java.
 * 
 * Acesso programático de informações é algo fundamental na comunicação entre 
 * sistemas, mas, para nossa surpresa, uma informação tão útil e pública 
 * quanto um CEP não consegue ser acessada diretamente por um navegador por 
 * conta da API dos Correios não possuir CORS habilitado. Dado a isso, este projeto 
 * experimental tem como objetivo centralizar e disponibilizar endpoints modernos 
 * com baixíssima latência utilizando tecnologias como Vercel Smart CDN responsável 
 * por fazer o cache das informações em atualmente 23 regiões distribuídas ao 
 * longo do mundo (incluindo Brasil). Então não importa o quão devagar for a fonte 
 * dos dados, nós queremos disponibilizá-la da forma mais rápida e moderna possível.
 * 
 * @author Sávio Andres {@link <a href="https://savio.pw">https://savio.pw</a>}
 * @see <a href="https://brasilapi.com.br/docs">https://brasilapi.com.br/docs</a>
 */
public class BrasilAPI {
	private static Gson gson = new Gson();
	
	/**
	 * Habilitar ou desabilitar Log.
	 * @param enableLog
	 */
	public static void setEnableLog(boolean enableLog) {
		Service.setEnableLog(enableLog);
	}
	
	/**
	 * Habilitar ou desabilitar Cache.
	 * Milissegundos padrão para o tempo de vida do 
	 * cache é de 600000, equivalente à 10 minutos.
	 * @param enableCache
	 */
	public static void setEnableCache(boolean enableCache) {
		Cache.setEnableCache(enableCache);
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>milissegundos</strong>, 
	 * o tempo padrão é de 600000 milissegundos, equivalente à 10 minutos.
	 * @param time
	 */
	public static void setCacheTime(Long time) {
		Cache.setCacheTime(time);
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>minutos</strong>, 
	 * o tempo padrão é de 600000 milissegundos, equivalente à 10 minutos.
	 * @param time
	 */
	public static void setCacheTimeMinutes(Long time) {
		Cache.setCacheTime(time * 60000);
	}
	
	/**
	 * Adicione o código do CEP e obtenha o objeto CEP.
	 * Método da versão 1.
	 * 
	 * O CEP (Código de Endereçamento Postal) é um sistema de códigos 
	 * que visa racionalizar o processo de encaminhamento e entrega de 
	 * correspondências através da divisão do país em regiões postais. ... 
	 * Atualmente, o CEP é composto por oito dígitos, cinco de um lado e 
	 * três de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep Código de Endereçamento Postal.
	 * @return Objeto {@link CEP}
	 * @see #cep2(String)
	 */
	public static CEP cep(String cep) {
		CEP obj = (CEP) api(CEP.class, "cep/v1/", cep);
		return (CEP) obj.clone();
	}
	
	/**
	 * Adicione o código do CEP e obtenha o objeto CEP.
	 * Método da versão 2.
	 * 
	 * O CEP (Código de Endereçamento Postal) é um sistema de códigos 
	 * que visa racionalizar o processo de encaminhamento e entrega de 
	 * correspondências através da divisão do país em regiões postais. ... 
	 * Atualmente, o CEP é composto por oito dígitos, cinco de um lado e 
	 * três de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep Código de Endereçamento Postal.
	 * @return Objeto {@link CEP2}
	 */
	public static CEP2 cep2(String cep) {
		CEP2 obj = (CEP2) api(CEP2.class, "cep/v2/", cep);
		return (CEP2) obj.clone();
	}
	
	/**
	 * 
	 * @param cnpj
	 * @return Objeto CEP
	 */
	public static CNPJ cnpj(String cnpj) {
		CNPJ obj = (CNPJ) api(CNPJ.class, "cnpj/v1/", cnpj);
		return (CNPJ) obj.clone();
	}
	
	public static DDD ddd(String ddd) {
		DDD obj = (DDD) api(DDD.class, "ddd/v1/", ddd);
		return (DDD) obj.clone();
	}
	
	public static Feriados[] feriados(String feriados) {
		Feriados[] obj = (Feriados[]) api(Feriados[].class, "feriados/v1/", feriados);
		return (Feriados[]) obj.clone();
	}
	
	public static NCM[] ncm() {
		NCM[] obj = (NCM[]) api(NCM[].class, "api/ncm/v1", "");
		return (NCM[]) obj.clone();
	}
	
	public static NCM[] ncm(String ncm) {
		NCM[] obj = (NCM[]) api(NCM[].class, "api/ncm/v1/", ncm);
		return (NCM[]) obj.clone();
	}
	
	public static NCM[] ncmSearch(String ncm) {
		NCM[] obj = (NCM[]) api(NCM[].class, "api/ncm/v1?search=", ncm);
		return (NCM[]) obj.clone();
	}
	
	public static RegistroBR registroBR(String registroBR) {
		RegistroBR obj = (RegistroBR) api(RegistroBR.class, "registrobr/v1/", registroBR);
		return (RegistroBR) obj.clone();
	}
	
	public static FipeMarcas[] fipeMarcas(String fipeMarcas) {
		FipeMarcas[] obj = (FipeMarcas[]) api(FipeMarcas[].class, "fipe/marcas/v1/", fipeMarcas);
		return (FipeMarcas[]) obj.clone();
	}
	
	public static FipePreco[] fipePreco(String fipePreco) {
		FipePreco[] obj = (FipePreco[]) api(FipePreco[].class, "fipe/preco/v1/", fipePreco);
		return (FipePreco[]) obj.clone();
	}
	
	public static IBGEMunicipios[] ibgeMunicipios(String ibgeMunicipios) {
		IBGEMunicipios[] obj = (IBGEMunicipios[]) api(
				IBGEMunicipios[].class, 
				"ibge/municipios/v1/", 
				ibgeMunicipios);
		
		return (IBGEMunicipios[]) obj.clone();
	}
	
	
	public static IBGEUF ibgeUf(String ibgeUf) {
		IBGEUF obj = (IBGEUF) api(IBGEUF.class, "ibge/uf/v1/", ibgeUf);
		return (IBGEUF) obj.clone();
	}
	
	private static Object api(Class<?> classAPIModel, String parameter, String code) {
		if (Cache.getEnableCache()) {
			Object obj = Cache.getCache(classAPIModel, code);
			
			if (obj == null) {
				String json = Service.connection(parameter, code);
				obj = gson.fromJson(json, classAPIModel);
				Cache.setCache(classAPIModel, code, obj);
			}
			
			return obj;
		} else {
			String json = Service.connection(parameter, code);
			return gson.fromJson(json, classAPIModel);
		}
	}
	
}
