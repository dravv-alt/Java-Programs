import java.lang.*;
import java.util.*;
class Q5
{
	public static void main(String args[])
	{
		System.out.println("Enter your marks:");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(90<marks && marks<=100){
		System.out.println(" Grade : A+ ");
						}
		else if(80<marks && marks<=90){
		System.out.println(" Grade : A ");
						}
		else if(70<marks && marks<=80){
		System.out.println(" Grade : B+ ");
						}
		else if(60<marks && marks<=70){
		System.out.println(" Grade : B ");
						}
		else if(50<marks && marks<=60){
		System.out.println(" Grade : C+ ");
						}
		else if(40<marks && marks<=50){
		System.out.println(" Grade : C ");
						}
		else if(marks<40){
		System.out.println(" Fail ");
					}
		else{
		System.out.println("Invalid Marks");
			}
	}
}
		
				
