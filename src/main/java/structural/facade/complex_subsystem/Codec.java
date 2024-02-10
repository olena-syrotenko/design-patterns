package structural.facade.complex_subsystem;

import java.util.Arrays;

public enum Codec {
	MP4("mp4"), OGG("ogg");
	private final String value;

	Codec(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Codec getCodecByValue(String value) {
		return Arrays.stream(Codec.values()).filter(codec -> codec.getValue().equals(value)).findFirst().orElse(null);
	}
}
