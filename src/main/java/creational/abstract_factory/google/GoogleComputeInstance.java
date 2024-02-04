package creational.abstract_factory.google;

import creational.abstract_factory.Instance;
import creational.abstract_factory.Storage;

public class GoogleComputeInstance implements Instance {
	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Storage attached to GoogleComputeInstance: " + storage.toString());
	}
}
