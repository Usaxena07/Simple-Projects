package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		String name;
		int score=0, ans ;
		
		Scanner obj = new Scanner (System.in);
		
		//Read Data from User
		System.out.println("Enter your name");
		name = obj.nextLine();
		
		System.out.println("Hi,"+name+" ,Welcome to Quiz");
		System.out.println("*******************************************");
		System.out.println("Q1. Rainbow consist of how many colours?");
		System.out.println("1.Seven  2.Nine  3.Five");
		System.out.println("Enter your Choise");
		ans=obj.nextInt();
		
		if (ans==1)
			score+=20;
		
		System.out.println("Q2. how many months are there in a calander year?");
		System.out.println("1.Seven  2.Nine  3.Twelve");
		System.out.println("Enter your Choise");
		ans=obj.nextInt();
		
		if (ans==3)
			score+=20;
		
		System.out.println("Q3. National animal of India?");
		System.out.println("1.Tiger  2.lion  3.Elephant");
		System.out.println("Enter your Choise");
		ans=obj.nextInt();
		
		if (ans==1)
			score+=20;
		
		System.out.println("Q4. National bird of India?");
		System.out.println("1.Peacock  2.Parrot  3.Piegion");
		System.out.println("Enter your Choise");
		ans=obj.nextInt();
		
		if (ans==1)
			score+=20;
		
		System.out.println("Q5. National Flower of India?");
		System.out.println("1.Rose  2.Marigold  3.Lotus");
		System.out.println("Enter your Choise");
		ans=obj.nextInt();
		
		if (ans==3)
			score+=20;
		
		if (score>=60)
			System.out.println("Hi "+name+", You are passs with"+score);
		else
			System.out.println("Sorry, "+name+", you got only "+score);
		
		obj.next();
		
	}
	

}
