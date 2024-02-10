package structural.bridge;

// concrete implementation that represents array list storage
public class CustomArrayList<T> implements ListStructure<T> {
	private static final int DEFAULT_SIZE = 2;
	private Object[] data;
	private int size;

	public CustomArrayList() {
		data = new Object[DEFAULT_SIZE];
	}

	@Override
	public void addFirst(T element) {
		ensureCapacity(++size);
		shiftOneRight();
		data[0] = element;
	}

	@Override
	public T removeFirst() {
		if (size == 0) {
			return null;
		}
		T first = (T) data[0];
		size--;
		shiftOneLeft();
		return first;
	}

	@Override
	public void addLast(T element) {
		ensureCapacity(size + 1);
		data[size++] = element;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T removeLast() {
		if (size == 0) {
			return null;
		}
		return (T) data[--size];
	}

	private void ensureCapacity(int newSize) {
		if (data.length > newSize) {
			return;
		}
		Object[] temp = new Object[data.length + DEFAULT_SIZE];
		System.arraycopy(data, 0, temp, 0, data.length);
		data = temp;
	}

	private void shiftOneRight() {
		System.arraycopy(data, 0, data, 1, size);
	}

	private void shiftOneLeft() {
		System.arraycopy(data, 1, data, 0, size);
	}
}
