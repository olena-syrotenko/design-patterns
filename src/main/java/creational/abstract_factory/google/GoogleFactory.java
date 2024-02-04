package creational.abstract_factory.google;

import creational.abstract_factory.Instance;
import creational.abstract_factory.ResourceFactory;
import creational.abstract_factory.Storage;

public class GoogleFactory implements ResourceFactory {
	@Override
	public Instance getInstance() {
		return new GoogleComputeInstance();
	}

	@Override
	public Storage getStorage() {
		return new GoogleCloudStorage();
	}
}
