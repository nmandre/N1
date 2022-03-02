package gan.javastruct;

public class Variable 
{
	int b;
	public void m1()
	{
		int a;
		b=10;
		System.out.println(b);
	}
	public void m2()
	{
		b=20;
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		Variable a=new Variable();
		a.m1();
		a.m2();
	}
}

