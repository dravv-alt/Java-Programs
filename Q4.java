import java.lang.*;
import java.util.*;
class Q4
{
	public static void main(String args[])
	{
	while(true){
		System.out.println("There are six operations:");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Remainder 6.Exit");
		System.out.println("Enter the operation no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>6){
		System.out.println("Enter a valid number.");
		continue;
		}
		if(n<0){
		System.out.println("Enter a valid number.");
		continue;
		}
		if(n==6){
		System.out.println("Program exited. Thank you!");
		break;
		}
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		switch(n){
			case 1:
					System.out.println("Addition is: "+(a+b));
					break;
			case 2:
					System.out.println("Subtraction is: "+(a-b));
					break;
			case 3:
					System.out.println("Multiplication is: "+(a*b));
					break;
			case 4:
					System.out.println("Divsion is: "+(a/b));
					break;
			case 5:
					System.out.println("Remainder is: "+(a%b));
					break;
			case 6:
					System.exit(0);
				}
			}
	}
}			