package br.com.brasilapi.api;

public class FipeTabelas extends API {
	private Integer codigo;
	private String mes;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		return "FipeTabelas [codigo=" + codigo + ", mes=" + mes + "]";
	}
	
}
