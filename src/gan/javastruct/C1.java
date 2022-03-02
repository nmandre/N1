package gan.javastruct;

public class C1 
{
	public C1(int d)
	{
		System.out.println(d+" Hello");
	}
	public void m(int j)
	{
		System.out.println(j);
	}
	public static void main(String[]args)
	{
		System.out.println("in main");
		C1 f=new C1(6);
		f.m(10);
		System.out.println("out main");
	}
}


	


