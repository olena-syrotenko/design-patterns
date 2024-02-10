package structural.bridge;

// concrete implementation that represents linked list storage
public class CustomLinkedList<T> implements ListStructure<T> {

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<T> head;
	private Node<T> tail;

	@Override
	public void addFirst(T element) {
		if (head == null) {
			tail = head = new Node<>(element, null);
		} else {
			head = new Node<>(element, head);
		}
	}

	@Override
	public void addLast(T element) {
		if (tail == null) {
			tail = head = new Node<>(element, null);
		} else {
			tail.next = new Node<>(element, null);
			tail = tail.next;
		}
	}

	@Override
	public T removeFirst() {
		if (head == null) {
			return null;
		}
		T headData = head.data;
		if (head.next != null) {
			head = head.next;
		} else {
			head = tail = null;
		}
		return headData;
	}

	@Override
	public T removeLast() {
		if (tail == null) {
			return null;
		}
		if (head == tail) {
			T headData = head.data;
			head = tail = null;
			return headData;
		}
		Node<T> tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		T tailData = tmp.data;
		tail = tmp;
		tail.next = null;
		return tailData;
	}
}
