
//Requirement: Write a program to display only directory names
//Program:
import java.io.*;

class FileDemo8 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File f = new File("E:\\Cdac\\JAVA Assignment\\File_IO_Package");
        String[] s = f.list();
        for (String s1 : s) {
            File f1 = new File(f, s1); // Corrected the constructor name
            if (f1.isDirectory()) {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("Total number: " + count);
    }
}
