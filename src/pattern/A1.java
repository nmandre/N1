package pattern;

public class A1 {

	public static void main(String[] args) 
	{
		
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j<=3)
				{
				System.out.print("*");
				}
				else
				{
					System.out.println();
					for(int a=1;a<=6;a++)
					{
						for(int h=1;h<=6;h++)
						{
							if(h<=3)
							{
							System.out.print(" ");
							}
							else if(h<=6)
							{	
								if(i==2)
								{
									for(int q=4;q<=6;q++)
									{
										System.out.print(q);
									}
									break;
								}
								else
								{
									System.out.print(a);
									a++;
								}
							
							}
						}
						break;	
					}
					break;
				}
			}
			System.out.println();
		}
	}
}
