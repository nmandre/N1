package gan.javastruct;

public class PalindromeLoop {

	public static void main(String[] args) 
	{
		int number=121;
		int Remainder,Temp,Reverse=0;
		Temp=number;
		while(Temp>0)
		{
			Remainder = Temp %10;
		      Reverse = Reverse *10+ Remainder;
		       Temp = Temp /10;
		}
		System.out.println("Reversed number is = "+Reverse);
		if(number==Reverse)
			System.out.println("Number is palindrome= "+number);
		else {
			System.out.println("Number is not palindrome= "+number);
		}
	}
}

		