package behavioral.chain_of_responsibility;

// concrete handler to process file logs
public class FileLogHandler extends GeneralLogHandler {
	public FileLogHandler(LogHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	protected boolean processRequest(ApplicationLog log) {
		if (ApplicationLog.Level.File.equals(log.getSaveLevel())) {
			System.out.println("Write log [" + log.getContent() + "] into file");
			return true;
		}
		return false;
	}
}
