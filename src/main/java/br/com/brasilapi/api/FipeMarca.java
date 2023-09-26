package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Informações sobre Preço Médio de Veículos fornecido pela FIPE (Fundação
 * Instituto de Pesquisas Econômicas).
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/FIPE">https://brasilapi.com.br/docs#tag/FIPE</a>
 */
public class FipeMarca extends API {
	private String nome;
	private String valor;

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
		FipeMarca other = (FipeMarca) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "FipeMarcas [nome=" + nome + ", valor=" + valor + "]";
	}

}
