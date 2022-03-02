package thiskeyword;

public class F1 
{
	public void m1()
	{
		System.out.println("Hello");
	}
	public F1 display()
	{
		return this;
	}
	public static void main(String[] args) {
		F1 f = new F1();
		F1 f1 = f.display();
		f1.m1();
	}
}



//where we want to return current object from a method then we can use this