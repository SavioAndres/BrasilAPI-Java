package br.com.brasilapi.api;

import com.google.gson.annotations.SerializedName;

public class NCM extends API {
	private String codigo;
	private String descricao;
	@SerializedName("data_inicio")
	private String dataInicio;
	@SerializedName("data_fim")
	private String dataFim;
	@SerializedName("tipo_ato")
	private String tipoAto;
	@SerializedName("numero_ato")
	private String numeroAto;
	@SerializedName("ano_ato")
	private String anoAto;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getTipoAto() {
		return tipoAto;
	}
	public void setTipoAto(String tipoAto) {
		this.tipoAto = tipoAto;
	}
	public String getNumeroAto() {
		return numeroAto;
	}
	public void setNumeroAto(String numeroAto) {
		this.numeroAto = numeroAto;
	}
	public String getAnoAto() {
		return anoAto;
	}
	public void setAnoAto(String anoAto) {
		this.anoAto = anoAto;
	}
	@Override
	public String toString() {
		return "NCM [codigo=" + codigo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", tipoAto=" + tipoAto + ", numeroAto=" + numeroAto + ", anoAto=" + anoAto + "]";
	}
	
}
