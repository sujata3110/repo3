class Employee{
 void display(){
 System.out.println("Employee Salary is 40000");
  }
}
  class Bonus extends Employee{
  void show(){
 System.out.println("Bonus: 10000");
  }
}
 class Test{
 public static void main(String args[]){
   Bonus obj1= new Bonus();
   obj1.display();
  obj1.show();
 }
}