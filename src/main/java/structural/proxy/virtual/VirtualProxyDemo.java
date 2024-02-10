package structural.proxy.virtual;

public class VirtualProxyDemo {
	public static void main(String[] args) {
		// in this case image will be "loaded" in memory long before it actually will be needed by program
		filterImage(new ImageFilter("baseImage.png"));
		// in this case image will be "loaded" in memory when we start it rendering
		filterImage(new ImageFilterProxy("proxyImage.png"));
	}

	private static void filterImage(Image image) {
		System.out.println("Do some another business logic...");
		System.out.println("Set filter settings for image...");
		image.setFilterSettings(new FilterSettings(0.5, 2));
		System.out.println("Apply filter on image...");
		image.render();
		System.out.println();
	}
}
