package structural.proxy.virtual;

public interface Image {
	void setFilterSettings(FilterSettings filterSettings);

	FilterSettings getFilterSettings();

	void render();
}
