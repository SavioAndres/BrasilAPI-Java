package br.com.brasilapi.api;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Informações referentes a Corretoras ativas listadas na CVM.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/Corretoras">https://brasilapi.com.br/docs#tag/Corretoras</a>
 */
public class Corretora extends API {
	private String cnpj;
	private String type;
	@SerializedName("nome_social")
	private String nomeSocial;
	@SerializedName("nome_comercial")
	private String nomeComercial;
	private String status;
	private String email;
	private String telefone;
	private String cep;
	private String pais;
	private String uf;
	private String municipio;
	private String bairro;
	private String complemento;
	private String logradouro;
	@SerializedName("data_patrimonio_liquido")
	private Date dataPatrimonioLiquido;
	@SerializedName("valor_patrimonio_liquido")
	private Double valorPatrimonioLiquido;
	@SerializedName("codigo_cvm")
	private Long codigoCVM;
	@SerializedName("data_inicio_situacao")
	private Date dataInicioSituacao;
	@SerializedName("data_registro")
	private Date dataRegistro;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public String getNomeComercial() {
		return nomeComercial;
	}
	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Date getDataPatrimonioLiquido() {
		return dataPatrimonioLiquido;
	}
	public void setDataPatrimonioLiquido(Date dataPatrimonioLiquido) {
		this.dataPatrimonioLiquido = dataPatrimonioLiquido;
	}
	public Double getValorPatrimonioLiquido() {
		return valorPatrimonioLiquido;
	}
	public void setValorPatrimonioLiquido(Double valorPatrimonioLiquido) {
		this.valorPatrimonioLiquido = valorPatrimonioLiquido;
	}
	public Long getCodigoCVM() {
		return codigoCVM;
	}
	public void setCodigoCVM(Long codigoCVM) {
		this.codigoCVM = codigoCVM;
	}
	public Date getDataInicioSituacao() {
		return dataInicioSituacao;
	}
	public void setDataInicioSituacao(Date dataInicioSituacao) {
		this.dataInicioSituacao = dataInicioSituacao;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	@Override
	public String toString() {
		return "Corretora [cnpj=" + cnpj + ", type=" + type + ", nomeSocial=" + nomeSocial + ", nomeComercial="
				+ nomeComercial + ", status=" + status + ", email=" + email + ", telefone=" + telefone + ", cep=" + cep
				+ ", pais=" + pais + ", uf=" + uf + ", municipio=" + municipio + ", bairro=" + bairro + ", complemento="
				+ complemento + ", logradouro=" + logradouro + ", dataPatrimonioLiquido=" + dataPatrimonioLiquido
				+ ", valorPatrimonioLiquido=" + valorPatrimonioLiquido + ", codigoCVM=" + codigoCVM
				+ ", dataInicioSituacao=" + dataInicioSituacao + ", dataRegistro=" + dataRegistro + "]";
	}
	
}
