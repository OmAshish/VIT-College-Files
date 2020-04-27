import java.util.*;
abstract class Employee
{
	String Employee_name;
	int Employee_ID;
	double pay;
	int years;
		
}


public class Developer extends Employee
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees ");
		int n = sc.nextInt();
		String incremented[] = new String[n];
		int c=0;
		Developer Java_Developer[] = new Developer[n];
		for(int i=0;i<n;i++)
		{
			Java_Developer[i] = new Developer();
			sc.nextLine();
			System.out.println("Enter Employee Name");
			Java_Developer[i].Employee_name = sc.nextLine();
			System.out.println("Enter ID");
			//sc.nextLine();
			Java_Developer[i].Employee_ID = sc.nextInt();
			System.out.println("Enter pay");
			Java_Developer[i].pay = sc.nextDouble();
			System.out.println("Enter Years of exp");
			Java_Developer[i].years = sc.nextInt();
			if(Java_Developer[i].years>5)
			{
				Java_Developer[i].pay += 10000;
				incremented[c] = Java_Developer[i].Employee_name ;
				c+=1;
			}
		}
		System.out.println("The people whose pay got incremented are: ");
		for(int i=0;i<c;i++)
			System.out.println(incremented[i]);
		
		
	}

}
