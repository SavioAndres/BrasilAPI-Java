package br.com.brasilapi;

import com.google.gson.Gson;

import br.com.brasilapi.api.Banks;
import br.com.brasilapi.api.CEP;
import br.com.brasilapi.api.CEP2;
import br.com.brasilapi.api.CNPJ;
import br.com.brasilapi.api.DDD;
import br.com.brasilapi.api.Feriados;
import br.com.brasilapi.api.FipeMarcas;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.FipeTabelas;
import br.com.brasilapi.api.IBGEMunicipios;
import br.com.brasilapi.api.IBGEUF;
import br.com.brasilapi.api.NCM;
import br.com.brasilapi.api.RegistroBR;
import br.com.brasilapi.api.Taxas;

/**
 * Biblioteca criada para facilitar o acesso � API BrasilAPI na linguagem de programa��o Java.
 * 
 * Acesso program�tico de informa��es � algo fundamental na comunica��o entre 
 * sistemas, mas, para nossa surpresa, uma informa��o t�o �til e p�blica 
 * quanto um CEP n�o consegue ser acessada diretamente por um navegador por 
 * conta da API dos Correios n�o possuir CORS habilitado. Dado a isso, este projeto 
 * experimental tem como objetivo centralizar e disponibilizar endpoints modernos 
 * com baix�ssima lat�ncia utilizando tecnologias como Vercel Smart CDN respons�vel 
 * por fazer o cache das informa��es em atualmente 23 regi�es distribu�das ao 
 * longo do mundo (incluindo Brasil). Ent�o n�o importa o qu�o devagar for a fonte 
 * dos dados, n�s queremos disponibiliz�-la da forma mais r�pida e moderna poss�vel.
 * 
 * @author S�vio Andres {@link <a href="https://savio.pw">https://savio.pw</a>}
 * @see <a href="https://brasilapi.com.br/docs">https://brasilapi.com.br/docs</a>
 * @see <a href="https://github.com/BrasilAPI/BrasilAPI">https://github.com/BrasilAPI/BrasilAPI</a>
 * @see <a href="https://github.com/SavioAndres/BrasilAPI-Java">https://github.com/SavioAndres/BrasilAPI-Java</a>
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
	 * Milissegundos padr�o para o tempo de vida do 
	 * cache � de 600000, equivalente � 10 minutos.
	 * @param enableCache
	 */
	public static void setEnableCache(boolean enableCache) {
		Cache.setEnableCache(enableCache);
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>milissegundos</strong>, 
	 * o tempo padr�o � de 600000 milissegundos, equivalente � 10 minutos.
	 * @param time
	 */
	public static void setCacheTime(Long time) {
		Cache.setCacheTime(time);
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>minutos</strong>, 
	 * o tempo padr�o � de 600000 milissegundos, equivalente � 10 minutos.
	 * @param time
	 */
	public static void setCacheTimeMinutes(Long time) {
		Cache.setCacheTime(time * 60000);
	}
	
	/**
	 * Retorna informa��es de todos os bancos do Brasil.
	 * @return Array de {@link Bank}
	 */
	public static Banks[] banks() {
		Banks[] obj = (Banks[]) api(Banks[].class, "banks/v1", "");
		return (Banks[]) obj.clone();
	}
	
	/**
	 * Retorna informa��es de um banco do Brasil de determinado c�digo.
	 * @param code C�digo
	 * @return {@link Banks}
	 */
	public static Banks banks(String code) {
		Banks obj = (Banks) api(Banks.class, "banks/v1/", code);
		return (Banks) obj.clone();
	}
	
	/**
	 * Adicione o c�digo do CEP e obtenha o objeto CEP.
	 * M�todo da vers�o 1.
	 * 
	 * O CEP (C�digo de Endere�amento Postal) � um sistema de c�digos 
	 * que visa racionalizar o processo de encaminhamento e entrega de 
	 * correspond�ncias atrav�s da divis�o do pa�s em regi�es postais. ... 
	 * Atualmente, o CEP � composto por oito d�gitos, cinco de um lado e 
	 * tr�s de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep C�digo de Endere�amento Postal.
	 * @return {@link CEP}
	 * @see #cep2(String)
	 */
	public static CEP cep(String cep) {
		CEP obj = (CEP) api(CEP.class, "cep/v1/", cep);
		return (CEP) obj.clone();
	}
	
	/**
	 * Adicione o c�digo do CEP e obtenha o objeto CEP.
	 * M�todo da vers�o 2.
	 * 
	 * O CEP (C�digo de Endere�amento Postal) � um sistema de c�digos 
	 * que visa racionalizar o processo de encaminhamento e entrega de 
	 * correspond�ncias atrav�s da divis�o do pa�s em regi�es postais. ... 
	 * Atualmente, o CEP � composto por oito d�gitos, cinco de um lado e 
	 * tr�s de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep C�digo de Endere�amento Postal.
	 * @return {@link CEP2}
	 */
	public static CEP2 cep2(String cep) {
		CEP2 obj = (CEP2) api(CEP2.class, "cep/v2/", cep);
		return (CEP2) obj.clone();
	}
	
	/**
	 * O Cadastro Nacional da Pessoa Jur�dica � um n�mero 
	 * �nico que identifica uma pessoa jur�dica e outros 
	 * tipos de arranjo jur�dico sem personalidade 
	 * jur�dica junto � Receita Federal.
	 * 
	 * @param cnpj
	 * @return {@link CNPJ}
	 */
	public static CNPJ cnpj(String cnpj) {
		CNPJ obj = (CNPJ) api(CNPJ.class, "cnpj/v1/", cnpj);
		return (CNPJ) obj.clone();
	}
	
	/**
	 * DDD significa Discagem Direta � Dist�ncia. 
	 * � um sistema de liga��o telef�nica autom�tica 
	 * entre diferentes �reas urbanas nacionais. 
	 * O DDD � um c�digo constitu�do por 2 d�gitos que 
	 * identificam as principais cidades do pa�s e devem 
	 * ser adicionados ao n� de telefone, 
	 * juntamente com o c�digo da operadora.
	 * 
	 * @param ddd
	 * @return {@link DDD}
	 */
	public static DDD ddd(String ddd) {
		DDD obj = (DDD) api(DDD.class, "ddd/v1/", ddd);
		return (DDD) obj.clone();
	}
	
	/**
	 * Lista os feriados nacionais de determinado ano.
	 * 
	 * @param ano
	 * @return {@link Feriados}
	 */
	public static Feriados[] feriados(String ano) {
		Feriados[] obj = (Feriados[]) api(Feriados[].class, "feriados/v1/", ano);
		return (Feriados[]) obj.clone();
	}
	
	/**
	 * Os tipos suportados s�o <i>caminhoes</i>, <i>carros</i> e <i>motos</i>. 
	 * Quando o tipo n�o � espec�ficado s�o buscada 
	 * as marcas de todos os tipos de ve�culos.
	 * 
	 * @param tipoVeiculo
	 * @return Array de {@link FipeMarcas}
	 */
	public static FipeMarcas[] fipeMarcas(String tipoVeiculo) {
		FipeMarcas[] obj = (FipeMarcas[]) api(FipeMarcas[].class, "fipe/marcas/v1/", tipoVeiculo);
		return (FipeMarcas[]) obj.clone();
	}
	
	/**
	 * C�digo da tabela fipe de refer�ncia. 
	 * Por padr�o � utilizado o c�digo da tabela fipe atual.
	 * 
	 * @param codigoFipe C�digo fipe do ve�culo.
	 * @return Array de {@link FipePreco}
	 */
	public static FipePreco[] fipePreco(String codigoFipe) {
		FipePreco[] obj = (FipePreco[]) api(FipePreco[].class, "fipe/preco/v1/", codigoFipe);
		return (FipePreco[]) obj.clone();
	}
	
	/**
	 * Lista as tabelas de refer�ncia existentes.
	 * 
	 * @return Array de {@link FipeTabelas}
	 */
	public static FipeTabelas[] fipeTabelas() {
		FipeTabelas[] obj = (FipeTabelas[]) api(FipeTabelas[].class, "fipe/tabelas/v1", "");
		return (FipeTabelas[]) obj.clone();
	}
	
	/**
	 * Informa��es sobre munic�pios de determinado estados provenientes do IBGE.
	 * 
	 * @param siglaUF Sigla da unidade federativa, por exemplo SP, RJ, SC, etc.
	 * @return Array de {@link IBGEMunicipios}
	 */
	public static IBGEMunicipios[] ibgeMunicipios(String siglaUF) {
		IBGEMunicipios[] obj = (IBGEMunicipios[]) api(
				IBGEMunicipios[].class, 
				"ibge/municipios/v1/", 
				siglaUF);
		return (IBGEMunicipios[]) obj.clone();
	}
	
	/**
	 * Informa��es sobre munic�pios de determinado estados provenientes do IBGE.
	 * 
	 * @param siglaUF Sigla da unidade federativa, por exemplo: SP, RJ, SC, etc.
	 * @param providers Array de String. Provedores dos dados. 
	 * Provedores dispon�ves: dados-abertos-br, gov, wikipedia.
	 * @return Array de {@link IBGEMunicipios}
	 * @see <a href="https://brasilapi.com.br/docs#tag/IBGE">https://brasilapi.com.br/docs#tag/IBGE</a>
	 */
	public static IBGEMunicipios[] ibgeMunicipios(String siglaUF, String[] providers) {
		String providesParameter = "?providers=dados-abertos-br,gov,wikipedia";
		if (providers != null) {
			providesParameter = "?providers=";
			for (String provider : providers) {
				providesParameter += provider + ",";
			}
			providesParameter = providesParameter.substring(0, providesParameter.length() - 1);
		}
		
		IBGEMunicipios[] obj = (IBGEMunicipios[]) api(
				IBGEMunicipios[].class, 
				"ibge/municipios/v1/", 
				siglaUF + providesParameter);
		return (IBGEMunicipios[]) obj.clone();
	}
	
	/**
	 * Retorna informa��es de todos estados do Brasil.
	 * 
	 * @return Array de {@link IBGEUF}
	 */
	public static IBGEUF[] ibgeUf() {
		IBGEUF[] obj = (IBGEUF[]) api(IBGEUF[].class, "ibge/uf/v1", "");
		return (IBGEUF[]) obj.clone();
	}
	
	/**
	 * Retorna informa��es de determinado estados do Brasil.
	 * 
	 * @param sigla ou id
	 * @return {@link IBGEUF}
	 */
	public static IBGEUF ibgeUf(String sigla) {
		IBGEUF obj = (IBGEUF) api(IBGEUF.class, "ibge/uf/v1/", sigla);
		return (IBGEUF) obj.clone();
	}
	
	/**
	 * Retorna informa��es de todos os NCMs.
	 * @return Array de {@link NCM}
	 */
	public static NCM[] ncm() {
		NCM[] obj = (NCM[]) api(NCM[].class, "ncm/v1", "");
		return (NCM[]) obj.clone();
	}
	
	/**
	 * Busca as informa��es de um NCM a partir de um c�digo.
	 * @param code
	 * @return Array de {@link NCM}
	 */
	public static NCM[] ncm(String code) {
		NCM[] obj = (NCM[]) api(NCM[].class, "ncm/v1/", code);
		return (NCM[]) obj.clone();
	}
	
	/**
	 * Pesquisa por NCMs a partir de um c�digo ou descri��o.
	 * @param code ou descri��o
	 * @return Array de {@link NCM}
	 */
	public static NCM[] ncmSearch(String code) {
		NCM[] obj = (NCM[]) api(NCM[].class, "ncm/v1?search=", code);
		return (NCM[]) obj.clone();
	}
	
	/**
	 * Avalia o status de um dominio .br
	 * 
	 * @param domain
	 * @return {@link RegistroBR}
	 */
	public static RegistroBR registroBR(String domain) {
		RegistroBR obj = (RegistroBR) api(RegistroBR.class, "registrobr/v1/", domain);
		return (RegistroBR) obj.clone();
	}
	
	/**
	 * Retorna as taxas de juros e alguns �ndices oficiais do Brasil.
	 * @return Array de {@link Taxas}
	 */
	public static Taxas[] taxas() {
		Taxas[] obj = (Taxas[]) api(Taxas[].class, "taxas/v1", "");
		return (Taxas[]) obj.clone();
	}
	
	/**
	 * Busca as informa��es de uma taxa a partir do seu nome/sigla.
	 * @param sigla
	 * @return {@link Taxas}
	 */
	public static Taxas taxas(String sigla) {
		Taxas obj = (Taxas) api(Taxas.class, "taxas/v1/", sigla);
		return (Taxas) obj.clone();
	}
	
	/**
	 * 
	 * @param classe
	 * @param parametro
	 * @return
	 */
	public static Object setAPI(Class<?> classe, String parametro) {
		String[] parametros = parametro.split("/");
		String code = parametros[parametros.length - 1];
		parametro = "";
		
		for (int i = 0; i < parametros.length - 1; i++) {
			parametro += parametros[i] + "/";
		}
		
		return api(classe, parametro, code);
	}
	
	/**
	 * M�todo respons�vel por verificar se o Cache est� habilitado 
	 * e fazer enviar os dados para conex�o com a WEB, 
	 * ap�s isso fazer a convers�o do dado bruto em 
	 * Json para o Objeto em quest�o.
	 * 
	 * @param classAPIModel Classe Objeto da qual est� tratando.
	 * @param parameter da URL.
	 * @param code valor enviada com o par�metro.
	 * @return {@link Object}
	 */
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
