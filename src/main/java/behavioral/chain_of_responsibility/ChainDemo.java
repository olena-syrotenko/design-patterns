package behavioral.chain_of_responsibility;

public class ChainDemo {
	public static void main(String[] args) {
		// each type of log will be processed by appropriate handler and last one will be skipped
		LogHandler logHandlersChain = new ConsoleLogHandler(new FileLogHandler(new DatabaseLogHandler(null)));
		logHandlersChain.handleLog(new ApplicationLog(ApplicationLog.Level.Database, "db log"));
		logHandlersChain.handleLog(new ApplicationLog(ApplicationLog.Level.Console, "console log"));
		logHandlersChain.handleLog(new ApplicationLog(ApplicationLog.Level.File, "file log"));
		logHandlersChain.handleLog(new ApplicationLog(null, "This is log without level"));
	}
}
