import java.lang.*;
import java.util.*;
class Q6
{
	public static void main(String args[])
	{	
		int i;
		double sum=0.0;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i =1; i<=n; i++)
		{
			sum = sum + 1 / (double)(i*i);
		}
		System.out.println("Sum of the series is: "+sum);
	}
}