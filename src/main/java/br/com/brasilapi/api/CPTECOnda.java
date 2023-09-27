package br.com.brasilapi.api;

import java.sql.Timestamp;

import br.com.brasilapi.api.CPTEC.Onda;

/**
 * Retorna a previsão oceânica para a cidade informada para um período de, até, 6 dias.
 * 
 * @version 1
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CPTEC">https://brasilapi.com.br/docs#tag/CPTEC</a>
 */
public interface CPTECOnda {
	public String getCidade();
	public void setCidade(String cidade);
	public String getEstado();
	public void setEstado(String estado);
	public Timestamp getAtualizadoEm();
	public void setAtualizadoEm(Timestamp atualizadoEm);
	public Onda[] getOndas();
	public void setOndas(Onda[] ondas);
}
