package structural.composite;

// represent Leaf
public class BinaryFile extends File {
	private final boolean isHidden;

	public BinaryFile(String name, Boolean isHidden) {
		super(name);
		this.isHidden = isHidden;
	}

	@Override
	public void ls() {
		if (!isHidden) {
			System.out.println(getName());
		}
	}
}
