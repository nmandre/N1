package thiskeyword;

public class E1 
{
	public void m1()
	{
		System.out.println("studytonight");
	}
	public void m2()
	{
		this.m1();
	}
	public static void main(String[] args) {
		E1 e = new E1();
		e.m2();
	}
}




//Accessing Method using this keyword