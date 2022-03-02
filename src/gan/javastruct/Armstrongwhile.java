package gan.javastruct;

import java.util.Scanner;

public class Armstrongwhile {

	public static void main(String[] args) 
	{
		int n;
		int sum=0;
		int r, temp;
		System.out.println("Entered number is=  ");
		Scanner s1 = new Scanner(System.in);
		n = s1.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("number is armstrong");
		else 
			System.out.println("number is not armstrong");
	}
}

			
		
