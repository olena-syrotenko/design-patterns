package structural.proxy.protection;

import java.util.List;

public class ProductServiceProxy implements IProductService {

	private final SecurityContextHolder securityContextHolder;
	private final ProductService productService;

	public ProductServiceProxy() {
		// mock autowired process
		productService = new ProductService();
		securityContextHolder = new SecurityContextHolder();
	}

	@Override
	public Object getProductById(Integer id) {
		return productService.getProductById(id);
	}

	@Override
	public List<Object> getAllProducts() {
		return productService.getAllProducts();
	}

	@Override
	public void addProduct(Object product) {
		if (checkAdminAccess(securityContextHolder.getUserRole())) {
			productService.addProduct(product);
		} else {
			System.out.println("addProduct: Access denied.");
		}
	}

	private boolean checkAdminAccess(UserRole userRole) {
		return UserRole.ADMIN.equals(userRole);
	}
}
