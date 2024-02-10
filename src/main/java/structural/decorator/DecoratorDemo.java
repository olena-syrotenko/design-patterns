package structural.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		Message message = new TextMessage("test&demo");
		System.out.println("Simple message: " + message.getContent());

		Message messageHtmlEncoded = new HtmlEncodedMessage(message);
		System.out.println("HTML encoded message: " + messageHtmlEncoded.getContent());

		Message messageUrlEncoded = new UrlEncodedMessage(message);
		System.out.println("URL encoded message: " + messageUrlEncoded.getContent());

		Message messageChainEncoded = new UrlEncodedMessage(messageHtmlEncoded);
		System.out.println("Chain (HTML + URL) encoded message: " + messageChainEncoded.getContent());
	}
}
