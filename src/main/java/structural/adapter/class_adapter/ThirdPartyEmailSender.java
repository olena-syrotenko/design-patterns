package structural.adapter.class_adapter;

public class ThirdPartyEmailSender {
	public void sendEmail(Email email) {
		// some implemented logic of sending email
		System.out.println("Email from: " + email.getSender() + " to: " + email.getReceiver() + "\n" + email.getContent());
	}
}
