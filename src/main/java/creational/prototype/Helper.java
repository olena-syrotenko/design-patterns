package creational.prototype;

public class Helper extends GameUnit {
	private Integer additionalDamage = 0;

	public Helper() {
	}

	public Helper(Integer additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Helper(Helper helper) {
		this.additionalDamage = helper.getAdditionalDamage();
	}

	public Integer getAdditionalDamage() {
		return additionalDamage;
	}

	public void setAdditionalDamage(Integer additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	@Override
	public GameUnit clone() {
		return new Helper(this);
	}
}
