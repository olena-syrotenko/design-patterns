package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RatFactory {
	static Map<String, RatType> ratTypes = new HashMap<>();

	public static RatType getRatType(RatConstants.Color color, RatConstants.Size size) {
		String ratTypeKey = color + "/" + size;
		if (!ratTypes.containsKey(ratTypeKey)) {
			ratTypes.put(ratTypeKey, new RatType(color, size));
		}
		return ratTypes.get(ratTypeKey);
	}
}
