package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Taxas de juros e índices oficiais do Brasil.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/TAXAS">https://brasilapi.com.br/docs#tag/TAXAS</a>
 */
public class Taxa extends API {
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
	public int hashCode() {
		return Objects.hash(nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taxa other = (Taxa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "Taxas [nome=" + nome + ", valor=" + valor + "]";
	}

}
