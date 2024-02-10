package structural.composite;

import java.util.ArrayList;
import java.util.List;

// represent Composite
public class Directory extends File {

	private final List<File> children = new ArrayList<>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.println(getName());
		children.forEach(File::ls);
	}

	public void addFile(File file) {
		children.add(file);
	}

	public void removeFile(File file) {
		children.remove(file);
	}

	public List<File> getFiles() {
		return children;
	}
}
