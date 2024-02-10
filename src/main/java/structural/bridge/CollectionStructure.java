package structural.bridge;

// abstraction hierarchy interface
public interface CollectionStructure<T> {
	void add(T element);

	T remove();
}
