package myPackage;

import java.util.Scanner;

public class Product 
{
	//Variable Declaration
			public int id, price;
			public String name;
			
			public Product()
			{
				id=0;
				name=null;
				price=0;
		
			}
			
	public void ReadData()
	{
		//Read data from user
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter Product Id");
		id= Integer.parseInt(obj.nextLine());
		System.out.println("Enter Product Name");
		name=obj.nextLine();
		System.out.println("Enter Price");
		price = Integer.parseInt(obj.nextLine());
	}
	public void PrintData()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
}