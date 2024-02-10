package structural.bridge;

// implementation hierarchy interface
public interface ListStructure<T> {
	void addFirst(T element);

	void addLast(T element);

	T removeFirst();

	T removeLast();
}
