package myPackage;

import java.util.Scanner;

interface IShape
{
	int getArea();
	int getPerimeter();
}

class Circle implements IShape
{
	int r;
	public int getR()
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter radius");
		return r = obj.nextInt();
	}
	@Override
	public int getArea() 
	{
		return 22*r*r/7;
	}
	@Override
	public int getPerimeter() 
	{
		return 2*r*22/7;
	}
}

class Square implements IShape
{
	int a;
	public int getA()
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter Side of Square");
		return a = obj.nextInt();
	}
	
	@Override
	public int getArea() 
	{
		return a*a;
	}

	@Override
	public int getPerimeter() 
	{
		return 4*a;
	}
	
}

public class Myclass 
{

	public static void main(String[] args) 
	{
		Circle C = new Circle ();
		System.out.println(C.getR());
		System.out.println(C.getArea());
		
		Square S = new Square ();
		System.out.println(S.getA());
		System.out.println(S.getPerimeter());
	}

}
