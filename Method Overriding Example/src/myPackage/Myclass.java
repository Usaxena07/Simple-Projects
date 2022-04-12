package myPackage;

public class Myclass 
{

	class EnglishMessage
	{
		public void SayHi()
		{
			System.out.println("HI");
		}
		public void SayHlo()
		{
			System.out.println("Hello");
		}
		public void SayGM()
		{
			System.out.println("Good Morning");
		}
	}
	
	class HindiMessage extends EnglishMessage
	{
		@Override
		public void SayGM()
		{
			System.out.println("Shubhodaya");
		}
	}
	
	public static void main(String[] args) 
	{
		
	}

}
