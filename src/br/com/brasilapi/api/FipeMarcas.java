package br.com.brasilapi.api;

public class FipeMarcas {
	private String nome;
	private String valor;
	
	public FipeMarcas(String nome, String valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "FipeMarcas [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
