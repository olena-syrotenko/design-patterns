package structural.proxy.virtual;

public class FilterSettings {
	private Double intensity;
	private Integer recSize;

	public FilterSettings(Double intensity, Integer recSize) {
		this.intensity = intensity;
		this.recSize = recSize;
	}

	public Double getIntensity() {
		return intensity;
	}

	public void setIntensity(Double intensity) {
		this.intensity = intensity;
	}

	public Integer getRecSize() {
		return recSize;
	}

	public void setRecSize(Integer recSize) {
		this.recSize = recSize;
	}

	@Override
	public String toString() {
		return "intensity=" + intensity + ", recSize=" + recSize;
	}
}
