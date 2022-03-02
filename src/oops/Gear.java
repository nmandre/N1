package oops;

public class Gear extends Bycycle
{
	public void m2(int i)
	{
		int gear=i;
		System.out.println("Gears of bicycle are = "+gear);
	}
	public static void main(String[] args) {
		Gear k = new Gear();
		k.m1(30);
		k.m2(3);
	}
}
	