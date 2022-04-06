package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int i, input;
		
		Scanner obj = new Scanner (System.in);
		
		//Read data from user
		System.out.println("Enter the number");
		input = obj.nextInt();
		
		//Logic
		for (i=2;i<input;i++)
		{
			if (input%i==0)
				break ;
		}
		 
		if (i==input)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}

}
