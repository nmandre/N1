package oops;

public class Seatheight extends Gear
{
	public void m3(int h)
	{
		
		int Seatheight = h;
		System.out.println("seat height is = "+Seatheight);
	}
	public static void main(String[] args) {
		Seatheight k = new Seatheight();
		k.m1(30);
		k.m2(3);
		k.m3(25);
	}
}