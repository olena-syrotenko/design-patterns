package behavioral.template_method;

public class VideoContentDelivery extends ContentDelivery {

	// override method that is implemented in base class
	@Override
	protected ContentDto prepareContent(String contentParam) {
		System.out.println("Load content " + contentParam + " from cloud storage");
		return new ContentDto();
	}

	@Override
	protected void processContent(ContentDto contentDto) {
		System.out.println("Prepare video renders in different resolutions...");
	}

	@Override
	protected void deliverContent(ContentDto contentDto) {
		System.out.println("Uploading video to the provided streaming platform...");
	}
}
