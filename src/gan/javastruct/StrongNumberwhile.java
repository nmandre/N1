package gan.javastruct;



public class StrongNumberwhile {

	public static void main(String[] args) 
	{
		int i,Factorial=1;
		int Temp, Reminder;
		int Sum = 0;
		int n=145;
		System.out.println("entered number is "+n);  //145
		Temp = n;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		System.out.println("Sum of factorial of given number "+n+"="+Sum);
		if(n==Sum)
		{
			System.out.println("given number is strong number ");
		}
		else {
			System.out.println("given number is not strong number ");
			
		}
	}
}
		
	