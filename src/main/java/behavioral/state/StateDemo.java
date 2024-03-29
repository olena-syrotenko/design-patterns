package behavioral.state;

public class StateDemo {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println("Try to cancel new order");
		System.out.println("Charge: " + order.cancel());

		order.payOrder();
		System.out.println("\nTry to cancel paid order");
		System.out.println("Charge: " + order.cancel());

		order.dispatchOrder();
		System.out.println("\nTry to cancel dispatched order");
		System.out.println("Charge: " + order.cancel());

		order.confirmDelivery();
		System.out.println("\nTry to cancel delivered order");
		System.out.println("Charge: " + order.cancel());
	}
}
