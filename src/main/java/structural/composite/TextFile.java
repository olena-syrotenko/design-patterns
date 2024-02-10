package structural.composite;

// represent Leaf
public class TextFile extends File {

	private Integer size;

	public TextFile(String name, Integer size) {
		super(name);
		this.size = size;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public void ls() {
		System.out.println(getName() + " " + getSize());
	}
}
