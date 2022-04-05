package myPackage;

import java.util.Scanner;

public class Myclass
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		String name;
		int score = 0, ans;
		
		Scanner obj = new Scanner (System.in);
		
		//Read data from user
		System.out.println("Enter your name");
		name = obj.nextLine();
		
		System.out.println("Hi, "+name+" Welcome to Quiz");
		System.out.println("*************************************");
		System.out.println("Q1. Captial of Australia ?");
		System.out.println("1.Canberra  2. England  3.Dhaka");
		System.out.println("Enter your choice");
		ans = obj.nextInt();
		
		
		if (ans==1)
		    score+=20;
		   
			System.out.println("Q2. Captial of India ?");
			System.out.println("1.Canberra  2. Delhi  3.Dhaka");
			System.out.println("Enter your choice");
			ans = obj.nextInt();
			
			
		if (ans==2)
			score+=20;
			
			System.out.println("Q3. Captial of Sri Lanka ?");
			System.out.println("1.Colombo  2. England  3.Dhaka");
			System.out.println("Enter your choice");
			ans = obj.nextInt();
			
			
		if (ans==1)
			score+=20;
			   	
			System.out.println("Q4. Captial of Ukrain ?");
			System.out.println("1.Colombo  2. Kyiv  3.Dhaka");
			System.out.println("Enter your choice");
			ans = obj.nextInt();
			
			
		if (ans==2)
			score+=20;	 
			
			System.out.println("Q5. Captial of Bangladesh ?");
			System.out.println("1.Colombo  2. England  3.Dhaka");
			System.out.println("Enter your choice");
			ans = obj.nextInt();
			
			
		if (ans==3)
			score+=20;	
			
		if (score>=60)
			
			System.out.println("Hi, "+name+" ,You are pass with "+score);
		else
			System.out.println("Sorry, "+name+",you got "+score);
			   
	}

}
