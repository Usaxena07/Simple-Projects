package myPackage;

abstract class Salary
{
	public int getHRA(int basic)
	{
		return 40*basic/100;
	}
	public int getPF(int basic)
	{
		return 12*basic/100;
	}
	public abstract int getCA();
	public abstract int getSA();
}

class Accenture extends Salary
{
	@Override
	public int getCA()
	{
		return 8000;
	}

	@Override
	public int getSA() 
	{
		return 15000;
	}	
	
}

class Microsoft extends Salary
{

	@Override
	public int getCA() 
	{
		return 10000;
	}

	@Override
	public int getSA() 
	{
		return 25000;
	}
	
}


public class Myclass 
{
	
	public static void main(String[] args) 
	{
		Accenture a = new Accenture ();
		System.out.println(a.getSA());
		
		Microsoft m = new Microsoft ();
		System.out.println(m.getSA());
	}

}
