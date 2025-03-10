import java.lang.*;
import java.util.*;

class Q7char
{
	public static void main(String args[]) 
	{
        	int i, j;
        	char ch = 'A';
		for (i = 1; i <= 4; i++)	
		{
        		for (j = 4; j > i; j--)
		 	{
                	System.out.print("  ");
            		}
			char temp = ch;
            		for (j = 1; j <= i; j++) 
			{
                	System.out.print(temp-- + " ");
			}
            		ch += (i + 1);
            		System.out.println();
        	}
    	}
}
