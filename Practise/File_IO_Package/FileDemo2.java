import java.io.*;

class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("cricket123");
		System.out.println(f.exists());// false
		f.mkdir();//create file
		System.out.println(f.exists());// true
	}
}