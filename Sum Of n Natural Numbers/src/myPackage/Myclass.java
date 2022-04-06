package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int input, sum=0;
		
		Scanner obj = new Scanner (System.in);
		
		//Read data from user
		System.out.println("Enter the number");
		input = obj.nextInt();
		
		//Sum of n Natural Numbers
		for (int i=1;i<=input;i++)
			sum+=i;
		
		System.out.println(sum);
		
	}

}
