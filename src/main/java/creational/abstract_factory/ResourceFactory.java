package creational.abstract_factory;

public interface ResourceFactory {
	Instance getInstance();

	Storage getStorage();
}
