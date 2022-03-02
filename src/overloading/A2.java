package overloading;

public class A2 
{
	public void multiply(int l,int b)
	{
		System.out.println("result is = "+l*b);
	}
	public void multiply(int l, int b, int h)
	{
		System.out.println("resut is = "+l*b*h);
	}
	public static void main(String[] args) {
		A2 a= new A2();
		a.multiply(10, 6);
		a.multiply(5, 7, 10);
	}
		
	}







//the multiply() method is overloaded twice. 
//The first method takes two arguments and the second method takes three arguments.
//Method overloading by changing no. of argument.
