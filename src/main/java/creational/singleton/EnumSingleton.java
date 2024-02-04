package creational.singleton;

/**
 * Enum singleton. It handles serialization using java's in-built mechanism and still ensure single instance
 */
public enum EnumSingleton {
	INSTANCE;

	public void someMethod() {
		// Do actual work here.
	}
}
