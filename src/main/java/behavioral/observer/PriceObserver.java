package behavioral.observer;

// concrete observer to track price changes and apply discounts
public class PriceObserver implements OrderObserver {
	@Override
	public void updated(Order order) {
		double totalPrice = order.getAmount();
		System.out.println("Price was changed: " + totalPrice);
		if (totalPrice >= 1000) {
			order.setDiscount(5);
			System.out.println("5% discount was applied");
		} else if (totalPrice >= 500) {
			order.setDiscount(3);
			System.out.println("3% discount was applied");
		}
		System.out.println("Order total: " + order.getTotal());
	}
}
