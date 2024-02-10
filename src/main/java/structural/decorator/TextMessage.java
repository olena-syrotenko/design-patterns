package structural.decorator;

// represent current in-use Component implementation
public class TextMessage implements Message {
	private String content;

	public TextMessage(String content) {
		this.content = content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}
}
