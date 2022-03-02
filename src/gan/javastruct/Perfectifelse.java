package gan.javastruct;

public class Perfectifelse {

	public static void main(String[] args)
	{
		int i,n=6;
		int sum=0;
		System.out.println("entered number is = "+n);
		for(i=1;i<n;i++)
			if(n%i==0)
			{
				sum=sum+i;
			}
		if(sum==n)
			System.out.println("entered number is perfect ");
		else {
			System.out.println("entered number is not perfect ");
		}
	}
}

		

		
	
		
	
