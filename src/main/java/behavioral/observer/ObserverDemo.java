package behavioral.observer;

public class ObserverDemo {
	public static void main(String[] args) {
		OrderObserver priceObserver = new PriceObserver();
		OrderObserver itemsObserver = new ItemsObserver();

		Order order = new Order("1");
		order.attach(priceObserver);
		order.attach(itemsObserver);

		System.out.println("\nAdd 3 items with price 10");
		order.addItem(10, 3);
		System.out.println("\nAdd 5 items with price 100");
		order.addItem(100, 5);

		order.detach(priceObserver);
		System.out.println("\nDetach priceObserver, 5% discount will not be applied");
		System.out.println("\nAdd 2 items with price 500");
		order.addItem(500, 2);
	}
}
