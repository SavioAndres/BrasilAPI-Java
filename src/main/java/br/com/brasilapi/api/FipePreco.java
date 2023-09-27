package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Informações sobre Preço Médio de Veículos fornecido pela FIPE (Fundação
 * Instituto de Pesquisas Econômicas).
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/FIPE">https://brasilapi.com.br/docs#tag/FIPE</a>
 */
public class FipePreco extends API {
	private String valor;
	private String marca;
	private String modelo;
	private String anoModelo;
	private String combustivel;
	private String codigoFipe;
	private String mesReferencia;
	private String tipoVeiculo;
	private String siglaCombustivel;
	private String dataConsulta;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getCodigoFipe() {
		return codigoFipe;
	}

	public void setCodigoFipe(String codigoFipe) {
		this.codigoFipe = codigoFipe;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getSiglaCombustivel() {
		return siglaCombustivel;
	}

	public void setSiglaCombustivel(String siglaCombustivel) {
		this.siglaCombustivel = siglaCombustivel;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoModelo, codigoFipe, combustivel, dataConsulta, marca, mesReferencia, modelo,
				siglaCombustivel, tipoVeiculo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FipePreco other = (FipePreco) obj;
		return Objects.equals(anoModelo, other.anoModelo) && Objects.equals(codigoFipe, other.codigoFipe)
				&& Objects.equals(combustivel, other.combustivel) && Objects.equals(dataConsulta, other.dataConsulta)
				&& Objects.equals(marca, other.marca) && Objects.equals(mesReferencia, other.mesReferencia)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(siglaCombustivel, other.siglaCombustivel)
				&& Objects.equals(tipoVeiculo, other.tipoVeiculo) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "FipePreco [valor=" + valor + ", marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo
				+ ", combustivel=" + combustivel + ", codigoFipe=" + codigoFipe + ", mesReferencia=" + mesReferencia
				+ ", tipoVeiculo=" + tipoVeiculo + ", siglaCombustivel=" + siglaCombustivel + ", dataConsulta="
				+ dataConsulta + "]";
	}

}
