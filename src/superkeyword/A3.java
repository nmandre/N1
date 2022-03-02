package superkeyword;


public class A3 extends A2
{
	public A3()
	{
		super();
		System.out.println("c of const");
	}
	public void m4()
	{
		System.out.println("m4 of Super3");
	}
	public static void main(String[] args) 
	{
		A2 c = new A2();
		//A3 i = new A3();
		c.m1();
		System.out.println(c.b);
	}
}

		
	