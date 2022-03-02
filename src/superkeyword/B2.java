package superkeyword;


public class B2 extends B1
{
	int maxspeed=100;
	{
		System.out.println("max speed is =" +super.maxspeed);
	}
	public static void main(String[] args) {
		B2 b = new B2();
	}
}







//both base class and subclass have a variable maxSpeed. 
//We could access maxSpeed of parent class in child class using super keyword.


	