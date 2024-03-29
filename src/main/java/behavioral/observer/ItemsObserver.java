package behavioral.observer;

// concrete observer to track items count changes and update shipping cost
public class ItemsObserver implements OrderObserver {
	@Override
	public void updated(Order order) {
		int count = order.getItemsCount();
		System.out.println("Items quantity was changed: " + count);
		if (count > 10) {
			order.setShippingCost(10 + (count - 5) * 4);
			System.out.println("4$ was applied for each extra item");
		} else if (count > 5) {
			order.setShippingCost(10 + (count - 5) * 2);
			System.out.println("2$ was applied for each extra item");
		}
		System.out.println("Order total: " + order.getTotal());
	}
}
