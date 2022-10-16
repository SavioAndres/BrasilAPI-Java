package br.com.brasilapi.api;

/**
 * Taxas de juros e índices oficiais do Brasil.
 * 
 * @author Sávio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/TAXAS">https://brasilapi.com.br/docs#tag/TAXAS</a>
 */
public class Taxas extends API {
	private String nome;
	private Float valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Taxas [nome=" + nome + ", valor=" + valor + "]";
	}
	
}
