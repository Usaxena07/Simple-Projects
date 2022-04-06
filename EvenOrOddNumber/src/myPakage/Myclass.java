package myPakage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int input;
		Scanner obj = new Scanner (System.in);
		
		//Read data from User
		System.out.println("Enter the number");
		input = obj.nextInt();
		
		//Logic
		if (input%2==0)
			System.out.println("This is even number");
		else
			System.out.println("This is odd number");
		
		obj.next();
		

	}

}
