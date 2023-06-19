import java.io.*;

class FileDemo3 {
	public static void main(String[] args) throws IOException {
		File f = new File("demo.txt");
		f.createNewFile();
	}
}