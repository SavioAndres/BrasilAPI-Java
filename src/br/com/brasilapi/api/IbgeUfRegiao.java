package br.com.brasilapi.api;

public class IBGEUFRegiao {
	private Integer id;
	private String sigla;
	private String nome;
	
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
	@Override
	public String toString() {
		return "IbgeUfRegiao [id=" + id + ", sigla=" + sigla + ", nome=" + nome + "]";
	}
	
	
}
