import java.io.*;

class Test {
    public static void main(String args[]) throws IOException {

        File file = new File("abc.txt");
        long fileSize = file.length();
        String filePath = file.getAbsolutePath();
System.out.println("File size: " + fileSize + " bytes");
        System.out.println("File path: " + filePath);
    }
}
