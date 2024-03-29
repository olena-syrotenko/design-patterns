package behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// print in different formats according to provided strategy
		DisplayService summeryDisplayService = new DisplayService(new SummaryDisplayStrategy());
		summeryDisplayService.displayOrdersInfo("1");

		DisplayService detailsDisplayService = new DisplayService(new DetailsDisplayStrategy());
		detailsDisplayService.displayOrdersInfo("1");
	}
}
