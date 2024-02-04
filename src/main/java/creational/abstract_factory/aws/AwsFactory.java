package creational.abstract_factory.aws;

import creational.abstract_factory.Instance;
import creational.abstract_factory.ResourceFactory;
import creational.abstract_factory.Storage;

public class AwsFactory implements ResourceFactory {
	@Override
	public Instance getInstance() {
		return new Ec2Instance();
	}

	@Override
	public Storage getStorage() {
		return new S3Storage();
	}
}
