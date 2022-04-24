package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File ("E:\\JAVA Full Stack\\My Files\\Score.txt");
		FileReader fr = new FileReader (f);
		
		int i = fr.read();
				
		while(i!=-1)
		{
			System.out.print((char) i);
			i=fr.read();
		}
		fr.close();	
	}

}
