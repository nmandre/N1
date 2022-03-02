package gan.javastruct;

public class Swap
{
	public void S()
	{
		int first =20;
		int second =10;
		System.out.println("Numbers before swap=");
		System.out.println("First number is= "+first);
		System.out.println("Second number is= "+second);
		int temporary= first;
		first =second;
		second=temporary;
		System.out.println("Numbers after swap= ");
		System.out.println("First number is= "+first);
		System.out.println("Second number is= "+second);
	}
	public static void main(String[]args)
	{
		Swap s=new Swap();
		s.S();
	}
}
		
		

		


	