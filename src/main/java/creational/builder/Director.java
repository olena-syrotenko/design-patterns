package creational.builder;

/**
 * Director defines the order of building steps.
 */
public class Director {

	public Product makeCheapProduct(Product.Builder builder) {
		return builder.setPrice(10.).setDescription("Cheap product").setAmount(1).build();
	}

	public Product makeProductBySupplier(Product.Builder builder) {
		return builder.setDescription("Product by supplier").setSupplier(new Object()).build();
	}

}
