import java.util.*;
import java.lang.*;

	class Test{
 public static void main(String args[]){
      
	String regex="[aeiouAEIOU]";
	String z="WELCOME";
      z=z.replaceAll(regex," ");
 
 System.out.println(z);
   }
}