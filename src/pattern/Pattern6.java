package pattern;

public class Pattern6 
{
	public static void main(String[] args) 
	{
	int x=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.printf("%2d ",x);
			x++;
		}
		System.out.println(" ");
	}
	}
}
