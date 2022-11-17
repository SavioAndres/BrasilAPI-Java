package br.com.brasilapi.api;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

/**
 * O Cadastro Nacional da Pessoa Jurídica é um número único que identifica uma
 * pessoa jurídica e outros tipos de arranjo jurídico sem personalidade jurídica
 * junto à Receita Federal.
 * 
 * @version 1
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CNPJ">https://brasilapi.com.br/docs#tag/CNPJ</a>
 */
public class CNPJ extends API {
	private String uf;
	private String cep;
	private CNPJQsa[] qsa;
	private String cnpj;
	private String pais;
	private String email;
	private String porte;
	private String bairro;
	private String numero;
	@SerializedName("ddd_fax")
	private String dddFax;
	private String municipio;
	private String logradouro;
	@SerializedName("cnae_fiscal")
	private Integer cnaeFiscal;
	@SerializedName("codigo_pais")
	private Integer codigoPais;
	private String complemento;
	@SerializedName("codigo_porte")
	private Integer codigoPorte;
	@SerializedName("razao_social")
	private String razaoSocial;
	@SerializedName("nome_fantasia")
	private String nomeFantasia;
	@SerializedName("capital_social")
	private Double capitalSocial;
	@SerializedName("ddd_telefone_1")
	private String dddTelefone1;
	@SerializedName("ddd_telefone_2")
	private String dddTelefone2;
	@SerializedName("opcao_pelo_mei")
	private String opcaoPeloMei;
	@SerializedName("descricao_porte")
	private String descricaoPorte;
	@SerializedName("codigo_municipio")
	private Integer codigoMunicipio;
	@SerializedName("cnaes_secundarios")
	private CNPJCnaesSecundario[] cnaesSecundarios;
	@SerializedName("natureza_juridica")
	private String naturezaJuridica;
	@SerializedName("situacao_especial")
	private String situacaoEspecial;
	@SerializedName("opcao_pelo_simples")
	private String opcaoPeloSimples;
	@SerializedName("situacao_cadastral")
	private Integer situacaoCadastral;
	@SerializedName("data_opcao_pelo_mei")
	private String dataOpcaoPeloMei;
	@SerializedName("data_exclusao_do_mei")
	private String dataExclusaoDoMei;
	@SerializedName("cnae_fiscal_descricao")
	private String cnaeFiscalDescricao;
	@SerializedName("codigo_municipio_ibge")
	private Integer codigoMunicipioIbge;
	@SerializedName("data_inicio_atividade")
	private String dataInicioAtividade;
	@SerializedName("data_situacao_especial")
	private String dataSituacaoEspecial;
	@SerializedName("data_opcao_pelo_simples")
	private String dataOpcaoPeloSimples;
	@SerializedName("data_situacao_cadastral")
	private String dataSituacaoCadastral;
	@SerializedName("nome_cidade_no_exterior")
	private String nomeCidadeNoExterior;
	@SerializedName("codigo_natureza_juridica")
	private Integer codigoNaturezaJuridica;
	@SerializedName("data_exclusao_do_simples")
	private String dataExclusaoDoSimples;
	@SerializedName("motivo_situacao_cadastral")
	private Integer motivoSituacaoCadastral;
	@SerializedName("ente_federativo_responsavel")
	private String enteFederativoResponsavel;
	@SerializedName("identificador_matriz_filial")
	private Integer identificadorMatrizFilial;
	@SerializedName("qualificacao_do_responsavel")
	private Integer qualificacaoDoResponsavel;
	@SerializedName("descricao_situacao_cadastral")
	private String descricaoSituacaoCadastral;
	@SerializedName("descricao_tipo_de_logradouro")
	private String descricaoTipoDeLogradouro;
	@SerializedName("descricao_motivo_situacao_cadastral")
	private String descricaoMotivoSituacaoCadastral;
	@SerializedName("descricao_identificador_matriz_filial")
	private String descricaoIdentificadorMatrizFilial;

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public CNPJQsa[] getQsa() {
		return qsa;
	}

	public void setQsa(CNPJQsa[] qsa) {
		this.qsa = qsa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDddFax() {
		return dddFax;
	}

	public void setDddFax(String dddFax) {
		this.dddFax = dddFax;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCnaeFiscal() {
		return cnaeFiscal;
	}

	public void setCnaeFiscal(Integer cnaeFiscal) {
		this.cnaeFiscal = cnaeFiscal;
	}

	public Integer getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getCodigoPorte() {
		return codigoPorte;
	}

	public void setCodigoPorte(Integer codigoPorte) {
		this.codigoPorte = codigoPorte;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(Double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public String getDddTelefone1() {
		return dddTelefone1;
	}

	public void setDddTelefone1(String dddTelefone1) {
		this.dddTelefone1 = dddTelefone1;
	}

	public String getDddTelefone2() {
		return dddTelefone2;
	}

	public void setDddTelefone2(String dddTelefone2) {
		this.dddTelefone2 = dddTelefone2;
	}

	public String getOpcaoPeloMei() {
		return opcaoPeloMei;
	}

	public void setOpcaoPeloMei(String opcaoPeloMei) {
		this.opcaoPeloMei = opcaoPeloMei;
	}

	public String getDescricaoPorte() {
		return descricaoPorte;
	}

	public void setDescricaoPorte(String descricaoPorte) {
		this.descricaoPorte = descricaoPorte;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public CNPJCnaesSecundario[] getCnaesSecundarios() {
		return cnaesSecundarios;
	}

	public void setCnaesSecundarios(CNPJCnaesSecundario[] cnaesSecundarios) {
		this.cnaesSecundarios = cnaesSecundarios;
	}

	public String getNaturezaJuridica() {
		return naturezaJuridica;
	}

	public void setNaturezaJuridica(String naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

	public String getSituacaoEspecial() {
		return situacaoEspecial;
	}

	public void setSituacaoEspecial(String situacaoEspecial) {
		this.situacaoEspecial = situacaoEspecial;
	}

	public String getOpcaoPeloSimples() {
		return opcaoPeloSimples;
	}

	public void setOpcaoPeloSimples(String opcaoPeloSimples) {
		this.opcaoPeloSimples = opcaoPeloSimples;
	}

	public Integer getSituacaoCadastral() {
		return situacaoCadastral;
	}

	public void setSituacaoCadastral(Integer situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}

	public String getDataOpcaoPeloMei() {
		return dataOpcaoPeloMei;
	}

	public void setDataOpcaoPeloMei(String dataOpcaoPeloMei) {
		this.dataOpcaoPeloMei = dataOpcaoPeloMei;
	}

	public String getDataExclusaoDoMei() {
		return dataExclusaoDoMei;
	}

	public void setDataExclusaoDoMei(String dataExclusaoDoMei) {
		this.dataExclusaoDoMei = dataExclusaoDoMei;
	}

	public String getCnaeFiscalDescricao() {
		return cnaeFiscalDescricao;
	}

	public void setCnaeFiscalDescricao(String cnaeFiscalDescricao) {
		this.cnaeFiscalDescricao = cnaeFiscalDescricao;
	}

	public Integer getCodigoMunicipioIbge() {
		return codigoMunicipioIbge;
	}

	public void setCodigoMunicipioIbge(Integer codigoMunicipioIbge) {
		this.codigoMunicipioIbge = codigoMunicipioIbge;
	}

	public String getDataInicioAtividade() {
		return dataInicioAtividade;
	}

	public void setDataInicioAtividade(String dataInicioAtividade) {
		this.dataInicioAtividade = dataInicioAtividade;
	}

	public String getDataSituacaoEspecial() {
		return dataSituacaoEspecial;
	}

	public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
		this.dataSituacaoEspecial = dataSituacaoEspecial;
	}

	public String getDataOpcaoPeloSimples() {
		return dataOpcaoPeloSimples;
	}

	public void setDataOpcaoPeloSimples(String dataOpcaoPeloSimples) {
		this.dataOpcaoPeloSimples = dataOpcaoPeloSimples;
	}

	public String getDataSituacaoCadastral() {
		return dataSituacaoCadastral;
	}

	public void setDataSituacaoCadastral(String dataSituacaoCadastral) {
		this.dataSituacaoCadastral = dataSituacaoCadastral;
	}

	public String getNomeCidadeNoExterior() {
		return nomeCidadeNoExterior;
	}

	public void setNomeCidadeNoExterior(String nomeCidadeNoExterior) {
		this.nomeCidadeNoExterior = nomeCidadeNoExterior;
	}

	public Integer getCodigoNaturezaJuridica() {
		return codigoNaturezaJuridica;
	}

	public void setCodigoNaturezaJuridica(Integer codigoNaturezaJuridica) {
		this.codigoNaturezaJuridica = codigoNaturezaJuridica;
	}

	public String getDataExclusaoDoSimples() {
		return dataExclusaoDoSimples;
	}

	public void setDataExclusaoDoSimples(String dataExclusaoDoSimples) {
		this.dataExclusaoDoSimples = dataExclusaoDoSimples;
	}

	public Integer getMotivoSituacaoCadastral() {
		return motivoSituacaoCadastral;
	}

	public void setMotivoSituacaoCadastral(Integer motivoSituacaoCadastral) {
		this.motivoSituacaoCadastral = motivoSituacaoCadastral;
	}

	public String getEnteFederativoResponsavel() {
		return enteFederativoResponsavel;
	}

	public void setEnteFederativoResponsavel(String enteFederativoResponsavel) {
		this.enteFederativoResponsavel = enteFederativoResponsavel;
	}

	public Integer getIdentificadorMatrizFilial() {
		return identificadorMatrizFilial;
	}

	public void setIdentificadorMatrizFilial(Integer identificadorMatrizFilial) {
		this.identificadorMatrizFilial = identificadorMatrizFilial;
	}

	public Integer getQualificacaoDoResponsavel() {
		return qualificacaoDoResponsavel;
	}

	public void setQualificacaoDoResponsavel(Integer qualificacaoDoResponsavel) {
		this.qualificacaoDoResponsavel = qualificacaoDoResponsavel;
	}

	public String getDescricaoSituacaoCadastral() {
		return descricaoSituacaoCadastral;
	}

	public void setDescricaoSituacaoCadastral(String descricaoSituacaoCadastral) {
		this.descricaoSituacaoCadastral = descricaoSituacaoCadastral;
	}

	public String getDescricaoTipoDeLogradouro() {
		return descricaoTipoDeLogradouro;
	}

	public void setDescricaoTipoDeLogradouro(String descricaoTipoDeLogradouro) {
		this.descricaoTipoDeLogradouro = descricaoTipoDeLogradouro;
	}

	public String getDescricaoMotivoSituacaoCadastral() {
		return descricaoMotivoSituacaoCadastral;
	}

	public void setDescricaoMotivoSituacaoCadastral(String descricaoMotivoSituacaoCadastral) {
		this.descricaoMotivoSituacaoCadastral = descricaoMotivoSituacaoCadastral;
	}

	public String getDescricaoIdentificadorMatrizFilial() {
		return descricaoIdentificadorMatrizFilial;
	}

	public void setDescricaoIdentificadorMatrizFilial(String descricaoIdentificadorMatrizFilial) {
		this.descricaoIdentificadorMatrizFilial = descricaoIdentificadorMatrizFilial;
	}

	@Override
	public String toString() {
		return "CNPJ [uf=" + uf + ", cep=" + cep + ", qsa=" + Arrays.toString(qsa) + ", cnpj=" + cnpj + ", pais=" + pais
				+ ", email=" + email + ", porte=" + porte + ", bairro=" + bairro + ", numero=" + numero + ", dddFax="
				+ dddFax + ", municipio=" + municipio + ", logradouro=" + logradouro + ", cnaeFiscal=" + cnaeFiscal
				+ ", codigoPais=" + codigoPais + ", complemento=" + complemento + ", codigoPorte=" + codigoPorte
				+ ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", capitalSocial=" + capitalSocial
				+ ", dddTelefone1=" + dddTelefone1 + ", dddTelefone2=" + dddTelefone2 + ", opcaoPeloMei=" + opcaoPeloMei
				+ ", descricaoPorte=" + descricaoPorte + ", codigoMunicipio=" + codigoMunicipio + ", cnaesSecundarios="
				+ Arrays.toString(cnaesSecundarios) + ", naturezaJuridica=" + naturezaJuridica + ", situacaoEspecial="
				+ situacaoEspecial + ", opcaoPeloSimples=" + opcaoPeloSimples + ", situacaoCadastral="
				+ situacaoCadastral + ", dataOpcaoPeloMei=" + dataOpcaoPeloMei + ", dataExclusaoDoMei="
				+ dataExclusaoDoMei + ", cnaeFiscalDescricao=" + cnaeFiscalDescricao + ", codigoMunicipioIbge="
				+ codigoMunicipioIbge + ", dataInicioAtividade=" + dataInicioAtividade + ", dataSituacaoEspecial="
				+ dataSituacaoEspecial + ", dataOpcaoPeloSimples=" + dataOpcaoPeloSimples + ", dataSituacaoCadastral="
				+ dataSituacaoCadastral + ", nomeCidadeNoExterior=" + nomeCidadeNoExterior + ", codigoNaturezaJuridica="
				+ codigoNaturezaJuridica + ", dataExclusaoDoSimples=" + dataExclusaoDoSimples
				+ ", motivoSituacaoCadastral=" + motivoSituacaoCadastral + ", enteFederativoResponsavel="
				+ enteFederativoResponsavel + ", identificadorMatrizFilial=" + identificadorMatrizFilial
				+ ", qualificacaoDoResponsavel=" + qualificacaoDoResponsavel + ", descricaoSituacaoCadastral="
				+ descricaoSituacaoCadastral + ", descricaoTipoDeLogradouro=" + descricaoTipoDeLogradouro
				+ ", descricaoMotivoSituacaoCadastral=" + descricaoMotivoSituacaoCadastral
				+ ", descricaoIdentificadorMatrizFilial=" + descricaoIdentificadorMatrizFilial + "]";
	}

}
