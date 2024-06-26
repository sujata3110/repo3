import java.util.*;
class Student{
          public void show(){
    System.out.println("Student information");  
}
 }
 class Result extends Student {
    public void display(){
int per, total;
  total=cpp+se+ed+ca+php;
  per=total/5;
System.out.println("Enter the Total" +total);
 System.out.println("Enter the percentage" +per);
}  
 }
class Test{
 public static void main(String args[]){
    
 int cpp,se,ed,ca,php;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the Subject Mark");
cpp=sc.nextInt();
System.out.println("Enter the Subject Mark");
se=sc.nextInt();
System.out.println("Enter the Subject Mark");
ed=sc.nextInt();
System.out.println("Enter the Subject Mark");
ca=sc.nextInt();
System.out.println("Enter the Subject Mark");
php=sc.nextInt();

          Result r1=new Result();
  r1.show();
    Scanner sc=new Scanner (System.in);
  r1.display();
  }
}