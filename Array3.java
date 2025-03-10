import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n; 

		System.out.println("Enter the Number of Rows in the pattern: ");
		n = sc.nextInt();
		
		int [][]p = new int[n][];

		for(int i =0;i<n ; i++)
		{
			p[i] = new int[i+1];
		}
		for(int i =0; i<p.length; i++)
		{
			for(int j =0 ; j < p[i].length; j++)
			{	
				p[i][j] = j+1;
			}
		}
		System.out.println();
		System.out.println("The pattern is:");
		for(int i =0 ; i<p.length; i++)
		{
			for(int j = 0; j < p[i].length ; j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
}
