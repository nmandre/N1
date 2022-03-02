package thiskeyword;

public class B 
{
	int rollno;
	float fee;
	String name;
	public B(int rollno,String name,float fee)
	{
		
	this.rollno=rollno;
	this.fee=fee;
	this.name=name;
	
	System.out.println(rollno+" "+name+" "+fee);
	}
	
	public static void main(String[] args) 
	
	{
		B b =new B(111,"neha",5000f);
		
		
	}
}


