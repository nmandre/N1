package gan.javastruct;



public class Cons2
{
	int length,breadth;
	String color;
	
		public Cons2(int l,int b)
		{
			length = l;
			breadth = b;
			color = "Green";
		}
		public Cons2(int l, int b, String c)
		{
			length = l;
			breadth = b;
			color = c;
		}
		void display()
		{
			System.out.println("Length -" + length + " Breadth -" + breadth+ " Color-" + color);
		}
		public static void main(String[] args) 
		{
			Cons2 d = new Cons2(10, 30);
			Cons2 e = new Cons2(14, 40,"red");
			d.display();
			e.display();
		}
}
			
		

			

			
		