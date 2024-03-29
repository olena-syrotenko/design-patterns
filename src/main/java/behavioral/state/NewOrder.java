package behavioral.state;

public class NewOrder implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Cancellation of new order is done.");
		return 0;
	}
}
