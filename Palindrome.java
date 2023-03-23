//WAP to find a given number is Palindrome or Not with function argument & return.
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner A = new Scanner(System.in);
     System.out.println("Enter the number ");
     int n = A.nextInt();
     if(palindrome(n))
     {
    	 System.out.println(n+" is a palindrome number.");
     }
     else
     {
    	 System.out.println(n+" is not a palindrome number."); 
     }
     
	}
	static boolean palindrome(int a)
	{int sum=0,rem;
		int tem = a;
		while(a>0)
		{
			 rem = a%10;
			sum = sum*10+ rem;
			a/=10;
		}
		if(sum == tem)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
