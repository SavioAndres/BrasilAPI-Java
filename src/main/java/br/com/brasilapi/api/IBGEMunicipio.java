package br.com.brasilapi.api;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Informações sobre municípios provenientes do IBGE.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/IBGE">https://brasilapi.com.br/docs#tag/IBGE</a>
 */
public class IBGEMunicipio extends API {
	private String nome;
	@SerializedName("codigo_ibge")
	private String codigoIbge;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoIbge, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IBGEMunicipio other = (IBGEMunicipio) obj;
		return Objects.equals(codigoIbge, other.codigoIbge) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "IBGEMunicipios [nome=" + nome + ", codigoIbge=" + codigoIbge + "]";
	}

}
