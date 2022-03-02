package gan.javastruct;


public class Cons
{
	String name;
	int rollno;
	public Cons(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String[]args)
	{
		Cons c1 = new Cons("Neha", 72);
		Cons c2 = new Cons("Priya", 73);
		System.out.println(c1.name +    + c1.rollno);
		System.out.println(c2.name +     +c2.rollno);
	}
	}