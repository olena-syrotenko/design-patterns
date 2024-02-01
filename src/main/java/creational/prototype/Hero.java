package creational.prototype;

public class Hero extends ActiveUnit {

	private Integer protection = 0;
	private Helper helper;

	public Hero() {
	}

	public Hero(Coordinates coordinates, Double healthPoints, Integer damage, Integer protection, Helper helper) {
		super(coordinates, healthPoints, damage);
		this.protection = protection;
		this.helper = helper;
	}

	public Hero(Hero hero) {
		super(hero);
		if (hero != null) {
			this.protection = hero.getProtection();
			this.helper = new Helper(hero.getHelper());
		}
	}

	public Integer getProtection() {
		return protection;
	}

	public void setProtection(Integer protection) {
		this.protection = protection;
	}

	public Helper getHelper() {
		return helper;
	}

	public void setHelper(Helper helper) {
		this.helper = helper;
	}

	@Override
	public GameUnit clone() {
		return new Hero(this);
	}
}
