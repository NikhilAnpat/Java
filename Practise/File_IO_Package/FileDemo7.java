import java.io.*;

class FileDemo7 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File f = new File("E:\\Cdac\\JAVA Assignment\\File_IO_Package");
        String[] fileList = f.list();
        for (String s1 : fileList) {
            File f1 = new File(f, s1); // Corrected the constructor name
            if (f1.isFile()) {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("Total number: " + count);
    }
}
