package behavioral.state;

// context
public class Order {

	private OrderState currentState = new NewOrder();

	public double cancel() {
		return currentState.handleCancellation();
	}

	public void payOrder() {
		currentState = new PaidOrder();
	}

	public void dispatchOrder() {
		currentState = new InTransitOrder();
	}

	public void confirmDelivery() {
		currentState = new DeliveredOrder();
	}
}
