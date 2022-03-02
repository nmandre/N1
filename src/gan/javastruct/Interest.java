package gan.javastruct;

import java.util.DoubleSummaryStatistics;

public class Interest 
{
	public void A()
	{
		float p=10,n=8,r=(float) 5.3,SI;
		SI=(p*n*r)/100;
		System.out.println("simple interest = "+SI);
	}
	public static void main(String[]args)
	{
		
		Interest i= new Interest();
		i.A();
	}
}