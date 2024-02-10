package structural.adapter.object_adapter;

public class ObjectAdapterDemo {
	public static void main(String[] args) {
		// can use third party service even if current implementation need another interface
		EmailService emailService = new EmailService(new ThirdPartyEmailSenderAdapter(new ThirdPartyEmailSender()));
		emailService.sendEmail("from@mail.com", "to@mail.com", "some mail content");
	}
}
