package br.com.brasilapi.api;

/**
 * Informações sobre estados provenientes do IBGE.
 * 
 * @author Sávio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/IBGE">https://brasilapi.com.br/docs#tag/IBGE</a>
 */
public class IBGEUF extends API {
	private Integer id;
	private String sigla;
	private String nome;
	private IBGEUFRegiao regiao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public IBGEUFRegiao getRegiao() {
		return regiao;
	}
	public void setRegiao(IBGEUFRegiao regiao) {
		this.regiao = regiao;
	}
	@Override
	public String toString() {
		return "IbgeUf [id=" + id + ", sigla=" + sigla + ", nome=" + nome + ", regiao=" + regiao + "]";
	}
	
}
