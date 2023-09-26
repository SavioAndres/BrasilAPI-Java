package br.com.brasilapi.api;

import java.util.Arrays;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Informações sobre livros publicados no Brasil (prefixo 65 ou 85) a partir do
 * ISBN, um sistema internacional de identificação de livros que utiliza números
 * para classificá-los por título, autor, país, editora e edição.
 * 
 * @author Sávio Andres
 * @see <a href=
 *      "https://brasilapi.com.br/docs#tag/ISBN">https://brasilapi.com.br/docs#tag/ISBN</a>
 */
public class ISBN extends API {
	private String isbn;
	private String title;
	private String subtitle;
	private String[] authors;
	private String publisher;
	private String synopsis;
	private Dimension dimensions;
	private Short year;
	private String format;
	@SerializedName("page_count")
	private Integer pageCount;
	private String[] subjects;
	private String location;
	@SerializedName("retail_price")
	private RetailPrice retailPrice;
	@SerializedName("cover_url")
	private String coverUrl;
	private String provider;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	public Short getYear() {
		return year;
	}

	public void setYear(Short year) {
		this.year = year;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public RetailPrice getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(RetailPrice retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Arrays.hashCode(subjects);
		result = prime * result + Objects.hash(coverUrl, dimensions, format, isbn, location, pageCount, provider,
				publisher, retailPrice, subtitle, synopsis, title, year);
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
		ISBN other = (ISBN) obj;
		return Arrays.equals(authors, other.authors) && Objects.equals(coverUrl, other.coverUrl)
				&& Objects.equals(dimensions, other.dimensions) && Objects.equals(format, other.format)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(location, other.location)
				&& Objects.equals(pageCount, other.pageCount) && Objects.equals(provider, other.provider)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(retailPrice, other.retailPrice)
				&& Arrays.equals(subjects, other.subjects) && Objects.equals(subtitle, other.subtitle)
				&& Objects.equals(synopsis, other.synopsis) && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "ISBN [isbn=" + isbn + ", title=" + title + ", subtitle=" + subtitle + ", authors="
				+ Arrays.toString(authors) + ", publisher=" + publisher + ", synopsis=" + synopsis + ", dimensions="
				+ dimensions + ", year=" + year + ", format=" + format + ", pageCount=" + pageCount + ", subjects="
				+ Arrays.toString(subjects) + ", location=" + location + ", retailPrice=" + retailPrice + ", coverUrl="
				+ coverUrl + ", provider=" + provider + "]";
	}

	public class Dimension {
		private Float width;
		private Float height;
		private String unit;

		public Float getWidth() {
			return width;
		}

		public void setWidth(Float width) {
			this.width = width;
		}

		public Float getHeight() {
			return height;
		}

		public void setHeight(Float height) {
			this.height = height;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(height, unit, width);
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
			Dimension other = (Dimension) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(height, other.height) && Objects.equals(unit, other.unit)
					&& Objects.equals(width, other.width);
		}

		@Override
		public String toString() {
			return "ISBNDimensions [width=" + width + ", height=" + height + ", unit=" + unit + "]";
		}

		private ISBN getEnclosingInstance() {
			return ISBN.this;
		}

	}

	
	public class RetailPrice {
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
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(amount, currency);
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
			RetailPrice other = (RetailPrice) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(amount, other.amount) && Objects.equals(currency, other.currency);
		}

		@Override
		public String toString() {
			return "ISBNRetailPrice [currency=" + currency + ", amount=" + amount + "]";
		}

		private ISBN getEnclosingInstance() {
			return ISBN.this;
		}

	}
	
}
