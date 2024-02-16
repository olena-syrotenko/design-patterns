package behavioral.iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		CustomIterator<PromotionType> iterator = PromotionType.getIterator();

		// print all enum values using iterator
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
