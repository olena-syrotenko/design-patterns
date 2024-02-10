package structural.decorator;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

// represent a Decorator that additionally encode message for URL
public class UrlEncodedMessage implements Message {

	private final Message message;

	public UrlEncodedMessage(Message message) {
		this.message = message;
	}

	@Override
	public String getContent() {
		return URLEncoder.encode(message.getContent(), StandardCharsets.UTF_8);
	}
}
