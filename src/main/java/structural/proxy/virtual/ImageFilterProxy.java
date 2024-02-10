package structural.proxy.virtual;

public class ImageFilterProxy implements Image {

	private FilterSettings filterSettings;
	private String imageFile;
	private Image image;

	public ImageFilterProxy(String imageFile) {
		// save file name but not load image in memory
		this.imageFile = imageFile;
	}

	@Override
	public void setFilterSettings(FilterSettings filterSettings) {
		// if file is not loaded, save provided setting in internal state
		if (image == null) {
			this.filterSettings = filterSettings;
		} else {
			image.setFilterSettings(filterSettings);
		}
	}

	@Override
	public FilterSettings getFilterSettings() {
		// if file is not loaded, return settings from internal state
		if (image == null) {
			return filterSettings;
		}
		return image.getFilterSettings();
	}

	@Override
	public void render() {
		// load image when it first is needed to render
		if (image == null) {
			image = new ImageFilter(imageFile);
			image.setFilterSettings(filterSettings);
		}
		image.render();
	}
}
