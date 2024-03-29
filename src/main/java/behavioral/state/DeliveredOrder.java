package behavioral.state;

public class DeliveredOrder implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("Cancellation of delivered order is done. Paid amount is returned.");
		return 20;
	}
}
