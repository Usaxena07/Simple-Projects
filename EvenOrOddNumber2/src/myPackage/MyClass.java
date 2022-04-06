package myPackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int input;
		String result;
		
		Scanner obj = new Scanner (System.in);
		
		//Read data from user
		System.out.println("Enter the number");
		input = obj.nextInt();
		
		//Logic
		
		result = (input%2==0)? "Even Number": "Odd Number";
		
		System.out.println(result);
		
	}

}
