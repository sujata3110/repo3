class Test{
public static void main(String args[]){
        String z="This is java language";
System.out.println(z);
  String s1=removespace(z);
System.out.println(s1);
            if(z==null){
return null;
}
 return z.replaceAll("","");
}
}