package gan.javastruct;

public class Block1 
{
	static int i;
	int j;
	static
	{
		int i=10;
		System.out.println("static block");
	}
	public Block1() {
		System.out.println("constructor block");
	}
	public static void main(String[]args)
	{
	Block1 s = new Block1();
	Block1 s1 = new Block1();
}

}