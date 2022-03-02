package gan.javastruct;


public class Cons1 
{
	private int var;
		public Cons1()
		{
			this.var=10;
		}
		public Cons1(int a)
		{
			this.var = a;
		}
		
		public static void main(String[] args) {
			Cons1 e = new Cons1();
			Cons1 h = new Cons1(20);
			System.out.println("the var is = "+ e.var);
			System.out.println("the var is = "+h.var);
		}
}
			
		