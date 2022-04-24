package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner obj = new Scanner (System.in);
		String Subject;
		System.out.println("Enter Subject Name");
		Subject=obj.nextLine();
		boolean isFound = false;
		
		File f = new File ("E:\\JAVA Full Stack\\My Files\\Score.txt");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		//Read first line
		String line = br.readLine();
	
		while(line!=null)
		{
			var data=line.split(",");
			if (data[0].equals(Subject))
			{
			System.out.println(data[1]);
			isFound=true;
			break;
			}
			line=br.readLine();
		}
		br.close();
		
		if (isFound==false)
			System.out.println("Subject not found");
	}
}	