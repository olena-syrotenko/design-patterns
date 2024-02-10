package structural.proxy.virtual;

public class ImageFilter implements Image {
	private FilterSettings filterSettings;
	private byte[] image;

	public ImageFilter(String imageFile) {
		System.out.println("Image " + imageFile + " is loaded into memory");
		image = new byte[1];
	}

	@Override
	public void setFilterSettings(FilterSettings filterSettings) {
		this.filterSettings = filterSettings;
	}

	@Override
	public FilterSettings getFilterSettings() {
		return filterSettings;
	}

	@Override
	public void render() {
		System.out.println("Image was rendered with provided filter: " + filterSettings);
	}
}
