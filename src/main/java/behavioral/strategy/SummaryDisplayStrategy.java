package behavioral.strategy;

import java.util.List;

public class SummaryDisplayStrategy implements DisplayStrategy {
	@Override
	public void display(List<Order> orders) {
		System.out.println("----------- Summary Report -----------\n");
		orders.forEach(o -> System.out.println(o.getId() + "\t" + o.getCreated() + "\t" + o.getItems().size() + " items,\t" + o.getTotal()));
		System.out.println("\nOrders total: " + orders.stream().reduce(0., (partialResult, o) -> partialResult + o.getTotal(), Double::sum));
		System.out.println("--------------------------------------");
	}
}
