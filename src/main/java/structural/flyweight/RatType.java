package structural.flyweight;

public class RatType {
	private final RatConstants.Color color;
	private final RatConstants.Size size;

	public RatType(RatConstants.Color color, RatConstants.Size size) {
		System.out.println("Created intrinsic rat state");
		this.color = color;
		this.size = size;
	}

	public void move(Integer x, Integer y) {
		System.out.println("Rat " + size + " " + color + " is moved to x = " + x + ", y = " + y);
	}
}
