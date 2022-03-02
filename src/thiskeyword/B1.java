package thiskeyword;

public class B1 
{
	B1()
	{
		this(5);
		System.out.println("stars");
	}

	public B1(int i) 
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		B1 b = new B1();
	}
}
	//Calling parameterized constructor from default constructor:
