import java.io.*;

class FileDemo4 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("SaiCharan123");
		f1.mkdir();
		File f2 = new File("SaiCharan123", "abc.txt");
		f2.createNewFile();
	}
}