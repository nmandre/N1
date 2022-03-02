package superkeyword;

public class C2 extends C1
{
	C2()
	{
		super();
		System.out.println("C2 of constructor");
	}
	public static void main(String[] args) 
	{
		C2 c = new C2();
	}
}





//we have called the parent class constructor using keyword ‘super’ via child class constructor.