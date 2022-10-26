package br.com.brasilapi.api;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

/**
 * Avalia um dominio no registro.br
 * 
 * @author Sávio Andres
 * @see https://brasilapi.com.br/docs#tag/REGISTRO-BR
 */
public class RegistroBR extends API {
	@SerializedName("status_code")
	private Integer statusCode;
	private String status;
	private String fqdn;
	private String fqdnace;
	private Boolean exempt;
	private String[] hosts;
	@SerializedName("publication-status")
	private String publicationStatus;
	@SerializedName("expires-at")
	private String expiresAt;
	private String[] suggestions;
	
	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFqdn() {
		return fqdn;
	}

	public void setFqdn(String fqdn) {
		this.fqdn = fqdn;
	}

	public String getFqdnace() {
		return fqdnace;
	}

	public void setFqdnace(String fqdnace) {
		this.fqdnace = fqdnace;
	}

	public Boolean getExempt() {
		return exempt;
	}

	public void setExempt(Boolean exempt) {
		this.exempt = exempt;
	}

	public String[] getHosts() {
		return hosts;
	}

	public void setHosts(String[] hosts) {
		this.hosts = hosts;
	}

	public String getPublicationStatus() {
		return publicationStatus;
	}

	public void setPublicationStatus(String publicationStatus) {
		this.publicationStatus = publicationStatus;
	}

	public String getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}

	public String[] getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String[] suggestions) {
		this.suggestions = suggestions;
	}

	@Override
	public String toString() {
		return "RegistroBR [statusCode=" + statusCode + ", status=" + status + ", fqdn=" + fqdn + ", fqdnace=" + fqdnace
				+ ", exempt=" + exempt + ", hosts=" + Arrays.toString(hosts) + ", publicationStatus="
				+ publicationStatus + ", expiresAt=" + expiresAt + ", suggestions=" + Arrays.toString(suggestions)
				+ "]";
	}
	
	
}
