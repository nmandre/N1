package overloading;

public class A3 
{
	int i;
	A3()
	
	{
		System.out.println("flowers");
	}
	A3(int i)
	{
		this();
		System.out.println(i);
	}
	public static void main(String[] args) {
		A3 a = new A3();
		
	}
}





//Constructor overloading