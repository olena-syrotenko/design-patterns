package creational.abstract_factory;

public class ResourceConfig {
	private ResourceFactory resourceFactory;

	public ResourceConfig(ResourceFactory resourceFactory) {
		this.resourceFactory = resourceFactory;
	}

	public Instance createResource() {
		Instance instance = resourceFactory.getInstance();
		instance.attachStorage(resourceFactory.getStorage());
		return instance;
	}

}
