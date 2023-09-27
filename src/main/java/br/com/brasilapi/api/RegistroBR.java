package br.com.brasilapi.api;

import java.util.Arrays;
import java.util.Objects;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(hosts);
		result = prime * result + Arrays.hashCode(suggestions);
		result = prime * result + Objects.hash(exempt, expiresAt, fqdn, fqdnace, publicationStatus, status, statusCode);
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
		RegistroBR other = (RegistroBR) obj;
		return Objects.equals(exempt, other.exempt) && Objects.equals(expiresAt, other.expiresAt)
				&& Objects.equals(fqdn, other.fqdn) && Objects.equals(fqdnace, other.fqdnace)
				&& Arrays.equals(hosts, other.hosts) && Objects.equals(publicationStatus, other.publicationStatus)
				&& Objects.equals(status, other.status) && Objects.equals(statusCode, other.statusCode)
				&& Arrays.equals(suggestions, other.suggestions);
	}

	@Override
	public String toString() {
		return "RegistroBR [statusCode=" + statusCode + ", status=" + status + ", fqdn=" + fqdn + ", fqdnace=" + fqdnace
				+ ", exempt=" + exempt + ", hosts=" + Arrays.toString(hosts) + ", publicationStatus="
				+ publicationStatus + ", expiresAt=" + expiresAt + ", suggestions=" + Arrays.toString(suggestions)
				+ "]";
	}

}
