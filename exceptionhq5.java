import java.util.*;
class Test{
  public static void main(String args[]){
    int age;
 Scanner sc=new Scanner(System.in);
       		System.out.println("Enter the age");
age=sc.nextInt();

try{
 if(age>=18){
 System.out.println("preson is eligible to vote!!");
}
}
catch(Exception e){
 System.out.print("Exception Handled");
}
 finally{
 System.out.println("Let the value be 19");
}
 }
}