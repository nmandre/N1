package pattern;

import java.util.Scanner;

public class Pattern19 
{
	public static void main(String[] args) 
	{
		int rows,cols;
		System.out.println("enter number of rows= ");
		Scanner s = new Scanner(System.in);
		rows=s.nextInt();
		System.out.println("enter number of columns= ");
		Scanner s1 = new Scanner(System.in);
		cols=s.nextInt();
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=cols;j++)
			if(j%2==0)
			{
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
		System.out.println(" ");
	}
	}
}