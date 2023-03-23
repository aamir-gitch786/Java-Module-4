//WAP to find a Factorial of a given number with function argument & return.
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner a = new Scanner(System.in);
   int n;
   System.out.println("Enter the number.");
   n = a.nextInt();
   System.out.println("Factorial of "+n+" is : "+factorial(n));
	}
static int factorial(int number)
   {int result =1;
	if(number==0)
		return 1;
	else
	{
		for(int i=1;i<=number;i++)
		{
			result*=i;
		}
	}
	return result;
   }
}
