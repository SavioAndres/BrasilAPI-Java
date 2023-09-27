package br.com.brasilapi.api;

/**
 * Retorna listagem com todas as cidades junto a seus respectivos 
 * códigos presentes nos serviços da CPTEC. O Código destas cidades 
 * será utilizado para os serviços de meteorologia e a ondas (previsão oceânica) 
 * fornecido pelo centro. Leve em consideração que o WebService do CPTEC 
 * as vezes é instável, então se não encontrar uma determinada cidade na 
 * listagem completa, tente buscando por parte de seu nome no endpoint de busca.
 * 
 * @version 1
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CPTEC">https://brasilapi.com.br/docs#tag/CPTEC</a>
 */
public interface CPTECCidade {
	public String getNome();
	public void setNome(String nome);
	public String getEstado();
	public void setEstado(String estado);
	public Integer getId();
	public void setId(Integer id);
}
