package gan.javastruct;


public class GanConstructor 
{
	public GanConstructor()  //name of class and constructor should be the same 
	{
		System.out.println("Hello");
	}
	public GanConstructor(int a)
	{
		System.out.println(a);
	}
	public GanConstructor(String c)
	{
		System.out.println(c);

	}
	public static void main(String[]args)
	{
	System.out.println("In main");
	GanConstructor g=new GanConstructor(42);
	GanConstructor h= new GanConstructor();
	GanConstructor i=new GanConstructor("Sai do study well");

	}
}


	
