package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Retorna informações de todos os bancos do Brasil.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/BANKS">https://brasilapi.com.br/docs#tag/BANKS</a>
 */
public class Bank extends API {
	private String ispb;
	private String name;
	private String code;
	private String fullName;

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, fullName, ispb, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(code, other.code) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(ispb, other.ispb) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Banks [ispb=" + ispb + ", name=" + name + ", code=" + code + ", fullName=" + fullName + "]";
	}

}
