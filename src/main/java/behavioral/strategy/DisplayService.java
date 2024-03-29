package behavioral.strategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// context
public class DisplayService {
	private DisplayStrategy displayStrategy;

	public DisplayService(DisplayStrategy displayStrategy) {
		this.displayStrategy = displayStrategy;
	}

	public void displayOrdersInfo(String userId) {
		System.out.println("Display user[id=" + userId + "] orders");
		displayStrategy.display(getOrdersForUser());
	}

	private List<Order> getOrdersForUser() {
		List<Order> orders = new ArrayList<>();

		Order order1 = new Order("1", LocalDate.parse("2024-01-13"));
		order1.addItem("Chips", 58.);
		order1.addItem("Cookies", 32.5);
		orders.add(order1);

		Order order2 = new Order("2", LocalDate.parse("2024-01-29"));
		order2.addItem("Apples", 13.);
		order2.addItem("Bananas", 78.);
		order2.addItem("Juice", 24.);
		orders.add(order2);

		Order order3 = new Order("3", LocalDate.parse("2024-02-10"));
		order3.addItem("Cake", 450.);
		orders.add(order3);

		return orders;
	}
}
