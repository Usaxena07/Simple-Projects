package mypackage;

import java.util.ArrayList;

public class Myclass 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> data = new ArrayList<Integer> ();
		
		data.add(10);
		data.add(20);
		data.add(15);
		data.add(30);
		
		int sum = 0;
		
		for (int d:data)
		{
			sum = sum+d;
		}
		
		System.out.println(sum);
	}

}
