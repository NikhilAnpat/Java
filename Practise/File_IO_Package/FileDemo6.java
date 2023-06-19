import java.io.*;

class FileDemo6 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File f = new File("E:\\Cdac\\JAVA Assignment\\File_IO_Package");
        String[] fileList = f.list();
        for (String fileName : fileList) {
            count++;
            System.out.println(fileName);
        }
        System.out.println("Total number of items: " + count);
    }
}
