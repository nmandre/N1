package gan.javastruct;

import java.util.Scanner;

public class Swapwithoutthird {

	public static void main(String[] args) 
	{
		int first,second;
		System.out.print("enter first number= ");
		Scanner s = new Scanner(System.in);
		first = s.nextInt();
		System.out.print("enter second number= ");
		Scanner s1 = new Scanner(System.in);
		second = s1.nextInt();
		System.out.println("Numbers before swap");
		System.out.println("First number is= "+first);
		System.out.println("Second number is= "+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("Numbers after swap ");
		System.out.println("First number is= "+first);
		System.out.println("Second number is= "+second);
		
	}
	}