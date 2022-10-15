package br.com.brasilapi.api;

import com.google.gson.annotations.SerializedName;

public class IBGEMunicipios extends API {
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
	public String toString() {
		return "IBGEMunicipios [nome=" + nome + ", codigoIbge=" + codigoIbge + "]";
	}
	
}
