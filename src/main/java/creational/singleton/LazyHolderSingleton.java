package creational.singleton;

/**
 * Lazy initialization singleton using holder class. This ensures that we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyHolderSingleton {

	private LazyHolderSingleton() {
	}

	private static class InstanceHolder {
		private static final LazyHolderSingleton instance = new LazyHolderSingleton();
	}

	public static LazyHolderSingleton getInstance() {
		return InstanceHolder.instance;
	}
}
