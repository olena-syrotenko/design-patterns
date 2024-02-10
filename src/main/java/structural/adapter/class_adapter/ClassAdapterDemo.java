package structural.adapter.class_adapter;

public class ClassAdapterDemo {
	public static void main(String[] args) {
		// can use third party service even if current implementation need another interface
		EmailService emailService = new EmailService(new ThirdPartyEmailSenderAdapter());
		emailService.sendEmail("from@mail.com", "to@mail.com", "some mail content");
	}
}
