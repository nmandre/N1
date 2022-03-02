package thiskeyword;

public class A1 
{
	public void m1()
	{
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		A1 a = new A1();
		//System.out.println(a);
		//this keyword gives unique id in output
		a.m1();
		
	}
}

