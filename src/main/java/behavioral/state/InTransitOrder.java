package behavioral.state;

public class InTransitOrder implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("Cancellation of order in transit is done. Paid amount is returned.");
		return 10;
	}
}
