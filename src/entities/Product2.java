package entities;

public class Product2 {

	private String name2;
	private Double price2;

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public Double getPrice2() {
		return price2;
	}

	public Product2(String name2, Double price2) {
		super();
		this.name2 = name2;
		this.price2 = price2;
	}

	public void setPrice2(Double price2) {
		this.price2 = price2;
	}

	@Override
	public String toString() {
		return "Product [name=" + name2 + ", price=" + price2 + "]";
	}
}