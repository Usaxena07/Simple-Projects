package myPAckage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable declaration
		int n1, n2, fact1 = 1, fact2 = 1;
		
		//Read data from user
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number");
		n1= obj.nextInt();
		
		for (int i=1;i<=n1;i++)
			fact1=fact1*i;
		
		System.out.println("Enter the number");
		n2= obj.nextInt();
		
		for (int i=1;i<=n2;i++)
			fact2=fact2*i;
		
		System.out.println("Factorial of "+n1+" =" +fact1);
		System.out.println("Factorial of "+n2+" =" +fact2);
		
	}

}
