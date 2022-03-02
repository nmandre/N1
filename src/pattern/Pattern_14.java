package pattern;


import java.util.Scanner;

public class Pattern_14 
{
	public static void main(String[] args) 
	{
		int n,k;
		System.out.println("enter number of rows= ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		k=(n-i)+1;
		for(int j=1;j<=n;j++)
		{
			System.out.printf("%3d",k);
			k=k+n;
		}
		System.out.println(" ");
	}
	}
}