package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Informações sobre estados provenientes do IBGE.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/IBGE">https://brasilapi.com.br/docs#tag/IBGE</a>
 */
public class IBGEUF extends API {
	private Integer id;
	private String sigla;
	private String nome;
	private IBGEUFRegiao regiao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public IBGEUFRegiao getRegiao() {
		return regiao;
	}

	public void setRegiao(IBGEUFRegiao regiao) {
		this.regiao = regiao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, regiao, sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IBGEUF other = (IBGEUF) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(regiao, other.regiao)
				&& Objects.equals(sigla, other.sigla);
	}

	@Override
	public String toString() {
		return "IbgeUf [id=" + id + ", sigla=" + sigla + ", nome=" + nome + ", regiao=" + regiao + "]";
	}

	public class IBGEUFRegiao {
		private Integer id;
		private String sigla;
		private String nome;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSigla() {
			return sigla;
		}

		public void setSigla(String sigla) {
			this.sigla = sigla;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(id, nome, sigla);
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
			IBGEUFRegiao other = (IBGEUFRegiao) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
					&& Objects.equals(sigla, other.sigla);
		}

		@Override
		public String toString() {
			return "IbgeUfRegiao [id=" + id + ", sigla=" + sigla + ", nome=" + nome + "]";
		}

		private IBGEUF getEnclosingInstance() {
			return IBGEUF.this;
		}

	}
	
}
