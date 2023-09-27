package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Lista os feriados nacionais de determinado ano.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/Feriados-Nacionais">https://brasilapi.com.br/docs#tag/Feriados-Nacionais</a>
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
	public int hashCode() {
		return Objects.hash(date, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feriados other = (Feriados) obj;
		return Objects.equals(date, other.date) && Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Feriados [date=" + date + ", name=" + name + ", type=" + type + "]";
	}

}
