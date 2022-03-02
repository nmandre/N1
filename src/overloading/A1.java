package overloading;

public class A1 
{
	public void sum(int a,int b)
	{
		System.out.println("sum of numbers= "+(a+b));
	}
	public void sum(float x,float y)
	{
		System.out.println("sum is = "+(x+y));
	}
	public static void main(String[] args) {
		A1 a = new A1();
		a.sum(5, 10);
		a.sum(10.3f, 12.5f);
	}
}



//methods with same name but different types of parameters