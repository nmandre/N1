package superkeyword;


public class A2 extends A1
{
	public A2()
	{
		super();
		System.out.println("b of const");
	}
	int a=20;
	int b=20;
	public void m1()
	{
		System.out.println(super.a);
	}
	public void m2()
	{
		System.out.println("m2 of B");
	}
}