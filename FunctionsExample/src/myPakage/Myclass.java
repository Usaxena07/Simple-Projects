package myPakage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int n, fact=1;
		
		//Read data from user
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter the number");
		n = obj.nextInt();
		
		for (int i=1;i<=n;i++)
			fact=fact*i;
		
		System.out.println("Factorial of "+n+" = "+fact);

	}

}
