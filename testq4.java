interface  A{
 String name ="java";
}
class Sample1 implements A{
  public void getName(){
System.out.println("Programming language is java");
 }
}
 class Test{
 public static void main(String args[]){
    Sample1 obj=new Sample1();
 obj.getName();
 }
}
