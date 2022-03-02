package gan.javastruct;

import java.util.function.BiConsumer;

public class Examples2 
{
	
	private static Examples2 e;
	private int sub1;
	public void C1()
	{
		int x=10;
		int y=5;
		sub1 = x-y;
		
		System.out.println("Subtraction of two numbers-"+sub1);
	}
	public static void main(String[]args)
	{
		Examples2.e= new Examples2();
		e.C1();
	}
		
	}