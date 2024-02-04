package creational.singleton;

/**
 * Lazy initializing singleton with Double Checked Locking.
 * This implementation solves the multi-threading issue with lazy initialization using volatile and double check locking.
 */
public class LazyDclSingleton {
	private static volatile LazyDclSingleton instance;

	private LazyDclSingleton() {
	}

	public static LazyDclSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDclSingleton.class) {
				if (instance == null) {
					instance = new LazyDclSingleton();
				}
			}
		}
		return instance;
	}
}
