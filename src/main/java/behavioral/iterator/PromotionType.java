package behavioral.iterator;

// represents Aggregate
public enum PromotionType {
	EarlyBooking, LateBooking, SameDayBooking, DateRangeBooking;

	public static CustomIterator<PromotionType> getIterator() {
		return new PromotionTypeIterator();
	}

	// concrete implementation of Iterator
	public static class PromotionTypeIterator implements CustomIterator<PromotionType> {
		private int position = 0;

		@Override
		public boolean hasNext() {
			return position < PromotionType.values().length;
		}

		@Override
		public PromotionType next() {
			return PromotionType.values()[position++];
		}
	}
}
