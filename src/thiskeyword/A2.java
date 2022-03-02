package thiskeyword;

public class A2 
{
	int i;
	public A2(int i)
	{
		this.i=i;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		A2 b =new A2(10);
		//due to this keyword global variable highlighted and output prints value of i is 10
	}
}

	