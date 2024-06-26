import java.util.*;
import java.lang.*;

	class Test{
 public static void main(String args[]){
       
	String regex="[aeiouAEIOU]";
	String z;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string");
z=sc.nextLine();
   for(int i=0;i<=z.length();i++)
{
 
      z=z.replaceAll(regex," ");
 }
 System.out.println(z);
   }
}