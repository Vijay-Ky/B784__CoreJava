class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			try
			{
				int i = 10 / 0;
			}
			catch (ArithmeticException ex)
			{
				System.out.println("ex");
			}
			System.out.println("----------");
			System.out.println("more code");
			System.out.println("try end");
		}
		catch (ArithmeticException ex1)
		{
			System.out.println("exception");
		}
		System.out.println("main end");
	}
}
