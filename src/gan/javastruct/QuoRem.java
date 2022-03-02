package gan.javastruct;

public class QuoRem
{
	public void S()
	{
		int x=25;
		int y=4;
		int q=x/y;
		System.out.println("Quotient of two numbers= "+q);
		int r=x%y;
		System.out.println("remainder of two numbers= "+r);
	}
	public static void main(String[]argStrings)
	{
		QuoRem q=new QuoRem();
		q.S();
	}
}