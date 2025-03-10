import java.lang.*;
import java.util.*;
class Q1
{
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==1)
		{
			System.out.println("Weird");
		}
		else{
			if(n>=2 && n<=5){
					System.out.println("Not weird");
						}
			else if(n>=6 && n<=20){
					System.out.println("Weird");
							}
			else if(n>20){
					System.out.println("Not Weird");
					}	
		}
	}
}



