package behavioral.template_method;

public class ArticleContentDelivery extends ContentDelivery{
	@Override
	protected void processContent(ContentDto contentDto) {
		System.out.println("Optimize content text for SEO...");
	}

	@Override
	protected void deliverContent(ContentDto contentDto) {
		System.out.println("Uploading article to the provided platform...");
	}
}
