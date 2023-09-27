package br.com.brasilapi.api;

import java.util.Objects;

/**
 * Classe CEP2. Representa o CEP com seus atributos.
 * 
 * O CEP (Código de Endereçamento Postal) é um sistema de códigos que visa
 * racionalizar o processo de encaminhamento e entrega de correspondências
 * através da divisão do paás em regiões postais. ... Atualmente, o CEP é
 * composto por oito dígitos, cinco de um lado e três de outro. Cada algarismo
 * do CEP possui um significado.
 * 
 * @author Sávio Andres
 * @version 2
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/CEP-V2">https://brasilapi.com.br/docs#tag/CEP-V2</a>
 */
public class CEP2 extends API {
	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	private Location location;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, city, location, neighborhood, service, state, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEP2 other = (CEP2) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(city, other.city)
				&& Objects.equals(location, other.location) && Objects.equals(neighborhood, other.neighborhood)
				&& Objects.equals(service, other.service) && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", state=" + state + ", city=" + city + ", neighborhood=" + neighborhood
				+ ", street=" + street + ", service=" + service + ", location=" + location + "]";
	}
	
	public class Location {
		private String type;
		private Coordinates coordinates;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Coordinates getCoordinates() {
			return coordinates;
		}

		public void setCoordinates(Coordinates coordinates) {
			this.coordinates = coordinates;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(coordinates, type);
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
			Location other = (Location) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(coordinates, other.coordinates) && Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "Location [type=" + type + ", coordinates=" + coordinates + "]";
		}
		
		
		public class Coordinates {
			private String longitude;
			private String latitude;

			public String getLongitude() {
				return longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			public String getLatitude() {
				return latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + Objects.hash(latitude, longitude);
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
				Coordinates other = (Coordinates) obj;
				if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
					return false;
				return Objects.equals(latitude, other.latitude) && Objects.equals(longitude, other.longitude);
			}

			@Override
			public String toString() {
				return "Coordinates [longitude=" + longitude + ", latitude=" + latitude + "]";
			}

			private Location getEnclosingInstance() {
				return Location.this;
			}

		}


		private CEP2 getEnclosingInstance() {
			return CEP2.this;
		}

	}
	
}
