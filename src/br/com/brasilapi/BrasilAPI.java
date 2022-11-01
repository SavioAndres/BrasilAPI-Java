package br.com.brasilapi;

import com.google.gson.Gson;

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

/**
 * Biblioteca criada para facilitar o acesso à API BrasilAPI na linguagem de programação Java.
 * 
 * Acesso programático de informações é algo fundamental na comunicação entre 
 * sistemas, mas, para nossa surpresa, uma informação tão útil e pública quanto 
 * um CEP não consegue ser acessada diretamente por um navegador por conta da 
 * API dos Correios não possuir CORS habilitado. Dado a isso, este projeto 
 * experimental tem como objetivo centralizar e disponibilizar endpoints modernos 
 * com baixíssima latência utilizando tecnologias como Vercel Smart CDN responsável 
 * por fazer o cache das informações em atualmente 23 regiões distribuídas ao longo 
 * do mundo (incluindo Brasil). Então não importa o quão devagar for a fonte dos 
 * dados, nós queremos disponibilizá-la da forma mais rápida e moderna possível.
 * 
 * @author Sávio Andres {@link <a href="https://savio.pw">https://savio.pw</a>}
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
	 * Obter a situação do Log, true = habilitado, false = desabilitado.
	 * @return Situação do Log
	 */
	public static boolean getEnableLog() {
		return Service.getEnableLog();
	}
	
	/**
	 * Habilitar ou desabilitar Cache.
	 * Milissegundos padrão para o tempo de vida do 
	 * cache é de 600000, equivalente a 10 minutos.
	 * @param enableCache
	 */
	public static void setEnableCache(boolean enableCache) {
		Cache.setEnableCache(enableCache);
	}
	
	/**
	 * Obter a situação do Cache, true = habilitado, false = desabilitado.
	 * @return Situação do Cache
	 */
	public static boolean getEnableCache() {
		return Cache.getEnableCache();
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>milissegundos</strong>, 
	 * o tempo padrão é de 600000 milissegundos, equivalente a 10 minutos.
	 * @param time
	 */
	public static void setCacheTime(Long time) {
		Cache.setCacheTime(time);
	}
	
	/**
	 * Obter o tempo de vida do Cache em <strong>milissegundos</strong>.
	 * @return Long milissegundos
	 */
	public static Long getCacheTime() {
		return Cache.getCacheTime();
	}
	
	/**
	 * Definir o tempo de vida do Cache em <strong>minutos</strong>, 
	 * o tempo padrão é de 600000 milissegundos, equivalente a 10 minutos.
	 * @param time
	 */
	public static void setCacheTimeMinutes(Long time) {
		Cache.setCacheTime(time * 60000);
	}
	
	/**
	 * Obter o tempo de vida do Cache em <strong>minutos</strong>.
	 * @return Long minutos
	 */
	public static Long getCacheTimeMinutes() {
		return Cache.getCacheTime() / 60000;
	}
	
	/**
	 * Retorna informações de todos os bancos do Brasil.
	 * @return Array de {@link Bank}
	 */
	public static Bank[] banks() {
		Bank[] obj = (Bank[]) api(Bank[].class, "banks/v1", "");
		return (Bank[]) obj.clone();
	}
	
	/**
	 * Retorna informações de um banco do Brasil de determinado código.
	 * @param code Código
	 * @return {@link Bank}
	 */
	public static Bank bank(String code) {
		Bank obj = (Bank) api(Bank.class, "banks/v1/", code);
		return (Bank) obj.clone();
	}
	
	/**
	 * Adicione o código do CEP e obtenha o objeto CEP.
	 * M�todo da versão 1.
	 * 
	 * O CEP (Código de Endereçamento Postal) é um sistema de códigos 
	 * que visa racionalizar o processo de encaminhamento e entrega de 
	 * correspondências através da divisão do paás em regiões postais. ... 
	 * Atualmente, o CEP é composto por oito dígitos, cinco de um lado e 
	 * três de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep Código de Endereçamento Postal.
	 * @return {@link CEP}
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
	 * correspondências através da divisão do paás em regiões postais. ... 
	 * Atualmente, o CEP é composto por oito dígitos, cinco de um lado e 
	 * três de outro. Cada algarismo do CEP possui um significado.
	 * 
	 * @param cep Código de Endereçamento Postal.
	 * @return {@link CEP2}
	 */
	public static CEP2 cep2(String cep) {
		CEP2 obj = (CEP2) api(CEP2.class, "cep/v2/", cep);
		return (CEP2) obj.clone();
	}
	
	/**
	 * O Cadastro Nacional da Pessoa Jurídica é um número 
	 * único que identifica uma pessoa jurídica e outros 
	 * tipos de arranjo jurídico sem personalidade 
	 * jurídica junto à Receita Federal.
	 * 
	 * @param cnpj
	 * @return {@link CNPJ}
	 */
	public static CNPJ cnpj(String cnpj) {
		CNPJ obj = (CNPJ) api(CNPJ.class, "cnpj/v1/", cnpj);
		return (CNPJ) obj.clone();
	}
	
	/**
	 * DDD significa Discagem Direta à Distância. 
	 * é um sistema de ligação telefônica automática 
	 * entre diferentes �reas urbanas nacionais. 
	 * O DDD é um código constituído por 2 dígitos que 
	 * identificam as principais cidades do país e devem 
	 * ser adicionados ao nº de telefone, 
	 * juntamente com o código da operadora.
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
	 * Os tipos suportados são <i>caminhoes</i>, <i>carros</i> e <i>motos</i>. 
	 * Quando o tipo não é especificado são buscada 
	 * as marcas de todos os tipos de veículos.
	 * 
	 * @param tipoVeiculo caminhoes, carros, motos.
	 * @return Array de {@link FipeMarca}
	 */
	public static FipeMarca[] fipeMarcas(String tipoVeiculo) {
		FipeMarca[] obj = (FipeMarca[]) api(FipeMarca[].class, "fipe/marcas/v1/", tipoVeiculo);
		return (FipeMarca[]) obj.clone();
	}
	
	/**
	 * Código da tabela fipe de referência. 
	 * Por padrão é utilizado o código da tabela fipe atual.
	 * 
	 * @param codigoFipe Código fipe do veículo.
	 * @return Array de {@link FipePreco}
	 */
	public static FipePreco[] fipePrecos(String codigoFipe) {
		FipePreco[] obj = (FipePreco[]) api(FipePreco[].class, "fipe/preco/v1/", codigoFipe);
		return (FipePreco[]) obj.clone();
	}
	
	/**
	 * Lista as tabelas de referência existentes.
	 * 
	 * @return Array de {@link FipeTabela}
	 */
	public static FipeTabela[] fipeTabelas() {
		FipeTabela[] obj = (FipeTabela[]) api(FipeTabela[].class, "fipe/tabelas/v1", "");
		return (FipeTabela[]) obj.clone();
	}
	
	/**
	 * Informações sobre municípios de determinado estados provenientes do IBGE.
	 * 
	 * @param siglaUF Sigla da unidade federativa, por exemplo SP, RJ, SC, etc.
	 * @return Array de {@link IBGEMunicipio}
	 */
	public static IBGEMunicipio[] ibgeMunicipios(String siglaUF) {
		IBGEMunicipio[] obj = (IBGEMunicipio[]) api(
				IBGEMunicipio[].class, 
				"ibge/municipios/v1/", 
				siglaUF);
		return (IBGEMunicipio[]) obj.clone();
	}
	
	/**
	 * Informações sobre municípios de determinado estados provenientes do IBGE.
	 * 
	 * @param siglaUF Sigla da unidade federativa, por exemplo: SP, RJ, SC, etc.
	 * @param providers Array de String. Provedores dos dados. 
	 * Provedores disponíves: dados-abertos-br, gov, wikipedia.
	 * @return Array de {@link IBGEMunicipio}
	 * @see <a href="https://brasilapi.com.br/docs#tag/IBGE">https://brasilapi.com.br/docs#tag/IBGE</a>
	 */
	public static IBGEMunicipio[] ibgeMunicipios(String siglaUF, String[] providers) {
		String providesParameter = "?providers=dados-abertos-br,gov,wikipedia";
		if (providers != null) {
			providesParameter = "?providers=";
			for (String provider : providers) {
				providesParameter += provider + ",";
			}
			providesParameter = providesParameter.substring(0, providesParameter.length() - 1);
		}
		
		IBGEMunicipio[] obj = (IBGEMunicipio[]) api(
				IBGEMunicipio[].class, 
				"ibge/municipios/v1/", 
				siglaUF + providesParameter);
		return (IBGEMunicipio[]) obj.clone();
	}
	
	/**
	 * Retorna informações de todos estados do Brasil.
	 * 
	 * @return Array de {@link IBGEUF}
	 */
	public static IBGEUF[] ibgeUf() {
		IBGEUF[] obj = (IBGEUF[]) api(IBGEUF[].class, "ibge/uf/v1", "");
		return (IBGEUF[]) obj.clone();
	}
	
	/**
	 * Retorna informações de determinado estados do Brasil.
	 * 
	 * @param sigla ou id
	 * @return {@link IBGEUF}
	 */
	public static IBGEUF ibgeUf(String sigla) {
		IBGEUF obj = (IBGEUF) api(IBGEUF.class, "ibge/uf/v1/", sigla);
		return (IBGEUF) obj.clone();
	}
	
	/**
	 * Sistema internacional de identificação de livros.
	 * 
	 * O código informado pode conter traços (-) e ambos 
	 * os formatos são aceitos, sendo eles o obsoleto 
	 * de 10 dígitos e o atual de 13 dígitos.
	 * 
	 * @param isbn
	 * @return {@link ISBN}
	 */
	public static ISBN isbn(String isbn) {
		ISBN obj = (ISBN) api(ISBN.class, "isbn/v1/", isbn);
		return (ISBN) obj.clone();
	}
	
	/**
	 * Sistema internacional de identificação de livros.
	 * 
	 * O código informado pode conter traços (-) e ambos 
	 * os formatos são aceitos, sendo eles o obsoleto 
	 * de 10 dígitos e o atual de 13 dígitos.
	 * 
	 * Lista de provedores separados por vírgula. 
	 * Se não especificado, será realizado uma 
	 * busca em todos os provedores e o que retornar 
	 * as informações mais rapidamente será o escolhido.
	 * 
	 * @param isbn
	 * @param providers Array de String. Provedores dos dados. 
	 * Provedores disponíves: cbl, mercado-editorial, open-library, google-books.
	 * @return {@link ISBN}
	 */
	public static ISBN isbn(String isbn, String[] providers) {
		String providesParameter = "";
		if (providers != null) {
			providesParameter = "?providers=";
			for (String provider : providers) {
				providesParameter += provider + ",";
			}
			providesParameter = providesParameter.substring(0, providesParameter.length() - 1);
		}
		
		ISBN obj = (ISBN) api(ISBN.class, "isbn/v1/", isbn + providesParameter);
		return (ISBN) obj.clone();
	}
	
	/**
	 * Retorna informações de todos os NCMs.
	 * @return Array de {@link NCM}
	 */
	public static NCM[] ncm() {
		NCM[] obj = (NCM[]) api(NCM[].class, "ncm/v1", "");
		return (NCM[]) obj.clone();
	}
	
	/**
	 * Busca as informações de um NCM a partir de um código.
	 * @param code
	 * @return Array de {@link NCM}
	 */
	public static NCM ncm(String code) {
		NCM obj = (NCM) api(NCM.class, "ncm/v1/", code);
		return (NCM) obj.clone();
	}
	
	/**
	 * Pesquisa por NCMs a partir de um código ou descrição.
	 * @param code ou descrição
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
	 * Retorna as taxas de juros e alguns índices oficiais do Brasil.
	 * @return Array de {@link Taxa}
	 */
	public static Taxa[] taxas() {
		Taxa[] obj = (Taxa[]) api(Taxa[].class, "taxas/v1", "");
		return (Taxa[]) obj.clone();
	}
	
	/**
	 * Busca as informações de uma taxa a partir do seu nome/sigla.
	 * @param sigla
	 * @return {@link Taxa}
	 */
	public static Taxa taxa(String sigla) {
		Taxa obj = (Taxa) api(Taxa.class, "taxas/v1/", sigla);
		return (Taxa) obj.clone();
	}
	
	/**
	 * M�todo responsável por verificar se o Cache está habilitado 
	 * e fazer enviar os dados para conexão com a WEB, 
	 * após isso fazer a conversão do dado bruto em 
	 * Json para o Objeto em questão.
	 * 
	 * @param classAPIModel Classe Objeto da qual está tratando.
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
