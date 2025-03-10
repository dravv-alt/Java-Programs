import java.lang.*;
import java.util.*;

class Array1
{
	public static void main(String args[])
	{
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers of elements for the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for(int i = 0; i<n; i++)
		{
		arr[i] = sc.nextInt();
		sum = sum + arr[i];
		}
		for(int i=0; i<n;i++)
		{
		arr[i] = sum - arr[i];
		}
		System.out.println("Output is: "+Arrays.toString(arr));
	}
}