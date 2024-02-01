package creational.prototype;

public class Enemy extends ActiveUnit {
	private Double criticalDamageProb = 0.;

	public Enemy() {
	}

	public Enemy(Coordinates coordinates, Double healthPoints, Integer damage, Double criticalDamageProb) {
		super(coordinates, healthPoints, damage);
		this.criticalDamageProb = criticalDamageProb;
	}

	public Enemy(Enemy enemy) {
		super(enemy);
		if (enemy != null) {
			this.criticalDamageProb = enemy.getCriticalDamageProb();
		}
	}

	public Double getCriticalDamageProb() {
		return criticalDamageProb;
	}

	public void setCriticalDamageProb(Double criticalDamageProb) {
		this.criticalDamageProb = criticalDamageProb;
	}

	@Override
	public GameUnit clone() {
		return new Enemy(this);
	}
}
