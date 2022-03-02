package gan.javastruct;


public class Dsc
{

	public static void main(String[] args) 
	{
		char ch = 0  ;

		System.out.print("enter the value = ");
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

       } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");
		}
		else {
			System.out.println(ch + " is A SPECIAL CHARACTER.");
		}
	}
}
		