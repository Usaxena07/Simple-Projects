package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int input;
		int result=0;
		
		Scanner obj = new Scanner (System.in);
		
		//Read Data from User
		System.out.println("Enter the number");
		input=obj.nextInt();
		
		//Logic
		for (int i=1;i<=input;i++)
			{
			if (input%i==0)
				result++;
			}
		
		if (result==2)
			System.out.println("Prime Number");
		
		else
			System.out.println("Not Prime Number");
			
	}

}
