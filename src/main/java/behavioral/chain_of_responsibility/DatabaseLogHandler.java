package behavioral.chain_of_responsibility;

// concrete handler to process database logs
public class DatabaseLogHandler extends GeneralLogHandler {
	public DatabaseLogHandler(LogHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	protected boolean processRequest(ApplicationLog log) {
		if (ApplicationLog.Level.Database.equals(log.getSaveLevel())) {
			System.out.println("Save log [" + log.getContent() + "] into database");
			return true;
		}
		return false;
	}
}
