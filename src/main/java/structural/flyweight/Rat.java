package structural.flyweight;

import java.util.Random;

public class Rat {
	private Integer x;
	private Integer y;
	private RatType ratType;

	public Rat(Integer x, Integer y, RatType ratType) {
		this.x = x;
		this.y = y;
		this.ratType = ratType;
	}

	public void move() {
		Random random = new Random();
		x = random.nextInt(100);
		y = random.nextInt(100);
		ratType.move(x, y);
	}

}
