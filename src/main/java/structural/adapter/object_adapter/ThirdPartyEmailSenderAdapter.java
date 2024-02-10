package structural.adapter.object_adapter;

public class ThirdPartyEmailSenderAdapter implements Sender {
	private final ThirdPartyEmailSender thirdPartyEmailSender;

	public ThirdPartyEmailSenderAdapter(ThirdPartyEmailSender thirdPartyEmailSender) {
		this.thirdPartyEmailSender = thirdPartyEmailSender;
	}

	@Override
	public void send(String from, String to, String emailContent) {
		Email emailToSend = new Email(from, to, emailContent);
		thirdPartyEmailSender.sendEmail(emailToSend);
	}
}
