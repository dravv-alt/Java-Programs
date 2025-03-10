import java.lang.*;
import java.util.*;
class Q2
{
	public static void main(String args[])
	{
		System.out.println("Enter 3 Numbers:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int c = sc.nextInt();
		int largest;
		if(a>b && a>c)
		{
		largest = a;
		System.out.println("Larger no. = "+largest);
		}
		if(b>a && b>c)
		{
		largest = b;
		System.out.println("Larger no. = "+largest);
		}
		if(c>a && c>b)
		{
		largest = c;
		System.out.println("Larger no. = "+largest);
		}
	}
}