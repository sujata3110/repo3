import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
            n = sc.nextInt();
        int sum = 0;
        int temp = n;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("The sum the digits " + n + " is: " + sum);
        
    }
}
