import java.io.*;

class FileDemo5 {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Cdac\\JAVA Assignment\\File_IO_Package\\SaiCharan123", "demo.txt");
		f.createNewFile();
	}
}