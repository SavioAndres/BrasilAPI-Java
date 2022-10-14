package br.com.brasilapi.api;

public class NCM {
	private String codigo;
	private String descricao;
	private String data_inicio;
	private String data_fim;
	private String tipo_ato;
	private String numero_ato;
	private String ano_ato;
	
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
		return data_inicio;
	}
	public void setDataInicio(String dataInicio) {
		this.data_inicio = dataInicio;
	}
	public String getDataFim() {
		return data_fim;
	}
	public void setDataFim(String dataFim) {
		this.data_fim = dataFim;
	}
	public String getTipo_ato() {
		return tipo_ato;
	}
	public void setTipoAto(String tipoAto) {
		this.tipo_ato = tipoAto;
	}
	public String getNumeroAto() {
		return numero_ato;
	}
	public void setNumeroAto(String numeroAto) {
		this.numero_ato = numeroAto;
	}
	public String getAnoAto() {
		return ano_ato;
	}
	public void setAnoAto(String anoAto) {
		this.ano_ato = anoAto;
	}
	@Override
	public String toString() {
		return "NCM [codigo=" + codigo + ", descricao=" + descricao + ", data_inicio=" + data_inicio + ", data_fim="
				+ data_fim + ", tipo_ato=" + tipo_ato + ", numero_ato=" + numero_ato + ", ano_ato=" + ano_ato + "]";
	}
	
	
}
