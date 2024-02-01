package creational.prototype;

public class ActiveUnit extends GameUnit {

	protected Coordinates coordinates;
	protected Double healthPoints = 100.;
	protected Integer damage = 0;

	public ActiveUnit() {
	}

	public ActiveUnit(Coordinates coordinates, Double healthPoints, Integer damage) {
		this.coordinates = coordinates;
		this.healthPoints = healthPoints;
		this.damage = damage;
	}

	public ActiveUnit(ActiveUnit activeUnit) {
		if (activeUnit != null) {
			this.coordinates = new Coordinates(activeUnit.getCoordinates().getX(), activeUnit.getCoordinates().getY());
			this.healthPoints = activeUnit.getHealthPoints();
			this.damage = activeUnit.getDamage();
		}
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Double getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(Double healthPoints) {
		this.healthPoints = healthPoints;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	@Override
	public GameUnit clone() {
		return new ActiveUnit(this);
	}
}
