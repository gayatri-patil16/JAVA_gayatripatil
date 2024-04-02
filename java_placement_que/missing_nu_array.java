import java.util.*;
class missing_nu_array
{
	public static void main(String args[])
	{    Scanner sc=new Scanner(System.in);
		int [] array={10,20,30,50,60,70,80,90};
		System.out.println("Enter number to check");
		int n=sc.nextInt();

         int i;
		for( i=0;i<array.length;i++){
			if(array[i]==n)
			{
				System.out.println("Number found");
				break;
		    }


		}
		if(i==array.length)
		System.out.println("Not found "+n+" is missing in the array");
	}
}
