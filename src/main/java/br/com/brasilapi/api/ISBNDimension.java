package br.com.brasilapi.api;

public class ISBNDimension {
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
	public String toString() {
		return "ISBNDimensions [width=" + width + ", height=" + height + ", unit=" + unit + "]";
	}

}
