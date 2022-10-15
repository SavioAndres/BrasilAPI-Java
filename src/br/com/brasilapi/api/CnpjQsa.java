package br.com.brasilapi.api;

import com.google.gson.annotations.SerializedName;

public class CNPJQsa {
	private String pais;
	@SerializedName("nome_socio")
	private String nomeSocio;
	@SerializedName("codigo_pais")
	private Integer codigoPais;
	@SerializedName("faixa_etaria")
	private String faixaEtaria;
	@SerializedName("cnpj_cpf_do_socio")
	private String cnpjCpfDoSocio;
	@SerializedName("qualificacao_socio")
	private String qualificacaoSocio;
	@SerializedName("codigo_faixa_etaria")
	private Integer codigoFaixaEtaria;
	@SerializedName("data_entrada_sociedade")
	private String dataEntradaSociedade;
	@SerializedName("identificador_de_socio")
	private Integer identificadorDeSocio;
	@SerializedName("cpf_representante_legal")
	private String cpfRepresentanteLegal;
	@SerializedName("nome_representante_legal")
	private String nomeRepresentanteLegal;
	@SerializedName("codigo_qualificacao_socio")
	private Integer codigoQualificacaoSocio;
	@SerializedName("qualificacao_representante_legal")
	private String qualificacaoRepresentanteLegal;
	@SerializedName("codigo_qualificacao_representante_legal")
	private Integer codigoQualificacaoRepresentanteLegal;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNomeSocio() {
		return nomeSocio;
	}
	public void setNomeSocio(String nomeSocio) {
		this.nomeSocio = nomeSocio;
	}
	public Integer getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getCnpjCpfDoSocio() {
		return cnpjCpfDoSocio;
	}
	public void setCnpjCpfDoSocio(String cnpjCpfDoSocio) {
		this.cnpjCpfDoSocio = cnpjCpfDoSocio;
	}
	public String getQualificacaoSocio() {
		return qualificacaoSocio;
	}
	public void setQualificacaoSocio(String qualificacaoSocio) {
		this.qualificacaoSocio = qualificacaoSocio;
	}
	public Integer getCodigoFaixaEtaria() {
		return codigoFaixaEtaria;
	}
	public void setCodigoFaixaEtaria(Integer codigoFaixaEtaria) {
		this.codigoFaixaEtaria = codigoFaixaEtaria;
	}
	public String getDataEntradaSociedade() {
		return dataEntradaSociedade;
	}
	public void setDataEntradaSociedade(String dataEntradaSociedade) {
		this.dataEntradaSociedade = dataEntradaSociedade;
	}
	public Integer getIdentificadorDeSocio() {
		return identificadorDeSocio;
	}
	public void setIdentificadorDeSocio(Integer identificadorDeSocio) {
		this.identificadorDeSocio = identificadorDeSocio;
	}
	public String getCpfRepresentanteLegal() {
		return cpfRepresentanteLegal;
	}
	public void setCpfRepresentanteLegal(String cpfRepresentanteLegal) {
		this.cpfRepresentanteLegal = cpfRepresentanteLegal;
	}
	public String getNomeRepresentanteLegal() {
		return nomeRepresentanteLegal;
	}
	public void setNomeRepresentanteLegal(String nomeRepresentanteLegal) {
		this.nomeRepresentanteLegal = nomeRepresentanteLegal;
	}
	public Integer getCodigoQualificacaoSocio() {
		return codigoQualificacaoSocio;
	}
	public void setCodigoQualificacaoSocio(Integer codigoQualificacaoSocio) {
		this.codigoQualificacaoSocio = codigoQualificacaoSocio;
	}
	public String getQualificacaoRepresentanteLegal() {
		return qualificacaoRepresentanteLegal;
	}
	public void setQualificacaoRepresentanteLegal(String qualificacaoRepresentanteLegal) {
		this.qualificacaoRepresentanteLegal = qualificacaoRepresentanteLegal;
	}
	public Integer getCodigoQualificacaoRepresentanteLegal() {
		return codigoQualificacaoRepresentanteLegal;
	}
	public void setCodigoQualificacaoRepresentanteLegal(Integer codigoQualificacaoRepresentanteLegal) {
		this.codigoQualificacaoRepresentanteLegal = codigoQualificacaoRepresentanteLegal;
	}
	@Override
	public String toString() {
		return "CNPJQsa [pais=" + pais + ", nomeSocio=" + nomeSocio + ", codigoPais=" + codigoPais + ", faixaEtaria="
				+ faixaEtaria + ", cnpjCpfDoSocio=" + cnpjCpfDoSocio + ", qualificacaoSocio=" + qualificacaoSocio
				+ ", codigoFaixaEtaria=" + codigoFaixaEtaria + ", dataEntradaSociedade=" + dataEntradaSociedade
				+ ", identificadorDeSocio=" + identificadorDeSocio + ", cpfRepresentanteLegal=" + cpfRepresentanteLegal
				+ ", nomeRepresentanteLegal=" + nomeRepresentanteLegal + ", codigoQualificacaoSocio="
				+ codigoQualificacaoSocio + ", qualificacaoRepresentanteLegal=" + qualificacaoRepresentanteLegal
				+ ", codigoQualificacaoRepresentanteLegal=" + codigoQualificacaoRepresentanteLegal + "]";
	}
	
}
