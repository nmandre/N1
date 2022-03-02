package gan.javastruct;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Examples 
{
	private static Examples e;
	private int Sum;
	public void C1()
	{
		int x,y;
		System.out.println("enter the first number =");
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		System.out.println("enter the second number =");
		Scanner s1= new Scanner(System.in);
		y=s1.nextInt();
		Sum = x+y;
		System.out.println("Sum of two numbers="+Sum);
	}
	public static void main(String[]args)
	{
		Examples.e= new Examples();
		e.C1();
	}
}
		
	


