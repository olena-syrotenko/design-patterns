package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

// inspired by lovely A Plague Tale game
public class FlyweightDemo {
	public static void main(String[] args) {
		// in console creation message of intrinsic state will be printed only 4 times for each unique type
		List<Rat> rats = new ArrayList<>();
		rats.add(new Rat(1,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.MEDIUM)));
		rats.add(new Rat(2,1, RatFactory.getRatType(RatConstants.Color.WHITE, RatConstants.Size.LARGE)));
		rats.add(new Rat(3,1, RatFactory.getRatType(RatConstants.Color.DARK_GREY, RatConstants.Size.MEDIUM)));
		rats.add(new Rat(4,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.MEDIUM)));
		rats.add(new Rat(5,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.MEDIUM)));
		rats.add(new Rat(6,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.MEDIUM)));
		rats.add(new Rat(7,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.SMALL)));
		rats.add(new Rat(8,1, RatFactory.getRatType(RatConstants.Color.BLACK, RatConstants.Size.SMALL)));
		rats.forEach(Rat::move);
	}
}
