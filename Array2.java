import java.lang.*;
import java.util.*;

class Array2
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int n = sc.nextInt();
	
	int i,j;
	int [][]std = new int[n]	[5];
	int []max = new int[5];
	
	System.out.println("Enter " +n+ "student exam record");
	for( i =0; i<std.length; i++)
	{
		int total = 0;
		System.out.print("Enter the student" +(i+1)+ "Roll no. and marks of 3 subjects");
		for( j=0; j<4 ; j++)
		{
			std[i][j] = sc.nextInt();
			if(j!=0)
			{
			total =total + std[i][j] ; 
			}
		}
		std[i][j] = total;
		max[i] = total;
	}
	System.out.println();
	
 	System.out.println("Roll No.s \tSubject 1\tSubject 2\tSubject 3\t Total Marks");
	for( i=0; i<std.length ; i++)
		{
			for( j = 0; j<5 ; j++)
			{
				System.out.print(std[i][j] + "\t\t");
			}
			System.out.println();
		}
		
		int maxMarks = 0;
		int r = 0;
		for( i = 0; i<max.length ; i++)
		{
			if(max[i]>maxMarks)
			{
				maxMarks = max[i];
				r = i; 
			}
		}
	System.out.println("record of student who have maximum marks:");
	System.out.println("RollNo \tSubject 1\tSubject 2\t Subject 3\t Total Marks");
	for(j = 0 ; j<5; j++)
	{
	System.out.print(std[r][j] + "\t\t");
	}
	}
}