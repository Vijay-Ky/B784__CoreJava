class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
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
			 i = 10 / 0;
			System.out.println("catch end");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
