package myPackage;

import java.util.Scanner;

public class MyClass
{

	public static void main(String[] args)
	{
		//Variable Declaration
		Scanner obj = new Scanner (System.in);
		
		String name;
		float salary;
		int age;
		
		//Read data from user
		System.out.println("Enter your name");
		name = obj.nextLine();
		
		System.out.println("Enter your Salary");
		salary = obj.nextFloat();
		
		System.out.println("Enter your age");
		age = obj.nextInt();
		
		System.out.println("Name ="+name);
		System.out.println("age ="+age);
		System.out.println("salary ="+salary);
		
		
	}

}
