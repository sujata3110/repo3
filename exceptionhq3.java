class Test{
  public static void main(String args[]){
    int i=17;
try{
 System.out.println("Number is:"+i);
}
catch(Exception e){
 System.out.print(e);
}
 finally{
 System.out.println("i executed always");
}
 }
}