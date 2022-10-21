package br.com.brasilapi.api;

/**
 * Retorna informações de todos os bancos do Brasil.
 * @author Sávio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/BANKS">https://brasilapi.com.br/docs#tag/BANKS</a>
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
	public String toString() {
		return "Banks [ispb=" + ispb + ", name=" + name + ", code=" + code + ", fullName=" + fullName + "]";
	}
	
	
}
