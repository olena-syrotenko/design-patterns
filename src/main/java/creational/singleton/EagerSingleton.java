package creational.singleton;

/**
 * Eager initialization of instance.
 */
public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
