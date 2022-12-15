class R7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		}
		catch (ArithmeticException ex)
		{
			try
			{
			}
			catch (ArithmeticException ex1)
			{
			}
		}
		System.out.println("main end");
	}
}
