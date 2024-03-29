package behavioral.strategy;

import java.util.List;
import java.util.Map;

public class DetailsDisplayStrategy implements DisplayStrategy {
	@Override
	public void display(List<Order> orders) {
		System.out.println("----------- Details Report -----------\n");
		for (Order order : orders) {
			System.out.println("Order #" + order.getId() + ", created at " + order.getCreated());
			for (Map.Entry<String, Double> item : order.getItems().entrySet()) {
				System.out.println("\t\t- " + item.getKey() + " " + item.getValue());
			}
			System.out.println("Order #" + order.getId() + " total: " + order.getTotal());
		}
		System.out.println("\nOrders total: " + orders.stream().reduce(0., (partialResult, o) -> partialResult + o.getTotal(), Double::sum));
		System.out.println("--------------------------------------");
	}
}
