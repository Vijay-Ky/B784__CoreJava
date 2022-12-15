class D 
{
	public static void main(String[] args) 
	{
		int i = 10;
		try
		{
			System.out.println("try begin");
			i = 10 / 0;
			System.out.println("try end");
	
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			try
			{
				i = 10 / 0;
			}
			catch (ArithmeticException ex1)
			{
			}
			
			System.out.println("catch end");
		}

		System.out.println("main end");
	}
}
