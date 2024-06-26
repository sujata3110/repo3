class Animal{
  void show(){
   System.out.println("The sound animal");
  }
}
 class Animal1 extends Animal{
    void show(){
   System.out.println("The sound animal is Cat");
   }
 }
class Animal2 extends Animal{
 void show(){
 System.out.println("The sound animal is Dog");
}
}
 class Test{
   public static void main(String args[]){
 Animal1 a1=new Animal1();
 a1.show();
 Animal2 a2=new Animal2();
 a2.show();
  } 
}