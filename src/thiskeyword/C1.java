package thiskeyword;


public class C1 
{
	Double width,height,depth;
	
	
		 C1(Double w,Double h,Double d)
		 {
			 this.width=w;
			 this.height=h;
			 this.depth=d;
		 }
		 public static void main(String[] args) 
		 {
			 C1 c = new C1(10.5,2.6,3.8);
			 System.out.println("width is= "+c.width);
			 System.out.println("height is= "+c.height);
			 System.out.println("depth is= "+c.depth);
		 }
}








//this to assign values of parameters to instance variables.