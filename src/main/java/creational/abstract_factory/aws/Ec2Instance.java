package creational.abstract_factory.aws;

import creational.abstract_factory.Instance;
import creational.abstract_factory.Storage;

public class Ec2Instance implements Instance {

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Storage attached to EC2: " + storage.toString());
	}
}
