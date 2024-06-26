import java.util.Scanner;
class Test
{
	public static void main(String args[]){
     int year;
     String y;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
	year=sc.nextInt();
           y=(year%4==0)?" It is Leap year":"It is Not Leap year";
System.out.println(y);
 }  
}