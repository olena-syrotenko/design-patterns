package behavioral.state;

public class PaidOrder implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Cancellation of paid order is done. Paid amount is returned.");
		return 0;
	}
}
