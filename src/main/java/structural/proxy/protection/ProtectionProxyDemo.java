package structural.proxy.protection;

public class ProtectionProxyDemo {
	public static void main(String[] args) {
		// if user role is simple user
		System.out.println("Call add method of basic service");
		IProductService productService = new ProductService();
		productService.addProduct(new Object());

		System.out.println("Call method of proxy service");
		IProductService proxyProductService = new ProductServiceProxy();
		proxyProductService.addProduct(new Object());
	}

}
