package structural.facade;

public class FacadeDemo {
	public static void main(String[] args) {
		// client use only one method that hides all complex logic
		VideoConversionFacade videoConversion = new VideoConversionFacade();
		videoConversion.convertVideo("test.mp4", "ogg");
	}
}
