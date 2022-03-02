package thiskeyword;

public class B2 
{
	B2()
	{
		System.out.println("Priya");
	}
	public B2(int i)
	{
		this();
		System.out.println(i);
	}

	public static void main(String[] args)
{
		B2 b =new B2(10);

	}

}
//Calling default constructor from parameterized constructor:

