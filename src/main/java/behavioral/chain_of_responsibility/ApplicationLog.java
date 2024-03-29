package behavioral.chain_of_responsibility;

// Represent a request in chain of responsibility
public class ApplicationLog {
	public enum Level {Console, File, Database}

	private final Level saveLevel;
	private final String content;

	public ApplicationLog(Level saveLevel, String content) {
		this.saveLevel = saveLevel;
		this.content = content;
	}

	public Level getSaveLevel() {
		return saveLevel;
	}

	public String getContent() {
		return content;
	}
}
