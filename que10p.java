import java.util.*;
	 class Test{
  public static void main(String args[]){
		int n,r,temp,sum=0;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
n=sc.nextInt();
	temp=n;
		while(n>0){
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
      }
if(temp==sum)
{
System.out.println("It is Palindrome number");
}
else
{
System.out.println("Is not Palindrome number");
}
  }
}

