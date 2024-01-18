public class ForLoop
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		int c = 2;
		
		System.out.println("For loop met 3 ints:");
		
		for(int i = 0; i < 7; i++)
		{
			a = a + 1;
			b = b + 1;
			c = c + 1;
			
			System.out.println(a + " " + b + " " + c);
		}
		
		System.out.println("\nFor loop met zonder int");
		for(int i = 0; i < 7; i++)
		{			
			System.out.println((i + 1) + " " + (i + 2) + " " + (i + 3));
		}
	}
}