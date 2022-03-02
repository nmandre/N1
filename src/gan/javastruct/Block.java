package gan.javastruct;

public class Block 
{
	static
	{
		System.out.println("static block");
	}
	public void m5()
	{
		System.out.println("method");
	}
	public Block()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("non static");
	}
	public static void main(String[]args)
	{
		Block a=new Block();
		a.m5();
	}
}
	