package behavioral.strategy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
	private final String id;
	private final LocalDate created;
	private final Map<String, Double> items = new HashMap<>();
	private double total = 0;

	public Order(String id, LocalDate date) {
		this.id = id;
		this.created = date;
	}

	public String getId() {
		return id;
	}

	public LocalDate getCreated() {
		return created;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public double getTotal() {
		return total;
	}

	public void addItem(String itemName, Double price) {
		items.put(itemName, price);
		total += price;
	}
}
