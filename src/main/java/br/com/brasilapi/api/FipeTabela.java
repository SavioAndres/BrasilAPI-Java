package br.com.brasilapi.api;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(codigo, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FipeTabela other = (FipeTabela) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(mes, other.mes);
	}

	@Override
	public String toString() {
		return "FipeTabelas [codigo=" + codigo + ", mes=" + mes + "]";
	}

}
