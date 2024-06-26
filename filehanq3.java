import java.io.*;

class Test {
    public static void main(String args[]) throws IOException {
        File file = new File("abc.txt");
          
                if (file.canRead()) {
            System.out.println(file+" can be read");
        } else {
            System.out.println( file+" cannot be read");
        }
    }
}
