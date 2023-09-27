package br.com.brasilapi.api;

import java.sql.Timestamp;

import br.com.brasilapi.api.CPTEC.Clima;

/**
 * Retorna a previsão meteorológica para a cidade informada para um 
 * período de 1 até 6 dias. Devido a inconsistências encontradas 
 * nos retornos da CPTEC nossa API só consegue retornar com 
 * precisão o período máximo de 6 dias.
 * 
 * @version 1
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CPTEC">https://brasilapi.com.br/docs#tag/CPTEC</a>
 */
public interface CPTECClimaPrevisao {
	public String getCidade();
	public void setCidade(String cidade);
	public String getEstado();
	public void setEstado(String estado);
	public Timestamp getAtualizadoEm();
	public void setAtualizadoEm(Timestamp atualizadoEm);
	public Clima[] getClima();
}
