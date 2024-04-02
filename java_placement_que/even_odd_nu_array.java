import java.util.*;
class even_odd_nu_array
{
	public static void main(String[]args)
	{
		int[] num={35,58,765,68,54,3,53,71,94};
		int even=0;
		int odd=0;
		int i;
		for(i=0;i<num.length;i++)
		{ if(num[i]%2==0)
		  { even=even+1;
	      }
	      else{
			  odd++;
			  }
        }

        System.out.println("Even numbers="+even);
        System.out.println("Odd numbers="+odd);

	}

}
