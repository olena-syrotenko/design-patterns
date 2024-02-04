package creational.builder;

public class Product {
	private Integer id;
	private String name;
	private String description;
	private Object supplier;
	private Integer amount;
	private Double price;
	private Double price2;

	public static class Builder implements IBuilder<Product> {
		private Integer id;
		private String name;
		private String description;
		private Object supplier;
		private Integer amount;
		private Double price;

		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder setSupplier(Object supplier) {
			this.supplier = supplier;
			return this;
		}

		public Builder setAmount(Integer amount) {
			this.amount = amount;
			return this;
		}

		public Builder setPrice(Double price) {
			this.price = price;
			return this;
		}

		public Product build() {
			Product product = new Product();
			product.setId(id);
			product.setAmount(amount);
			product.setName(name);
			product.setDescription(description);
			product.setSupplier(supplier);
			product.setPrice(price);
			return product;
		}

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getSupplier() {
		return supplier;
	}

	public void setSupplier(Object supplier) {
		this.supplier = supplier;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
