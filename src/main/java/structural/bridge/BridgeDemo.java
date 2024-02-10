package structural.bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		// use FIFO approach so 1 will be displayed
		fillAndGetElement(new FifoCollection<>(new CustomLinkedList<>()));

		// use LIFO approach so 4 will be displayed
		// can use another implementation to get better performance
		fillAndGetElement(new LifoCollection<>(new CustomArrayList<>()));
	}

	private static void fillAndGetElement(CollectionStructure<Integer> collection) {
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		System.out.println(collection.remove());
	}

}
