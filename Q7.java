import java.lang.*;
import java.util.*;
class Q7
{
public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		System.out.println("The output is : ");
		for( i = 1; i <= n; i++)
		{
			if( i % 2==0)
			{
				for( j = i; j>= 1; j--)
				{
					System.out.print( j+ "\t");
				}
			}
			else{
				for( j = 1; j<= i; j++)
				{
					System.out.print( j+ "\t");
				}
			}
			System.out.println();
		}
	}
}