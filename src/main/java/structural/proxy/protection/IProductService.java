package structural.proxy.protection;

import java.util.List;

public interface IProductService {
	Object getProductById(Integer id);

	List<Object> getAllProducts();

	void addProduct(Object product);
}
