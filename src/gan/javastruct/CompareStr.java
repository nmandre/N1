package gan.javastruct;

public class CompareStr 
{
	public static void main(String[]args)
	{
		String a = "JAVA";
		String b = "Java";
		String c = "JAVA";
		String d = "Phython";
		String e = "Selenium";
		
		System.out.println(a.contains(c));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.equals(e));
	}
}