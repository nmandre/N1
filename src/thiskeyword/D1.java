package thiskeyword;

public class D1 
{
	D1()
	{
		this("Study tonight");
	}
	D1(String s)
	{
		System.err.println(s);
	}
	public static void main(String[] args) {
		D1 d = new D1();
	}
}
		





//we are calling a parameterized constructor from the 
//non-parameterized constructor using the this keyword along with argument.
	