package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String id;
	private double amount = 0;
	private int itemsCount = 0;
	private int discount = 0;
	private int shippingCost = 10;
	private final List<OrderObserver> observers = new ArrayList<>();

	public Order(String id) {
		this.id = id;
	}

	public void addItem(double pricePerOne, int count) {
		amount += count * pricePerOne;
		itemsCount += count;
		observers.forEach(observer -> observer.updated(this));
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getAmount() {
		return amount;
	}

	public int getItemsCount() {
		return itemsCount;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public void attach(OrderObserver observer) {
		observers.add(observer);
	}

	public void detach(OrderObserver observer) {
		observers.remove(observer);
	}

	public double getTotal() {
		return amount * (1 - discount / 100.) + shippingCost;
	}
}
