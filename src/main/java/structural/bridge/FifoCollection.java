package structural.bridge;

// concrete abstraction that represents First in - First out approach
public class FifoCollection<T> implements CollectionStructure<T> {

	private final ListStructure<T> list;

	public FifoCollection(ListStructure<T> list) {
		this.list = list;
	}

	@Override
	public void add(T element) {
		list.addLast(element);
	}

	@Override
	public T remove() {
		return list.removeFirst();
	}
}
