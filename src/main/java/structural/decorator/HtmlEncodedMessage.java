package structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

// represent a Decorator that additionally encode message for HTML
public class HtmlEncodedMessage implements Message{
	private final Message message;

	public HtmlEncodedMessage(Message message) {
		this.message = message;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(message.getContent());
	}
}
