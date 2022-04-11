package myPackage;

import java.util.Scanner;

public class Employee 
{
	//Variable Declaration
	public int id, salary;
	public String name;
	
	//Read data from user
	public void ReadData()
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter id");
		id= Integer.parseInt(obj.nextLine());
		System.out.println("Enter name");
		name= obj.nextLine();
		System.out.println("Enter Salary");
		salary = Integer.parseInt(obj.nextLine());
	}
	//Print data from user
	public void PrintData()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
	}
}
