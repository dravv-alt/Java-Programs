import java.lang.*;
import java.util.*;
class Q2ternary
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
		int max = (a>b)?a:b;
		max = (max>c)?max:c;
		System.out.println("max = "+max);
	}
}