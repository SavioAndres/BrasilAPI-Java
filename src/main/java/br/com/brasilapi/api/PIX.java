package br.com.brasilapi.api;

import java.sql.Timestamp;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Informações referentes ao PIX.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/PIX">https://brasilapi.com.br/docs#tag/PIX</a>
 */
public class PIX extends API {
	private String ispb;
	private String nome;
	@SerializedName("nome_reduzido")
	private String nomeReduzido;
	@SerializedName("modalidade_participacao")
	private String modalidadeParticipacao;
	@SerializedName("tipo_participacao")
	private String tipoParticipacao;
	@SerializedName("inicio_operacao")
	private Timestamp inicioOperacao;
	
	public String getIspb() {
		return ispb;
	}
	
	public void setIspb(String ispb) {
		this.ispb = ispb;
	}
	
	/**
	 * Obtém o nome do participante.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome do participante.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtém o nome reduzido do participante.
	 */
	public String getNomeReduzido() {
		return nomeReduzido;
	}
	
	/**
	 * Define o nome reduzido do participante.
	 */
	public void setNomeReduzido(String nomeReduzido) {
		this.nomeReduzido = nomeReduzido;
	}
	
	/**
	 * Obtém a modalidade de Participação.
	 */
	public String getModalidadeParticipacao() {
		return modalidadeParticipacao;
	}
	
	/**
	 * Define a modalidade de Participação.
	 */
	public void setModalidadeParticipacao(String modalidadeParticipacao) {
		this.modalidadeParticipacao = modalidadeParticipacao;
	}
	
	/**
	 * Obtém o tipo de participante.
	 */
	public String getTipoParticipacao() {
		return tipoParticipacao;
	}
	
	/**
	 * Define o tipo de participante.
	 */
	public void setTipoParticipacao(String tipoParticipacao) {
		this.tipoParticipacao = tipoParticipacao;
	}
	
	/**
	 * Obtém a data de inicio da operação
	 */
	public Timestamp getInicioOperacao() {
		return inicioOperacao;
	}
	
	/**
	 * Define a data de inicio da operação
	 */
	public void setInicioOperacao(Timestamp inicioOperacao) {
		this.inicioOperacao = inicioOperacao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(inicioOperacao, ispb, modalidadeParticipacao, nome, nomeReduzido, tipoParticipacao);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PIX other = (PIX) obj;
		return Objects.equals(inicioOperacao, other.inicioOperacao) && Objects.equals(ispb, other.ispb)
				&& Objects.equals(modalidadeParticipacao, other.modalidadeParticipacao)
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeReduzido, other.nomeReduzido)
				&& Objects.equals(tipoParticipacao, other.tipoParticipacao);
	}

	@Override
	public String toString() {
		return "PIX [ispb=" + ispb + ", nome=" + nome + ", nomeReduzido=" + nomeReduzido + ", modalidadeParticipacao="
				+ modalidadeParticipacao + ", tipoParticipacao=" + tipoParticipacao + ", inicioOperacao="
				+ inicioOperacao + "]";
	}

}
