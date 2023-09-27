package br.com.brasilapi.api;

import java.sql.Timestamp;

public interface CPTECClimaAeroporto {
	/**
	 * Obtém o código ICAO do aeroporto.
	 */
	public String getCodigoIcao();
	/**
	 * Define o código ICAO do aeroporto.
	 */
	public void setCodigoIcao(String codigoIcao);
	/**
	 * Obtém a data de última atualização.
	 */
	public Timestamp getAtualizadoEm();
	/**
	 * Define a data de última atualização.
	 */
	public void setAtualizadoEm(Timestamp atualizadoEm);
	/**
	 * Obtém a pressão atmosférica medida na estação meteorológica do aeroporto expressa em hPa (Hectopascal).
	 */
	public Integer getPressaoAtmosferica();
	/**
	 * Define a pressão atmosférica medida na estação meteorológica do aeroporto expressa em hPa (Hectopascal).
	 */
	public void setPressaoAtmosferica(Integer pressaoAtmosferica);
	/**
	 * Obtém a condição atual de visibilidade em metros.
	 */
	public String getVisibilidade();
	/**
	 * Define a condição atual de visibilidade em metros.
	 */
	public void setVisibilidade(String visibilidade);
	/**
	 * Obtém a intensidade do vendo em km/h.
	 */
	public Integer getVento();
	/**
	 * Define a intensidade do vendo em km/h.
	 */
	public void setVento(Integer vento);
	/**
	 * Obtém a direção do vento em graus de (0° a 360°).
	 */
	public Integer getDirecaoVento();
	/**
	 * Define a direção do vento em graus de (0° a 360°).
	 */
	public void setDirecaoVento(Integer direcaoVento);
	/**
	 * Obtém a umidade relativa do ar em porcentagem.
	 */
	public Integer getUmidade();
	/**
	 * Define a umidade relativa do ar em porcentagem.
	 */
	public void setUmidade(Integer umidade);
	/**
	 * Obtém o código da condição meteorológica.
	 */
	public String getCondicao();
	/**
	 * Define o código da condição meteorológica.
	 */
	public void setCondicao(String condicao);
	/**
	 * Obtém o texto descritivo para a condição meteorológica.
	 */
	public String getCondicaoDesc();
	/**
	 * Define o texto descritivo para a condição meteorológica.
	 */
	public void setCondicaoDesc(String condicaoDesc);
	/**
	 * Obtém a temperatura (em graus celsius).
	 */
	public Float getTemp();
	/**
	 * Define a temperatura (em graus celsius).
	 */
	public void setTemp(Float temp);
}
