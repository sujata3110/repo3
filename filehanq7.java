import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Test {
    public static void main(String args[]) {
     
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter z = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

 String z1 = currentDateTime.format(z);
        System.out.println("Current date and time: " + z1);
    }
}
