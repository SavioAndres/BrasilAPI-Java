package br.com.brasilapi.api;

public class IBGEMunicipios {
	private String nome;
	private String codigo_ibge;
	
	public IBGEMunicipios(String nome, String codigo_ibge) {
		super();
		this.nome = nome;
		this.codigo_ibge = codigo_ibge;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo_ibge() {
		return codigo_ibge;
	}
	public void setCodigo_ibge(String codigo_ibge) {
		this.codigo_ibge = codigo_ibge;
	}
	@Override
	public String toString() {
		return "IBGEMunicipios [nome=" + nome + ", codigo_ibge=" + codigo_ibge + "]";
	}
	
	
}
