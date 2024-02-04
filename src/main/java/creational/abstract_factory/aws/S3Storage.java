package creational.abstract_factory.aws;

import creational.abstract_factory.Storage;

public class S3Storage implements Storage {
	@Override
	public String toString() {
		return "S3";
	}
}
