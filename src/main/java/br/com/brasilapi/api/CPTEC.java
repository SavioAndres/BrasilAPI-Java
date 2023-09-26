package br.com.brasilapi.api;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

public class CPTEC extends API implements CPTECLocalidade, CPTECClimaCapital, CPTECClimaAeroporto, CPTECPrevisaoMeteorologica, CPTECPrevisaoOceanica {
	private String nome;
	private String estado;
	private Integer id;
	private String codigoIcao;
	private Timestamp atualizadoEm;
	private String pressaoAtmosferica;
	private String visibilidade;
	private Integer vento;
	private Integer direcaoVento;
	private Integer umidade;
	private String condicao;
	private String condicaoDesc;
	private Integer temp;
	private String cidade;
	private Clima[] clima;
	private Onda[] ondas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoIcao() {
		return codigoIcao;
	}

	public void setCodigoIcao(String codigoIcao) {
		this.codigoIcao = codigoIcao;
	}

	public Timestamp getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Timestamp atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public String getPressaoAtmosferica() {
		return pressaoAtmosferica;
	}

	public void setPressaoAtmosferica(String pressaoAtmosferica) {
		this.pressaoAtmosferica = pressaoAtmosferica;
	}

	public String getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}

	public Integer getVento() {
		return vento;
	}

	public void setVento(Integer vento) {
		this.vento = vento;
	}

	public Integer getDirecaoVento() {
		return direcaoVento;
	}

	public void setDirecaoVento(Integer direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

	public Integer getUmidade() {
		return umidade;
	}

	public void setUmidade(Integer umidade) {
		this.umidade = umidade;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public String getCondicaoDesc() {
		return condicaoDesc;
	}

	public void setCondicaoDesc(String condicaoDesc) {
		this.condicaoDesc = condicaoDesc;
	}

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Clima[] getClima() {
		return clima;
	}

	public void setClima(Clima[] clima) {
		this.clima = clima;
	}

	public Onda[] getOndas() {
		return ondas;
	}

	public void setOndas(Onda[] ondas) {
		this.ondas = ondas;
	}

	@Override
	public String toString() {
		return "CPTEC [nome=" + nome + ", estado=" + estado + ", id=" + id + ", codigoIcao=" + codigoIcao
				+ ", atualizadoEm=" + atualizadoEm + ", pressaoAtmosferica=" + pressaoAtmosferica + ", visibilidade="
				+ visibilidade + ", vento=" + vento + ", direcaoVento=" + direcaoVento + ", umidade=" + umidade
				+ ", condicao=" + condicao + ", condicaoDesc=" + condicaoDesc + ", temp=" + temp + ", cidade=" + cidade
				+ ", clima=" + Arrays.toString(clima) + ", ondas=" + Arrays.toString(ondas) + "]";
	}

	class Clima {
		private Date data;
		private String condicao;
		private String condicaoDesc;
		private Integer min;
		private Integer max;
		private Integer indiceUV;
		
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public String getCondicao() {
			return condicao;
		}
		public void setCondicao(String condicao) {
			this.condicao = condicao;
		}
		public String getCondicaoDesc() {
			return condicaoDesc;
		}
		public void setCondicaoDesc(String condicaoDesc) {
			this.condicaoDesc = condicaoDesc;
		}
		public Integer getMin() {
			return min;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
		public Integer getIndiceUV() {
			return indiceUV;
		}
		public void setIndiceUV(Integer indiceUV) {
			this.indiceUV = indiceUV;
		}
		@Override
		public String toString() {
			return "Clima [data=" + data + ", condicao=" + condicao + ", condicaoDesc=" + condicaoDesc + ", min=" + min
					+ ", max=" + max + ", indiceUV=" + indiceUV + "]";
		}
	}
	
	class Onda {
		private Date data;
		private DadoOnda[] dados_ondas;
		
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public DadoOnda[] getDados_ondas() {
			return dados_ondas;
		}
		public void setDados_ondas(DadoOnda[] dados_ondas) {
			this.dados_ondas = dados_ondas;
		}
		@Override
		public String toString() {
			return "Onda [data=" + data + ", dados_ondas=" + Arrays.toString(dados_ondas) + "]";
		}
		
		
		class DadoOnda {
			private String hora;
			private Float vento;
			private String direcaoVento;
			private String direcaoVentoDesc;
			private Float alturaOnda;
			private String direcaoOnda;
			private String direcaoOndaDesc;
			private String agitation;
			
			public String getHora() {
				return hora;
			}
			public void setHora(String hora) {
				this.hora = hora;
			}
			public Float getVento() {
				return vento;
			}
			public void setVento(Float vento) {
				this.vento = vento;
			}
			public String getDirecaoVento() {
				return direcaoVento;
			}
			public void setDirecaoVento(String direcaoVento) {
				this.direcaoVento = direcaoVento;
			}
			public String getDirecaoVentoDesc() {
				return direcaoVentoDesc;
			}
			public void setDirecaoVentoDesc(String direcaoVentoDesc) {
				this.direcaoVentoDesc = direcaoVentoDesc;
			}
			public Float getAlturaOnda() {
				return alturaOnda;
			}
			public void setAlturaOnda(Float alturaOnda) {
				this.alturaOnda = alturaOnda;
			}
			public String getDirecaoOnda() {
				return direcaoOnda;
			}
			public void setDirecaoOnda(String direcaoOnda) {
				this.direcaoOnda = direcaoOnda;
			}
			public String getDirecaoOndaDesc() {
				return direcaoOndaDesc;
			}
			public void setDirecaoOndaDesc(String direcaoOndaDesc) {
				this.direcaoOndaDesc = direcaoOndaDesc;
			}
			public String getAgitation() {
				return agitation;
			}
			public void setAgitation(String agitation) {
				this.agitation = agitation;
			}
			@Override
			public String toString() {
				return "DadoOnda [hora=" + hora + ", vento=" + vento + ", direcaoVento=" + direcaoVento
						+ ", direcaoVentoDesc=" + direcaoVentoDesc + ", alturaOnda=" + alturaOnda + ", direcaoOnda="
						+ direcaoOnda + ", direcaoOndaDesc=" + direcaoOndaDesc + ", agitation=" + agitation + "]";
			}
		}
	}
	
}
