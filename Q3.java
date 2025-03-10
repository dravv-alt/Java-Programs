import java.lang.*;
import java.util.*;
class Q3
{
	public static void main(String args[])
	{
		int no = Integer.parseInt(args[0]);
		int i,count=0;
		while(no!=0)
		{
			i=no/10;
			count++;
			no = i;
		}
		System.out.println("No.of digits is "+count);
	}
}