package br.com.brasilapi.api;

import java.sql.Timestamp;

public interface CPTECClimaCapital {
	public String getCodigoIcao();
	public void setCodigoIcao(String codigoIcao);
	public Timestamp getAtualizadoEm();
	public void setAtualizadoEm(Timestamp atualizadoEm);
	public String getPressaoAtmosferica();
	public void setPressaoAtmosferica(String pressaoAtmosferica);
	public String getVisibilidade();
	public void setVisibilidade(String visibilidade);
	public Integer getVento();
	public void setVento(Integer vento);
	public Integer getDirecaoVento();
	public void setDirecaoVento(Integer direcaoVento);
	public Integer getUmidade();
	public void setUmidade(Integer umidade);
	public String getCondicao();
	public void setCondicao(String condicao);
	public String getCondicaoDesc();
	public void setCondicaoDesc(String condicaoDesc);
	public Integer getTemp();
	public void setTemp(Integer temp);
}
