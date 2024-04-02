import java.util.*;
class palindrom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int reverse=0;
		int remainder,temp;
		System.out.println("Enter number to check ");
		int n=sc.nextInt();
		temp=n;

		while(n!=0)
		{ remainder=n%10;
		  reverse=reverse*10+remainder;
		  n=n/10;
	   }
	   if(reverse==temp)
	   {System.out.println("Number is palindrome");
       }
       else
       System.out.println("Number is not palindrom");

}
}