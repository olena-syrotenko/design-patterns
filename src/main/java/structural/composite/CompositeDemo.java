package structural.composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Directory rootDirectory = new Directory("root");
		rootDirectory.addFile(new TextFile("rootText.txt", 100));

		Directory firstDirectory = new Directory("first");
		firstDirectory.addFile(new TextFile("firstText.txt", 260));
		firstDirectory.addFile(new BinaryFile("firstBinary.bin", false));
		rootDirectory.addFile(firstDirectory);

		Directory secondDirectory = new Directory("second");
		secondDirectory.addFile(new BinaryFile("hiddenBinary.bin", true));
		secondDirectory.addFile(new Directory("innerDirectory"));
		rootDirectory.addFile(secondDirectory);

		// all files in root tree will be displayed except hiddenBinary.bin
		printFileTree(rootDirectory);
	}

	private static void printFileTree(File file) {
		file.ls();
	}
}
