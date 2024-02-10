package structural.bridge;

// concrete abstraction that represents Last in - First out approach
public class LifoCollection<T> implements CollectionStructure<T> {

	private final ListStructure<T> list;

	public LifoCollection(ListStructure<T> list) {
		this.list = list;
	}

	@Override
	public void add(T element) {
		list.addLast(element);
	}

	@Override
	public T remove() {
		return list.removeLast();
	}
}
