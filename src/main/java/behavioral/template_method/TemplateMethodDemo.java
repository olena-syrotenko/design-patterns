package behavioral.template_method;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		// depending on content type some steps of delivery algorithm will be different
		defineDeliveryMethod("someArticle.pdf").placeContent("someArticle.pdf");
		System.out.println();
		defineDeliveryMethod("someVideo.mp4").placeContent("someVideo.mp4");
	}

	private static ContentDelivery defineDeliveryMethod(String param) {
		if (param.contains("txt") || param.contains("pdf")) {
			return new ArticleContentDelivery();
		} else if (param.contains("mp4")) {
			return new VideoContentDelivery();
		}
		throw new IllegalArgumentException("There is no appropriate delivery mechanism for this content");
	}
}
