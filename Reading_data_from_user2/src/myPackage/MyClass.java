package myPackage;

import java.util.Scanner;

public class MyClass
{

	public static void main(String[] args) 
	{
		//variable declaration
		String name;
		float roll;
		int age;
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("enter your name");
		name = obj.nextLine();
		
		System.out.println("enter roll");
		roll = obj.nextFloat();
		
		System.out.println("enter age");
		age = obj.nextInt();
		
		System.out.println("name =" +name);
		System.out.println("roll =" +roll);
		System.out.println("age =" +age);

	}

}
