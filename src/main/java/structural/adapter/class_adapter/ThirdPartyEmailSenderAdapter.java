package structural.adapter.class_adapter;

public class ThirdPartyEmailSenderAdapter extends ThirdPartyEmailSender implements Sender {
	@Override
	public void send(String from, String to, String emailContent) {
		Email emailToSend = new Email(from, to, emailContent);
		this.sendEmail(emailToSend);
	}
}
