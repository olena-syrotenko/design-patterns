package structural.facade.complex_subsystem;

public class VideoFile {
	private String name;
	private Codec codecType;

	public VideoFile(String name) {
		this.name = name;
		this.codecType = Codec.getCodecByValue(name.substring(name.indexOf(".") + 1));
	}

	public Codec getCodecType() {
		return codecType;
	}

	public String getName() {
		return name;
	}
}
