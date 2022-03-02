package gan.javastruct;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) 
	{
		int year;
		System.out.println("enter the year ");
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		if(year%400==0)
		{
			System.out.println("entered year is a leap year="+year);
	}
	else if(year%100==0)
		
	{
		System.out.println("entered year is not a leap year="+year);
	
}
else if(year%4==0)
{
	System.out.println("entered year is  a leap year ="+year);
}
else {
	System.out.println("entered year is not a leap year ="+year);
}
	}
}


	

		
