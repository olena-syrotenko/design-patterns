package behavioral.chain_of_responsibility;

// represent an abstract Handler in chain of responsibility
public abstract class GeneralLogHandler implements LogHandler {

	private LogHandler nextHandler;

	public GeneralLogHandler(LogHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleLog(ApplicationLog log) {
		if (!processRequest(log) && nextHandler != null) {
			nextHandler.handleLog(log);
		}
	}

	protected abstract boolean processRequest(ApplicationLog log);

}
