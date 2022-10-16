package br.com.brasilapi.api;

/**
 * Lista os feriados nacionais de determinado ano.
 * 
 * @author Sávio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/Feriados-Nacionais">https://brasilapi.com.br/docs#tag/Feriados-Nacionais</a>
 */
public class Feriados extends API {
	private String date;
	private String name;
	private String type;
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Feriados [date=" + date + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
