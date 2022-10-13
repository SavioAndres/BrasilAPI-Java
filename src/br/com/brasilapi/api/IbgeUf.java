package br.com.brasilapi.api;

public class IbgeUf {
	private int id;
	private String sigla;
	private String nome;
	private IbgeUfRegiao regiao;
	
	public IbgeUf(int id, String sigla, String nome, IbgeUfRegiao regiao) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public IbgeUfRegiao getRegiao() {
		return regiao;
	}
	public void setRegiao(IbgeUfRegiao regiao) {
		this.regiao = regiao;
	}
	@Override
	public String toString() {
		return "IbgeUf [id=" + id + ", sigla=" + sigla + ", nome=" + nome + ", regiao=" + regiao + "]";
	}
	
	
}
