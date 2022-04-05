package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		String name;
		int score =0, ans ;
		
		//Read data from user
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your name");
		name = obj.nextLine();
		System.out.println("Welcome to Quiz");
		System.out.println("Q1. Taj Mahal is located in:");
		System.out.println("1.Delhi   2.Agra  3.Gwalior");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		if (ans==2)
			score+=20;
		
		System.out.println("Q2. Lal Quila is located in:");
		System.out.println("1.Delhi   2.Agra  3.Gwalior");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		if (ans==1)
			score+=20;
		
		System.out.println("Q3. Char Minar is located in:");
		System.out.println("1.Delhi   2.Agra  3.Hydrabad");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		if (ans==3)
			score+=20;
		
		System.out.println("Q4. Tansen Tomb is located in:");
		System.out.println("1.Delhi   2.Agra  3.Gwalior");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		if (ans==3)
			score+=20;
		
		System.out.println("Q5.Hauz Khas is located in:");
		System.out.println("1.Delhi   2.Agra  3.Gwalior");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		if (ans==1)
			score+=20;
		
		if (score>=60)
			System.out.println("Hi, "+name+", you are pass with "+score);
		else
			System.out.println("Sorry, "+name+",you got only "+score );
		
		obj.next();
		

	}

}
