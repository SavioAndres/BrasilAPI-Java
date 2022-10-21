package br.com.brasilapi.api;

public class ISBNRetailPrice {
	private String currency;
	private Float amount;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "ISBNRetailPrice [currency=" + currency + ", amount=" + amount + "]";
	}
	
}
