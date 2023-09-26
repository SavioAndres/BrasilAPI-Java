package br.com.brasilapi.api;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class CPTEC extends API implements CPTECCidade, CPTECClimaCapital, CPTECClimaAeroporto, CPTECClimaPrevisao, CPTECOnda {
	private String nome;
	private String estado;
	private Integer id;
	@SerializedName("codigo_icao")
	private String codigoIcao;
	@SerializedName("atualizado_em")
	private Timestamp atualizadoEm;
	@SerializedName("pressao_atmosferica")
	private Integer pressaoAtmosferica;
	private String visibilidade;
	private Integer vento;
	@SerializedName("direcao_vento")
	private Integer direcaoVento;
	private Integer umidade;
	private String condicao;
	@SerializedName("condicao_desc")
	private String condicaoDesc;
	private Float temp;
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

	/**
	 * Obtém o código ICAO do aeroporto.
	 */
	public String getCodigoIcao() {
		return codigoIcao;
	}

	/**
	 * Define o código ICAO do aeroporto.
	 */
	public void setCodigoIcao(String codigoIcao) {
		this.codigoIcao = codigoIcao;
	}

	/**
	 * Obtém a data de última atualização.
	 */
	public Timestamp getAtualizadoEm() {
		return atualizadoEm;
	}

	/**
	 * Define a data de última atualização.
	 */
	public void setAtualizadoEm(Timestamp atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}
	
	/**
	 * Obtém a pressão atmosférica medida na estação meteorológica do aeroporto expressa em hPa (Hectopascal).
	 */
	public Integer getPressaoAtmosferica() {
		return pressaoAtmosferica;
	}

	/**
	 * Define a pressão atmosférica medida na estação meteorológica do aeroporto expressa em hPa (Hectopascal).
	 */
	public void setPressaoAtmosferica(Integer pressaoAtmosferica) {
		this.pressaoAtmosferica = pressaoAtmosferica;
	}

	/**
	 * Obtém a condição atual de visibilidade em metros.
	 */
	public String getVisibilidade() {
		return visibilidade;
	}

	/**
	 * Define a condição atual de visibilidade em metros.
	 */
	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}

	/**
	 * Obtém a intensidade do vendo em km/h.
	 */
	public Integer getVento() {
		return vento;
	}

	/**
	 * Define a intensidade do vendo em km/h.
	 */
	public void setVento(Integer vento) {
		this.vento = vento;
	}

	/**
	 * Obtém a direção do vento em graus de (0° a 360°).
	 */
	public Integer getDirecaoVento() {
		return direcaoVento;
	}

	/**
	 * Define a direção do vento em graus de (0° a 360°).
	 */
	public void setDirecaoVento(Integer direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

	/**
	 * Obtém a umidade relativa do ar em porcentagem.
	 */
	public Integer getUmidade() {
		return umidade;
	}

	/**
	 * Define a umidade relativa do ar em porcentagem.
	 */
	public void setUmidade(Integer umidade) {
		this.umidade = umidade;
	}

	/**
	 * Obtém o código da condição meteorológica.
	 */
	public String getCondicao() {
		return condicao;
	}

	/**
	 * Define o código da condição meteorológica.
	 */
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	/**
	 * Obtém o texto descritivo para a condição meteorológica.
	 */
	public String getCondicaoDesc() {
		return condicaoDesc;
	}

	/**
	 * Define o texto descritivo para a condição meteorológica.
	 */
	public void setCondicaoDesc(String condicaoDesc) {
		this.condicaoDesc = condicaoDesc;
	}

	/**
	 * Obtém a temperatura (em graus celsius).
	 */
	public Float getTemp() {
		return temp;
	}

	/**
	 * Define a temperatura (em graus celsius).
	 */
	public void setTemp(Float temp) {
		this.temp = temp;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Obtém a lista com condições climáticas dia a dia.
	 */
	public Clima[] getClima() {
		return clima;
	}

	/**
	 * Define a lista com condições climáticas dia a dia.
	 */
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(clima);
		result = prime * result + Arrays.hashCode(ondas);
		result = prime * result + Objects.hash(atualizadoEm, cidade, codigoIcao, condicao, condicaoDesc, direcaoVento,
				estado, id, nome, pressaoAtmosferica, temp, umidade, vento, visibilidade);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPTEC other = (CPTEC) obj;
		return Objects.equals(atualizadoEm, other.atualizadoEm) && Objects.equals(cidade, other.cidade)
				&& Arrays.equals(clima, other.clima) && Objects.equals(codigoIcao, other.codigoIcao)
				&& Objects.equals(condicao, other.condicao) && Objects.equals(condicaoDesc, other.condicaoDesc)
				&& Objects.equals(direcaoVento, other.direcaoVento) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Arrays.equals(ondas, other.ondas)
				&& Objects.equals(pressaoAtmosferica, other.pressaoAtmosferica) && Objects.equals(temp, other.temp)
				&& Objects.equals(umidade, other.umidade) && Objects.equals(vento, other.vento)
				&& Objects.equals(visibilidade, other.visibilidade);
	}

	@Override
	public String toString() {
		return "CPTEC [nome=" + nome + ", estado=" + estado + ", id=" + id + ", codigoIcao=" + codigoIcao
				+ ", atualizadoEm=" + atualizadoEm + ", pressaoAtmosferica=" + pressaoAtmosferica + ", visibilidade="
				+ visibilidade + ", vento=" + vento + ", direcaoVento=" + direcaoVento + ", umidade=" + umidade
				+ ", condicao=" + condicao + ", condicaoDesc=" + condicaoDesc + ", temp=" + temp + ", cidade=" + cidade
				+ ", clima=" + Arrays.toString(clima) + ", ondas=" + Arrays.toString(ondas) + "]";
	}
	
	
	public class Clima {
		private Date data;
		private String condicao;
		@SerializedName("condicao_desc")
		private String condicaoDesc;
		private Integer min;
		private Integer max;
		@SerializedName("indice_uv")
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
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(condicao, condicaoDesc, data, indiceUV, max, min);
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Clima other = (Clima) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(condicao, other.condicao) && Objects.equals(condicaoDesc, other.condicaoDesc)
					&& Objects.equals(data, other.data) && Objects.equals(indiceUV, other.indiceUV)
					&& Objects.equals(max, other.max) && Objects.equals(min, other.min);
		}
		
		@Override
		public String toString() {
			return "Clima [data=" + data + ", condicao=" + condicao + ", condicaoDesc=" + condicaoDesc + ", min=" + min
					+ ", max=" + max + ", indiceUV=" + indiceUV + "]";
		}
		
		private CPTEC getEnclosingInstance() {
			return CPTEC.this;
		}
	}
	
	public class Onda {
		private Date data;
		@SerializedName("dados_ondas")
		private DadoOnda[] dadosOndas;
		
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public DadoOnda[] getDadosOndas() {
			return dadosOndas;
		}
		public void setDadosOndas(DadoOnda[] dadosOndas) {
			this.dadosOndas = dadosOndas;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Arrays.hashCode(dadosOndas);
			result = prime * result + Objects.hash(data);
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Onda other = (Onda) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Arrays.equals(dadosOndas, other.dadosOndas) && Objects.equals(data, other.data);
		}
		
		@Override
		public String toString() {
			return "Onda [data=" + data + ", dados_ondas=" + Arrays.toString(dadosOndas) + "]";
		}

		public class DadoOnda {
			private String hora;
			private Float vento;
			@SerializedName("direcao_vento")
			private String direcaoVento;
			@SerializedName("direcao_vento_desc")
			private String direcaoVentoDesc;
			@SerializedName("altura_onda")
			private Float alturaOnda;
			@SerializedName("direcao_onda")
			private String direcaoOnda;
			@SerializedName("direcao_onda_desc")
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
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + Objects.hash(agitation, alturaOnda, direcaoOnda, direcaoOndaDesc,
						direcaoVento, direcaoVentoDesc, hora, vento);
				return result;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				DadoOnda other = (DadoOnda) obj;
				if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
					return false;
				return Objects.equals(agitation, other.agitation) && Objects.equals(alturaOnda, other.alturaOnda)
						&& Objects.equals(direcaoOnda, other.direcaoOnda)
						&& Objects.equals(direcaoOndaDesc, other.direcaoOndaDesc)
						&& Objects.equals(direcaoVento, other.direcaoVento)
						&& Objects.equals(direcaoVentoDesc, other.direcaoVentoDesc) && Objects.equals(hora, other.hora)
						&& Objects.equals(vento, other.vento);
			}
			
			@Override
			public String toString() {
				return "DadoOnda [hora=" + hora + ", vento=" + vento + ", direcaoVento=" + direcaoVento
						+ ", direcaoVentoDesc=" + direcaoVentoDesc + ", alturaOnda=" + alturaOnda + ", direcaoOnda="
						+ direcaoOnda + ", direcaoOndaDesc=" + direcaoOndaDesc + ", agitation=" + agitation + "]";
			}
			
			private Onda getEnclosingInstance() {
				return Onda.this;
			}
		}

		private CPTEC getEnclosingInstance() {
			return CPTEC.this;
		}
	}
	
}
