package behavioral.template_method;

public abstract class ContentDelivery {

	// template method
	public final void placeContent(String contentParam) {
		ContentDto contentDto = prepareContent(contentParam);
		processContent(contentDto);
		deliverContent(contentDto);
		finalizeDelivery();
	}

	protected ContentDto prepareContent(String contentParam) {
		System.out.println("Load content " + contentParam + " from local file system");
		return new ContentDto();
	}

	protected abstract void processContent(ContentDto contentDto);

	protected abstract void deliverContent(ContentDto contentDto);

	protected void finalizeDelivery() {
		System.out.println("Close all connections");
	}
}
