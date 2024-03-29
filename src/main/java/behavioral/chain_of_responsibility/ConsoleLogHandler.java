package behavioral.chain_of_responsibility;

// concrete handler to process console logs
public class ConsoleLogHandler extends GeneralLogHandler {
	public ConsoleLogHandler(LogHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	protected boolean processRequest(ApplicationLog log) {
		if (ApplicationLog.Level.Console.equals(log.getSaveLevel())) {
			System.out.println("Write log [" + log.getContent() + "] into console");
			return true;
		}
		return false;
	}
}
