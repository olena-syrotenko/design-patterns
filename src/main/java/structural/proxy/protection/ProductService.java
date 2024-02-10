package structural.proxy.protection;

import java.util.Collections;
import java.util.List;

public class ProductService implements IProductService {

	@Override
	public Object getProductById(Integer id) {
		System.out.println("Get product by id");
		return new Object();
	}

	@Override
	public List<Object> getAllProducts() {
		System.out.println("Get all products");
		return Collections.singletonList(new Object());
	}

	@Override
	public void addProduct(Object product) {
		System.out.println("Add product");
	}
}
