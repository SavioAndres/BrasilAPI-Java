package br.com.brasilapi.api;

/**
 * Lista as tabelas de referência existentes. FIPE (Fundação
 * Instituto de Pesquisas Econômicas).
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/FIPE">https://brasilapi.com.br/docs#tag/FIPE</a>
 */
public class FipeTabela extends API {
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
