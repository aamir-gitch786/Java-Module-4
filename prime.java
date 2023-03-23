//WAP to find a given number is Prime or Not with function argument & return.
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = ip.nextInt();
		
		if(Prime_number(n))
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" is not a prime number .");
		}
		

	}
	static boolean Prime_number(int a)
	{ int i;
		for( i = 2 ;i<a;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(i==a)
			return true;
		else
			return false;
	}

}
