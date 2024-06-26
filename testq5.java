interface stud{
        String name="avinash";
        int rollno=68;
}
 class Sample implements stud{
    public void name(){
 System.out.println("Name: Avinash");
}
 public void rollno(){
  System.out.println("Roll No:68");
}
 }
 class Test{
   public static void main(String args[]){
 
 Sample s1=new Sample();
  s1.name();
  s1.rollno();
 } 
}