package gan.javastruct;

public class Test 
{
	String languages;
	protected Test(String lang) 
	{
		languages = lang;
		System.out.println(languages +  " is programing language");
	}
	public static void main(String[]args)
	{
		Test t1 = new Test("Java");
		Test t2 = new Test("C");
		Test t3 = new Test("Python");
		
	}
}