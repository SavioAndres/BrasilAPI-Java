package br.com.brasilapi.api;

class API implements Cloneable {
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
