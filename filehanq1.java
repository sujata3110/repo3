import java.io.*;

class Test {
    public static void main(String args[]) throws IOException {
        FileWriter fwrite = new FileWriter("abc.txt");
        String z = "Java is a programming language";
        fwrite.write(z);
        fwrite.close();
        System.out.println("Created Successfully");
    }
}
