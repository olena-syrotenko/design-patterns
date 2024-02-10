package structural.adapter.object_adapter;

public class EmailService {

	private final Sender sender;

	public EmailService(Sender sender) {
		this.sender = sender;
	}

	public void sendEmail(String from, String to, String emailContent) {
		// some business logic and validation
		sender.send(from, to, emailContent);
		System.out.println("Email was sent");
	}
}
