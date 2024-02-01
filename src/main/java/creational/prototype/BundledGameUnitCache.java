package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledGameUnitCache {
	private final Map<String, GameUnit> cache = new HashMap<>();

	public BundledGameUnitCache() {
		cache.put("Young helper", new Helper(10));
		cache.put("Experienced helper", new Helper(30));
		cache.put("Common hero", new Hero(new Coordinates(), 100., 5, 10, null));
		cache.put("Epic hero", new Hero(new Coordinates(), 500., 30, 50, (Helper) cache.get("Experienced helper")));
		cache.put("First level enemy", new Enemy(new Coordinates(), 15., 20, 0.05));
	}

	public GameUnit put(String key, GameUnit gameUnit) {
		cache.put(key, gameUnit);
		return gameUnit;
	}

	public GameUnit get(String key) {
		return cache.get(key).clone();
	}

}
